package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(id="user_login")
    public WebElement Login;

    @FindBy(id="user_password")
    public WebElement Password;

    @FindBy(name = "submit")
    public WebElement signIn;
    
    @FindBy(xpath = "//*[@id=\"login_form\"]/div[1]")
    public WebElement LoginErrorMessage;

    public void login(){
    WebDriver driver = null;
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        Login.sendKeys(username);
        Password.sendKeys(password);
        signIn.click();
       Alert alert= driver.switchTo().alert();
       alert.accept();
    }


}
