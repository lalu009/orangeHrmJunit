package com.orangehrmlive.demo.testbase;

import com.orangehrmlive.demo.basepage.BasePage;
import com.orangehrmlive.demo.browserselector.BrowserSelector;
import com.orangehrmlive.demo.loadproperty.LoadProperty;
import org.junit.After;
import org.junit.Before;

/**
 * Created by  :  Gaurang Patel
 * since : Saturday  28/03/2020
 * TIME  : 09:31
 **/
public class TestBase extends BasePage {

    String browser = new LoadProperty().getProperty("browser");
    BrowserSelector browserSelector =new BrowserSelector();

    @Before
    public void setUp(){
        browserSelector.selectBrowser(browser);
    }
    @After
    public void tearDown(){
//       driver.quit();
 }
}
