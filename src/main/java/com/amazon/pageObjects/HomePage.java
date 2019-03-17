package com.amazon.pageObjects;

import com.amazon.resources.DriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


public class HomePage
{

    public static void signUp() throws IOException {

        WebDriver driver = DriverInit.init();

        ((JavascriptExecutor) driver).executeScript("document.querySelector('#nav-flyout-ya-signin a').click();"); //takes you to login/sign in page


    }
}

