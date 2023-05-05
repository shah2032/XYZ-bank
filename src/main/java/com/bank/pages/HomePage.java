package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By home = By.xpath("//button[contains(text(),'Home')]");
    By customerLoginTab = By.xpath("//button[contains(text(),'Customer Login')]");

    By bankManagerLoginTab = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    public void clickOnHome(){
        clickOnElement(home);
    }
    public void clickOnCustomerLogin(){
        clickOnElement(customerLoginTab);
    }

    public void clickOnBankManagerLogin(){
        clickOnElement(bankManagerLoginTab);
    }

}
