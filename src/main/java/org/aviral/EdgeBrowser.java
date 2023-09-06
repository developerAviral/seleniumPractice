package org.aviral;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
     //   driver.get("https://www.google.com");
        driver.navigate().to("https://www.youtube.com");
      //  driver.close();

    }
}
