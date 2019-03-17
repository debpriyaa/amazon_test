package com.amazon.pageObjects;

import com.amazon.resources.DriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class PincodeChange {

    public static void changePincode() throws InterruptedException, IOException {

        WebDriver driver = DriverInit.init();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"nav-global-location-slot\"]/span/a")).click(); //opens change pincode page
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"GLUXChangePostalCodeLink\"]")).click(); //change pincode
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdateInput\"]")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdateInput\"]")).sendKeys("400014");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdate\"]/span/input")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"a-autoid-3-announce\"]")).click();


    }
}
