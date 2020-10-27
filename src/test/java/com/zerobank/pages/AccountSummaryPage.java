package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class AccountSummaryPage extends BasePage{




    public AccountSummaryPage(){
        PageFactory.initElements(Driver.get(), this);
    }
}
