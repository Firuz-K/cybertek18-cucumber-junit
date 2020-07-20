package com.cybertek.step_definitions;


import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();




    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals("Actual title does not match expected title !",actualTitle,expectedTitle);
    }


    @When("User searches apple")
    public void userSearchesApple() {
         googleSearchPage = new GoogleSearchPage();
        googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);

    }

    @Then("User should see apple in the title")
    public void userShouldSeeAppleInTheTitle() {

        String expectedTitle = "apple - Google Search";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);


    }

    @When("User searches {string}")
    public void userSearches(String arg0) {

         googleSearchPage = new GoogleSearchPage();
        googleSearchPage.searchBox.sendKeys(arg0+ Keys.ENTER);


    }

    @Then("User should see {string} in the title")
    public void userShouldSeeInTheTitle(String arg0) {

        String expectedTitle = arg0+" - Google Search";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }



    @And("User clicks to About link")
    public void userClicksToAboutLink() {

        googleSearchPage.AboutText.click();
    }

    @Then("User should see title")
    public void userShouldSeeTitle() {

        String expectedTitle = "Google - About Google, Our Culture & Company News";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }

    @Then("Uer should verify About link is displayed")
    public void uerShouldVerifyAboutLinkIsDisplayed() {
       Assert.assertTrue( googleSearchPage.AboutText.isDisplayed());

    }
}
