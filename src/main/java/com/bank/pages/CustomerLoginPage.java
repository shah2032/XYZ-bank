package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    By customerLoginTab = By.xpath("//button[normalize-space()='Customer Login']");

    By nameField = By.xpath("//select[@id='userSelect']");

    By loginTab = By.xpath("//button[normalize-space()='Login']");


    By logoutTab = By.xpath("//button[@class = 'btn logout']");

    //By yourNameText = By.xpath("//strong[contains(text(),'Welcome')]");
    By yourNameText=By.xpath("//label[normalize-space()='Your Name :']");



    public void clickOnCustomerLogin(){
        clickOnElement(customerLoginTab);
    }
    public void selectName(){
        selectByVisibleTextFromDropDown(nameField,"Brooks Bloosam");
    }
    public String getLogOutText(){
        return getTextFromElement(logoutTab);
    }
    public void clickOnLogin(){
        clickOnElement(loginTab);
    }

    public String getYourNameText(){
        return getTextFromElement(yourNameText);
    }
    public void clickOnLogout(){
        clickOnElement(logoutTab);

    }



}
