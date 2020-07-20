package com.cybertek.step_definitions;

import com.cybertek.pages.WikipediaWebElements;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikipediaTitle {

    WikipediaWebElements wikipediaWebElements = new WikipediaWebElements();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");
    }


    @Then("User clicks wiki search button")
    public void user_clickswiki_search_button() {
wikipediaWebElements.SearchButton.click();
    }


    @Then("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String keyWord) {

        wikipediaWebElements.SearchBox.sendKeys(keyWord + Keys.ENTER);

    }

    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String Key) {

        String expectedTitle = Key+" - Wikipedia";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.equals(expectedTitle));


    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String arg0) {

        String actualHeader=wikipediaWebElements.HeaderText.getText();
        Assert.assertEquals(actualHeader,arg0);
    }

    @Then("User sees {string} is in the image header;")
    public void userSeesIsInTheImageHeader(String arg0) {

        String actualHeader = wikipediaWebElements.TextOnImageHeader.getText();

        Assert.assertEquals(actualHeader,arg0);


    }
}
