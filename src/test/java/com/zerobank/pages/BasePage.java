package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class  BasePage {

    @FindBy(xpath = "//ul[@class='nav nav-tabs']")
    public WebElement menu;

    @FindBy(xpath = "//*[@id=\"account_summary_tab\"]/a")
    public List<WebElement> Account_Summary;

    @FindBy(xpath = "//*[@id=\"account_activity_tab\"]/a")
    public WebElement Account_Activity;

    @FindBy(xpath = "//*[@id=\"transfer_funds_tab\"]/a")
    public WebElement Transfer_Funds;

    @FindBy(xpath = "//*[@id=\"pay_bills_tab\"]/a")
    public WebElement Pay_Bills;

    @FindBy(xpath = "//*[@id=\"money_map_tab\"]/a")
    public WebElement My_Money_Map;

    @FindBy(xpath = "//*[@id=\"online_statements_tab\"]/a")
    public WebElement Online_Statements;

    @FindBy(xpath = "//a[@class='brand']")
    public WebElement Zero_Bank;

    @FindBy(xpath = "(//li[@class='dropdown'])[1]")
    public WebElement Settings;

    @FindBy(id = "//button[@type='submit']")
    public WebElement Help;

    @FindBy(xpath = "(//li[@class='dropdown'])[2]")
    public WebElement username;

    @FindBy(id = "logout_link")
    public WebElement logout;

    @FindBy(xpath = "//input[@id='searchTerm']")
    public WebElement searchbox;


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
}


