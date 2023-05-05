package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {
    By customer = By.xpath("//button[normalize-space()='Customers']");

    public void clickOnCustomer(){
        clickOnElement(customer);
    }

}
