package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginStepDefs {
    LoginPage loginPage= new LoginPage();
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("the user enters to {string} {string}")
    public void the_user_enters_to(String username, String password) {
        loginPage.Login.sendKeys(username);
        loginPage.Password.sendKeys(password);
        loginPage.signIn.click();

    }

    @Then("the user should be able to see {string}")
    public void the_user_should_be_able_to_see(String result){
        if(loginPage.LoginErrorMessage.getText().contains(result)||Driver.get().getCurrentUrl().contains(result)){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
        System.out.println(loginPage.LoginErrorMessage.getText());
        System.out.println(Driver.get().getCurrentUrl());
    }

}
