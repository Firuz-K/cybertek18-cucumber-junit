package com.cybertek.step_definitions;

import com.cybertek.pages.SmartBear;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class smartBearOrder {

    SmartBear smartBear = new SmartBear();





    @Then("User selects FamilyAlbum from product dropdown")
    public void user_selects_family_album_from_product_dropdown4_user_enters() {
        Select dropdown = new Select(smartBear.productDropdown);
        dropdown.selectByIndex(1);
    }

    @Then("User enters to quantity")
    public void to_quantity() {
        smartBear.quantityBox.sendKeys(Keys.BACK_SPACE);
        smartBear.quantityBox.sendKeys("5");
    }

    @Then("User enters John Wick to costumer name")
    public void user_enters_john_wick_to_costumer_name() {

        smartBear.NameBox.sendKeys("John Wick");
    }

    @Then("User enters Kinzie Ave to street")
    public void user_enters_kinzie_ave_to_street() {

        smartBear.streetBox.sendKeys("Kinzie Ave");
    }

    @Then("User enters Chicago to city")
    public void user_enters_chicago_to_city() {

        smartBear.cityBox.sendKeys("Chicago");
    }

    @Then("User enters IL to state")
    public void user_enters_il_to_state() {

        smartBear.stateBox.sendKeys("IL");
    }

    @Then("User enters {string}")
    public void userEnters(String arg0) {
        smartBear.zipBox.sendKeys(arg0);
    }




    @Then("User enters expiration date")
    public void user_enters_to_expiration_date() {

        smartBear.expirationDateBox.sendKeys("12/22");

    }

    @Then("User enters {string} to expiration date")
    public void userEntersToExpirationDate(String expirationDate) {
        smartBear.expirationDateBox.sendKeys(expirationDate);
    }





    // Parameterized methods












    //TC 27 Scenario Outline Practice

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        smartBear.userNameBox.sendKeys(ConfigurationReader.getProperty("smartBearUsername"));
        smartBear.passwordBox.sendKeys(ConfigurationReader.getProperty("smartBearPassword"));
        smartBear.loginButton.click();
        smartBear.Order.click();
    }

    @Then("User selects {string} from product dropdown")
    public void userSelectsFromProductDropdown(String productName) {
        Select select = new Select(smartBear.productDropdown);
        select.selectByVisibleText(productName);
    }

    @Then("User enters {string} to quantity")
    public void userEntersToQuantity(String quantity) {
        smartBear.quantityBox.sendKeys(Keys.BACK_SPACE);
        smartBear.quantityBox.sendKeys(quantity);

    }

    @Then("User enters {string} to costumer name")
    public void userEntersToCostumerName(String customerName) {
        smartBear.NameBox.sendKeys(customerName);
    }

    @Then("User enters {string} to street")
    public void userEntersToStreet(String streetName) {
        smartBear.streetBox.sendKeys(streetName);
    }

    @Then("User enters {string} to city")
    public void userEntersToCity(String cityName) {
        smartBear.cityBox.sendKeys(cityName);
    }

    @Then("User enters {string} to state")
    public void userEntersToState(String state) {
        smartBear.stateBox.sendKeys(state);
    }

    @Then("User enters {string} to zip")
    public void userEntersToZip(String zip) {
        smartBear.zipBox.sendKeys(zip);
    }

    @Then("User selects {string} as card type")
    public void userSelectsAsCardType(String cardType) {
        smartBear.cardSelection(cardType);
    }

    @Then("User enters {string} to card number")
    public void userEntersToCardNumber(String arg0) {
        smartBear.cardNumberBox.sendKeys(arg0);
    }

    @Then("User enters  {string} expiration date")
    public void userEntersExpirationDate(String expiration) {
        smartBear.expirationDateBox.sendKeys(expiration);
    }

    @Then("User clicks process button")
    public void user_clicks_process_button() {
        smartBear.processButton.click();
    }



    @Then("User selects {int} from product dropdown")
    public void userSelectsFromProductDropdown(int number) {
        Select dropdown = new Select(smartBear.productDropdown);
        dropdown.selectByIndex(number);
    }

    @Then("User verifies {string} is in the list")
    public void userVerifiesCostumerNameIsInTheList( String costumerName) {
        smartBear.Viewallorders.click();
        String ActualName = smartBear.JohnWickName.getText();
        String ExpectedName = costumerName;
        Assert.assertEquals(ActualName, ExpectedName);
    }


    @Then("User selects Visa as card type")
    public void userSelectsVisaAsCardType() {

        smartBear.userSelectsAsCardType.click();
    }

    @Then("User verifies John Wick is in the list")
    public void userVerifiesJohnWickIsInTheList() {

        String actual =smartBear.JohnWickName.getText();
        String expected = "JOhn Wick";

    }
}

