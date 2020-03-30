package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.basepage.BasePage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by  :  Gaurang Patel
 * since : Saturday  28/03/2020
 * TIME  : 09:32
 **/
public class LoginTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLogInSuccessfully(){
        homePage.enterUserName();
        homePage.enterPassword();
        homePage.clickOnLogIn();

        String welComeText = "Welcome Admin";
        Assert.assertEquals(welComeText,loginPage.getWelcomeText());



    }

}
