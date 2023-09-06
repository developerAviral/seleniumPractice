package org.aviral;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        //Maximize and Minimize Screen
        driver.manage().window().fullscreen();
        driver.manage().window().minimize();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.youtube.com");

      //  Thread.sleep(3000);
        driver.navigate().back();
      //  Thread.sleep(3000);
        driver.navigate().forward();
      //  Thread.sleep(3000);
        driver.navigate().refresh();

        System.out.println("Title is: " +  driver.getTitle()); // Get Page Title
        System.out.println("Page URL is: " + driver.getCurrentUrl()); // Get Current Url

        driver.close();

    }
}