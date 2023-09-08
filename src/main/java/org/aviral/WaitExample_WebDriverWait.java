package org.aviral;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WaitExample_WebDriverWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
      WebElement userName_TextBox = driver.findElement(By.id("userName"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(userName_TextBox));
        driver.get("https://www.google.com");
        driver.close();

    }
}
