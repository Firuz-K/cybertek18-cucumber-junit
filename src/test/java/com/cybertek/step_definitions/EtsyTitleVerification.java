package com.cybertek.step_definitions;

import com.cybertek.pages.EtsyWebElements;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class EtsyTitleVerification {

    EtsyWebElements etsyWebElements = new EtsyWebElements();

    @Given("User is on Etsy Page")
    public void user_is_on_https_www_etsy_com() {

        Driver.getDriver().get("https://www.etsy.com");

    }


    @Then("User sees title is as expected")
    public void user_sees_title_is_as_expected() {

        String expectedTitle="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }


    @Then("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {


        etsyWebElements.etsySearchBox.sendKeys("Wooden Spoon");
    }




    @Then("User clicks search button")
    public void user_clicks_search_button() {

        etsyWebElements.searchButton.click();

    }


    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {

        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle =Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }


    @Then("User types {string} in the search box")
    public void userTypesInTheSearchBox(String key) {
        etsyWebElements.etsySearchBox.sendKeys(key);
        etsyWebElements.searchButton.click();
    }

    @And("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String key) {

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(key));
    }
}
