package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderFromLenskart {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/madhaviballipalli/Downloads/chromedriver-mac-x64/chromedriver");

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {

            driver.get("https://www.lenskart.com/");

            try {
                WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("close")));
                closeButton.click();
            } catch (Exception e) {
                // Handle if no pop-up appears
            }

            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@class, 'SearchInputField')]")));
            highlightElement(js, searchBox);
            searchBox.sendKeys("Sunglasses");
            searchBox.submit();

            WebElement displayingSunglasses = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sunglasses")));
            highlightElement(js, displayingSunglasses);
            displayingSunglasses.click();

            WebElement selectFrameShape = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='https://static.lenskart.com/images/cust_mailer/Sunglass/Clubmaster.png']/ancestor::div[contains(@class, 'FilterItemImageWrapper--gm8fc')]")));
            highlightElement(js, selectFrameShape);
            selectFrameShape.click();

            WebElement selectedFrameColor = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Grey')]")));
            scrollToElement(js, selectedFrameColor);
            highlightElement(js, selectedFrameColor);
            selectedFrameColor.click();
            System.out.println("The selected color is: " + selectedFrameColor.getText());

            WebElement selectedFrameSizeDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'FRAME SIZE')]")));
            scrollToElement(js, selectedFrameSizeDropdown);
            highlightElement(js, selectedFrameSizeDropdown);
            js.executeScript("arguments[0].click();", selectedFrameSizeDropdown);
            System.out.println("Please click to select the- " + selectedFrameSizeDropdown.getText());

            WebElement selectMediumChbx = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Medium')]")));
            scrollToElement(js, selectMediumChbx);
            highlightElement(js, selectMediumChbx);
            js.executeScript("arguments[0].click();", selectMediumChbx);
            System.out.println("The selected Frame Size is: " + selectMediumChbx.getAttribute("name"));

            WebElement selectPrice = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'PRICE')]")));
            scrollToElement(js, selectPrice);
            highlightElement(js, selectPrice);
            selectPrice.click();
            System.out.println("The selected Price filter is: " + selectPrice.getText());
            Thread.sleep(2000);

            WebElement selectedPrice = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), '$. 0 - $. 499')]")));
            scrollToElement(js, selectedPrice);
            highlightElement(js, selectedPrice);
            js.executeScript("arguments[0].click();", selectedPrice);
            System.out.println("The selected Price filter is: " + selectedPrice.getText());

            WebElement selectItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class= 'AnchorWrapper--1fs79a kmqTsf']")));
            highlightElement(js, selectItem);
            selectItem.click();
            System.out.println("Item Selected");

            WebElement buyNow = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id = 'btn-primary']")));
            wait.until(ExpectedConditions.visibilityOf(buyNow));
            wait.until(ExpectedConditions.elementToBeClickable(By.id("btn-primary")));
            highlightElement(js, buyNow);
            js.executeScript("arguments[0].scrollIntoView(true);", buyNow);
            buyNow.click();
            System.out.println("Buying the item");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Quit the driver
//            driver.quit();
        }
    }

    private static void highlightElement(JavascriptExecutor js, WebElement element) {
        js.executeScript("arguments[0].style.border='3px solid red'", element);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        js.executeScript("arguments[0].style.border=''", element);
    }

    public static void scrollToElement(JavascriptExecutor js, WebElement element) {
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
