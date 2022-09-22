package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2_TC2 {
    /*
    TC #2: Zero Bank header verification
1. Open Chrome browser
2. Go to https://zero.webappsecurity.com/login.html
3. Verify header text
Expected: “Log in to ZeroBank”
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://zero.webappsecurity.com/login.html");

        WebElement headerText = driver.findElement(By.tagName("h2"));
        String expectedHeader = "Log in to ZeroBank";
        String actualHeader = headerText.getText();
        if(actualHeader.equals(expectedHeader)){
            System.out.println("Header ver is passed");
        }else{
            System.out.println("Header ver is failed");
        }
    }
}
