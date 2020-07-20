package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaWebElements {

    public WikipediaWebElements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "searchInput")
    public WebElement SearchBox;

    @FindBy(xpath = "//i[@class='sprite svg-search-icon']")
    public WebElement SearchButton;

    @FindBy(id = "firstHeading")
    public WebElement HeaderText;

    @FindBy(className = "fn")
    public WebElement TextOnImageHeader;

}

