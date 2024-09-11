package org.example.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class RegistrationFormTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/madhaviballipalli/Downloads/chromedriver-mac-x64/chromedriver");

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {

            driver.get("file:///Users/madhaviballipalli/IdeaProjects/Initial_Test_Project-1/src/src/main/java/org/example/RegistrationPage.html");

            WebElement confirmationMessage = driver.findElement(By.xpath("//h1[text()='Online Registration Form']"));

            if (confirmationMessage.isDisplayed()) {
                System.out.println("Form testing was successful.");
            } else {
                System.out.println("Form testing  failed.");
            }

            WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
            highlightElement(js, nameField);
            nameField.sendKeys("Madhu");

            WebElement emailField = driver.findElement(By.id("email"));
            highlightElement(js, emailField);
            emailField.sendKeys("madhu@gmail.com");

            WebElement passwordField = driver.findElement(By.id("password"));
            highlightElement(js, passwordField);
            passwordField.sendKeys("#12345");

            List<WebElement> genderRadioButtons = driver.findElements(By.name("gender"));
            for (WebElement radioButton : genderRadioButtons) {
                if (radioButton.getAttribute("value").equals("female")) {
                    highlightElement(js, radioButton);
                    radioButton.click();
                    break;
                }
            }

//            driver.findElement(By.xpath("//input[@name='gender' and @value='female']")).click();

            List<WebElement> hobbyCheckboxes = driver.findElements(By.name("hobbies"));
            for (WebElement checkbox : hobbyCheckboxes) {
                if (checkbox.getAttribute("value").equals("traveling")) {
                    highlightElement(js, checkbox);
                    checkbox.click();
                }
            }

            WebElement countryDropdown = driver.findElement(By.id("country"));
            highlightElement(js, countryDropdown);
            Select selectCountry = new Select(countryDropdown);
            selectCountry.selectByVisibleText("India");
            selectCountry.selectByVisibleText("Canada");

            WebElement bioField = driver.findElement(By.id("bio"));
            highlightElement(js, bioField);
            bioField.sendKeys("I am a software developer with a passion for coding and technology.");

            WebElement submitButton = driver.findElement(By.xpath("//button[text()='Register']"));
            highlightElement(js, submitButton);
            submitButton.click();

            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            String alertText = alert.getText();
            System.out.println("Alert text is: " + alertText);
            alert.accept();

            WebElement linkText = driver.findElement(By.linkText("Already have an account? Log in"));
            highlightElement(js, linkText);
            linkText.click();
            System.out.println(linkText.getText());

          driver.findElement(By.tagName("img"));
          System.out.println("Image is displayed.");

          WebElement table = driver.findElement(By.tagName("table"));

            List<WebElement> rows = table.findElements(By.xpath("//tbody/tr"));

            // Loop through each row and get the cells (columns)
            for (int i = 0; i < rows.size(); i++) {
                List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));

                // Print each cell's content
                System.out.println("Row " + (i + 1) + " Data:");
                for (int j = 0; j < cols.size(); j++) {
                    System.out.println(cols.get(j).getText());
                }
                System.out.println();  // Blank line between rows for clarity
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
//        finally {
//            driver.quit();
//        }
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
}
