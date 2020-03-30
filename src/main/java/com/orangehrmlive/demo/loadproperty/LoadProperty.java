package com.orangehrmlive.demo.loadproperty;

import com.orangehrmlive.demo.basepage.BasePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BaseAugmenter;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by  :  Gaurang Patel
 * since : Saturday  28/03/2020
 * TIME  : 09:26
 **/
public class LoadProperty extends BasePage {

    static Properties prop;
    static FileInputStream input;


    public String getProperty(String key) {

        prop = new Properties();

        try {

            input = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\orangehrmlive\\demo\\resources\\properties\\config.properties");
            prop.load(input);

        } catch (IOException e) {
            e.printStackTrace();

        }
        return prop.getProperty(key);

    }
}
