package com.amazon.pageObjects;

import com.amazon.resources.DriverInit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class BannerDetails
{

    public static void bannercount() throws IOException {

        WebDriver driver = DriverInit.init();


        List<WebElement> banneritems = ((ChromeDriver) driver).findElementsByXPath("//*[@id=\"anonCarousel1\"]/ol/li");

        System.out.println(banneritems.size());




    }
}
