package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest { AccountPage accountPage = new AccountPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    CustomersPage customersPage = new CustomersPage();
    HomePage homePage = new HomePage();
    OpenAccountPage openAccountPage = new OpenAccountPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        // click On "Bank Manager Login" Tab
        bankManagerLoginPage.clickOnBankManagerLogin();
        //click On "Add Customer" Tab
        addCustomerPage.clickOnAddCustomer();
        //enter FirstName
        addCustomerPage.enterFirstName();
        //enter LastName
        addCustomerPage.enterLastName();
        //enter PostCode
        addCustomerPage.enterPostcode();
        //click On "Add Customer" Button
        addCustomerPage.clickAddCustomer();
        //accept popup display.verify message "Customer added successfully"
        Assert.assertEquals(addCustomerPage.verifyTextFromAlert(),"Customer added successfully with customer id :6");
        addCustomerPage.acceptThatAlert();

    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        bankManagerShouldAddCustomerSuccessfully();
        // Click on Home Button
        homePage.clickOnHome();
        //click On "Bank Manager Login" Tab
        bankManagerLoginPage.clickOnBankManagerLogin();
        //click On "Open Account" Tab
        openAccountPage.clickOnOpenAccount();
        //Search customer that created in first test
        openAccountPage.selectCustomer();
        //Select currency "Pound"
        openAccountPage.selectCurrency();
        //click on "process" button
        openAccountPage.clickOnProcess();
        //popup displayed
        // Assert.assertEquals(addCustomerPage.verifyTextFromAlert(),"Account created successfully with account Number :1017");
        addCustomerPage.acceptThatAlert();


    }
    @Test
    public void customerShouldLoginAndLogoutSuceessfully(){
        bankManagerShouldOpenAccountSuccessfully();
        //Click on Home
        homePage.clickOnHome();
        //click on "Customer Login" Tab
        customerLoginPage.clickOnCustomerLogin();
        //search customer that you created
        customerLoginPage.selectName();
        // click on "Login" Button
        customerLoginPage.clickOnLogin();

        //verify "Logout" Tab displayed.
        Assert.assertEquals(customerLoginPage.getLogOutText(),"Logout");

        //click on "Logout"
        customerLoginPage.clickOnLogout();

        //verify "Your Name" text displayed.
        Assert.assertEquals(customerLoginPage.getYourNameText(),"Your Name :");
    }
    @Test
    public void customerShouldDepositMoneySuccessfully(){
        bankManagerShouldOpenAccountSuccessfully();
        homePage.clickOnHome();
        //click on "Customer Login" Tab
        customerLoginPage.clickOnCustomerLogin();
        // search customer that you created.
        customerLoginPage.selectName();
        //  click on "Login" Button
        customerLoginPage.clickOnLogin();
        //click on "Deposit" Tab
        accountPage.clickOnDeposit();
        // Enter amount 100
        accountPage.enterDeposit();
        // click on "Deposit" Button
        accountPage.clickDepositButton();
        // verify message "Deposit Successful"
        Assert.assertEquals(accountPage.getDepositSuccessfulText(),"Deposit Successful");
    }
    @Test
    public void customerShouldWithdrawMoneySuccessfully(){

        //bankManagerShouldAddCustomerSuccessfully();
        // bankManagerShouldOpenAccountSuccessfully();
        //homePage.clickOnHome();
        //click on "Customer Login" Tab
        bankManagerShouldOpenAccountSuccessfully();
        homePage.clickOnHome();
        customerLoginPage.clickOnCustomerLogin();
        // search customer that you created.
        customerLoginPage.selectName();
        //  click on "Login" Button
        customerLoginPage.clickOnLogin();


        // click on "Withdrawl" Tab
        accountPage.clickWithdrawlTab();
        // Enter amount 50
        accountPage.enterWithdrawnAmount();
        // click on "Withdraw" Button
        accountPage.withdrwalclick();
        // verify message "Transaction Failed"
        Assert.assertEquals(accountPage.getTransactionFailedText(),"Transaction Failed. You can not withdraw amount more than the balance.");

    }

}
