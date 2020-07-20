package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyWebElements {

    public EtsyWebElements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "global-enhancements-search-query")
    public WebElement etsySearchBox;

    @FindBy(xpath = "//span[@class='etsy-icon wt-nudge-b-1']")
    public WebElement searchButton;
}
