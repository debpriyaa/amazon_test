package com.amazon.pageObjects;

import com.amazon.resources.DriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

import java.io.IOException;


public class Login {

    public static void logindetails() throws InterruptedException, IOException {

        WebDriver driver = DriverInit.init();

        // driver.findElement(By.xpath("//*[@id=\'nav-link-yourAccount\']")).click(); //takes you to login/sign in page

        ((JavascriptExecutor) driver).executeScript("document.querySelector('#nav-flyout-ya-signin a').click();");
        driver.findElement(By.xpath("//*[@id=\'ap_email\']\n")).sendKeys(DriverInit.prop.getProperty("id"));
        driver.findElement(By.xpath("//*[@id=\'continue\']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\'ap_password\']")).sendKeys(DriverInit.prop.getProperty("pw"));
        driver.findElement(By.xpath("//*[@id=\'signInSubmit\']")).click();

    }

}
