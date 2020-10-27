package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountActivityPage {
    @FindBy(xpath = "//h2[@class='board-header']")
    public WebElement Show_Transactions;

    @FindBy(xpath = "//select[@id='aa_accountId']")
    public WebElement AccountOptionsSelect;

    @FindBy(xpath = "//div[@id='all_transactions_for_account']")
    public WebElement Table;

    @FindBy(xpath = "//*[@id='tabs']/ul/li[2]/a")
    public WebElement Find_Transactions;

    @FindBy(xpath = "//input[@name='description']")
    public WebElement Description;

    @FindBy (id = "aa_fromDate")
    public WebElement FromDate;

    @FindBy (id = "aa_toDate")
    public WebElement ToDate;

    @FindBy(id = "aa_fromAmount")
    public WebElement FromAmount;

    @FindBy(id = "aa_toAmount")
    public WebElement ToAmount;

    @FindBy(id = "aa_type")
    public WebElement Type;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement FindButton;

    public AccountActivityPage(){
        PageFactory.initElements(Driver.get(), this);
    }

}
