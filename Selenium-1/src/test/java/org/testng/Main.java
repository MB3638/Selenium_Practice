package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Main {

        @Test
        public void TestGoogle() throws Exception {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.google.com/");
            driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
            System.out.println(driver.getTitle());
            Thread.sleep(5000);
            driver.quit();
        }

        @Test
        public void TestSamsClub() throws InterruptedException {
              System.out.println("test failed");
              Assert.fail();
//            WebDriver driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.get("https://www.samsclub.com/");
//            driver.findElement(By.name("email")).sendKeys("HYR Tutorials", Keys.ENTER);
//            System.out.println(driver.getTitle());
//            Thread.sleep(5000);
//            driver.quit();
        }
}