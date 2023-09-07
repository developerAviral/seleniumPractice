package org.aviral;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsList {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/login");
        List<WebElement> elementGroup = driver.findElements(By.className("element-group"));

        for(int i = 0 ; i < elementGroup.size() ; i++){
            elementGroup.get(i).getText();
            WebElement elementName = driver.findElement(By.xpath("//div[@class='element-group']["+(i+1)+"]//span"));
        }
    }
}
