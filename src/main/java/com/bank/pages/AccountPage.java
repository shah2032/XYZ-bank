package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By depositTab = By.xpath("//button[normalize-space()='Deposit']");
    By amount100 = By.xpath("//input[@placeholder='amount']");
    By depositButton= By.xpath("//button[@type='submit']");
    By depositsuccessfulText =By.xpath("//span[@class='error ng-binding']");

    By withdrawlTab =By.xpath("//button[normalize-space()='Withdrawl']");
    By withdrawlAmountTab =By.xpath("//input[@placeholder='amount']");


    By withdrawnButton = By.xpath("//input[@placeholder='amount']");

    By clickOnWithdrawlButton = By.xpath("//button[normalize-space()='Withdraw']");
    By transactionFailedtext = By.xpath("//span[@class='error ng-binding']");

    public void clickOnDeposit(){
        clickOnElement(depositTab);
    }
    public void enterDeposit(){
        sendTextToElement(amount100,"100");
    }
    public void clickDepositButton(){
        clickOnElement(depositButton);
    }

    public String getDepositSuccessfulText(){
        return getTextFromElement(depositsuccessfulText);
    }
    public void clickWithdrawlTab(){
        clickOnElement(withdrawlTab);
    }

    public void enterWithdrawnAmount(){
        sendTextToElement(withdrawnButton,"50");
    }

    public void clickWithdrawButton(){
        clickOnElement(withdrawlAmountTab);
    }

    public String getTransactionFailedText(){
        return getTextFromElement(transactionFailedtext);
    }
    public void withdrwalclick(){
        clickOnElement(clickOnWithdrawlButton);
    }


}




