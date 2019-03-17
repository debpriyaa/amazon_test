package com.amazon.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverInit {
        public static Properties prop = new Properties();

        public static WebDriver init () throws IOException {
//            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("/Users/debpriya/IdeaProjects/leadschool/src/main/java/com/amazon/config.properties");
            prop.load(fis);
            System.getProperty("webdriver.chrome.driver", prop.getProperty("DriverPath"));
            WebDriver driver = new ChromeDriver(); //launch chrome
            driver.get("https://www.amazon.in"); //enter url
            return driver;

        }
    }




