package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    By openAccountTab = By.xpath("//button[normalize-space()='Open Account']");

    By customerField = By.xpath("//select[@id='userSelect']");

    By currencyField = By.xpath("//select[@id='currency']");
    By processTab = By.xpath("//button[normalize-space()='Process']");

    public void clickOnOpenAccount(){
        clickOnElement(openAccountTab);
    }
    public void selectCustomer(){
        mouseHoverToElementAndClick(customerField);
        selectByVisibleTextFromDropDown(customerField,"Brooks Bloosam");
    }

    public void selectCurrency(){
        clickOnElement(currencyField);
        selectByVisibleTextFromDropDown(currencyField,"Pound");
    }
    public void clickOnProcess(){
        clickOnElement(processTab);
    }
}
