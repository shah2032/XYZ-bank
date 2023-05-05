package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage  extends Utility {
    By addCustomerTab = By.xpath("//button[normalize-space()='Add Customer']");

    By firstNameTab = By.xpath("//input[@placeholder='First Name']");

    By lastNameTab = By.xpath("//input[@placeholder='Last Name']");

    By postcodeTab = By.xpath("//input[@placeholder='Post Code']");

    By clickCustomerTab = By.xpath("//button[@type='submit']");



    public void clickOnAddCustomer() {
        clickOnElement(addCustomerTab);
    }

    public void enterFirstName() {
        sendTextToElement(firstNameTab, "Brooks");
    }
    public void enterLastName(){
        sendTextToElement(lastNameTab,"Bloosam");
    }
    public void enterPostcode(){
        sendTextToElement(postcodeTab,"L150HR");
    }
    public void clickAddCustomer(){
        clickOnElement(clickCustomerTab);
    }
    public String verifyTextFromAlert() {
        System.out.println(getTextFromAlert());
        return getTextFromAlert();
    }
    public void acceptThatAlert() {
        acceptAlert();
    }
}

