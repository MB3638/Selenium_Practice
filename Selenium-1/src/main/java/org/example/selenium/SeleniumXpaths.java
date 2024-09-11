package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumXpaths {

    public static void main(String[] args) throws InterruptedException {

        WebDriver cDriver = new ChromeDriver();

        cDriver.get("https://www.samsclub.com/login");
        highlight(cDriver, cDriver.findElement(By.tagName("h1")));
        Thread.sleep(1000);
        highlight(cDriver, cDriver.findElement(By.className("sc-input-box-required")));
        Thread.sleep(1000);
        highlight(cDriver, cDriver.findElement(By.id("email")));
        Thread.sleep(1000);
        highlight(cDriver, cDriver.findElement(By.name("current-password")));
        Thread.sleep(1000);
        highlight(cDriver, cDriver.findElement(By.linkText("Forgot password")));
        Thread.sleep(1000);
        System.out.println(cDriver.findElement(By.className("sc-login-form-stay-sign-label")).getText());
        Thread.sleep(1000);
        cDriver.close();
    }

    public static void highlight(WebDriver cDriver, WebElement element) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) cDriver;
        javascriptExecutor.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:yellow')",element);
    }

}