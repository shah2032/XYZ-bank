package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By bankManagerLoginTab = By.xpath("//button[contains(text(),'Bank Manager Login')]");


    public void clickOnBankManagerLogin(){
        clickOnElement(bankManagerLoginTab);
    }


}
