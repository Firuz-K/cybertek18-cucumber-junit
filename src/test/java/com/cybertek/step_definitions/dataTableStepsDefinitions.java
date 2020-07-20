package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class dataTableStepsDefinitions {

GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("User is on the google search page")
    public void user_is_on_the_google_search_page() {


        Driver.getDriver().get("https://www.google.com");

    }
    @Then("User should see six links in the footer")
    public void user_should_see_six_links_in_the_footer(List <String> linkStrings) {


       int expectedSize= linkStrings.size();
       int actualSize = googleSearchPage.footerLinks.size();

        System.out.println("linkStrings = " + linkStrings);
        System.out.println("actualSize = " + actualSize);
        Assert.assertEquals(actualSize,expectedSize);

    }




}
