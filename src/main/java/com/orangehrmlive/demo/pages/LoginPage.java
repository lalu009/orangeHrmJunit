package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Util;
import org.openqa.selenium.By;

/**
 * Created by  :  Gaurang Patel
 * since : Saturday  28/03/2020
 * TIME  : 10:12
 **/
public class LoginPage extends Util {

    By welComeText = By.id("welcome");

    public String getWelcomeText(){
       return getTextFromElement(welComeText);
    }
}
