package org.aviral;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsOnPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/login");
        driver.navigate().to("https://demoqa.com/text-box");

        WebElement userName_TextBox = driver.findElement(By.id("userName"));
        userName_TextBox.click();
        userName_TextBox.sendKeys("Aviral");
        Thread.sleep(3000);
        //userName_TextBox.clear();


        String getTextBoxValue = userName_TextBox.getText();
        String placeholder = userName_TextBox.getAttribute("placeholder");

        System.out.println("Title is: " +  driver.getTitle()); // Get Page Title
        System.out.println("Page URL is: " + driver.getCurrentUrl()); // Get Current Url

        System.out.println("Textbox Text: " + getTextBoxValue); // Get Current Url
        System.out.println("Placeholder: " + placeholder); // Get Current Url
        driver.close();

    }
}
