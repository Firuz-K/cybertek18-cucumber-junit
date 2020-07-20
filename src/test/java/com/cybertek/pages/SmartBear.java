package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBear {

    public SmartBear(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement userNameBox;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement passwordBox;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(linkText = "Order")
    public WebElement Order;

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement productDropdown;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantityBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement NameBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement streetBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement cityBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement stateBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipBox;


    @FindBy(id="//label[text()='Visa']/preceding-sibling::input")
    public WebElement userSelectsAsCardType;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumberBox;


    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expirationDateBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public  WebElement processButton;

    @FindBy(linkText = "View all orders")
    public WebElement Viewallorders;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td[2]")
    public WebElement JohnWickName;

    public void cardSelection(String cardType) {
        Driver.getDriver().findElement(By.xpath("//label[text()='" + cardType + "']/preceding-sibling::input")).click();
    }

}
