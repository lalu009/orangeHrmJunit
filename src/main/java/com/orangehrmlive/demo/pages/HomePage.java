package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Util;
import org.openqa.selenium.By;

/**
 * Created by  :  Gaurang Patel
 * since : Saturday  28/03/2020
 * TIME  : 09:27
 **/
public class HomePage extends Util {

    By userNameField = By.id("txtUsername");
    By passwordField = By.id("txtPassword");
    By loginBtn = By.id("btnLogin");


    public void enterUserName (){
        sendTextToElement(userNameField,"admin");
    }
    public void enterPassword(){
        sendTextToElement(passwordField,"admin123");
    }

    public void clickOnLogIn(){ clickOnElement(loginBtn);
    }
}
