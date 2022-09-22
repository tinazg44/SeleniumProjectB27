package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3_TC3 {
    /*
    TC #3: Back and forth navigation
1- Open a Chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
  Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
  Expected: Google
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
        WebElement gmail = driver.findElement(By.className("gb_d"));
        gmail.click();
       Thread.sleep(4000);

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title ver passed");
        }else{
            System.out.println("Title ver failed");
        }
        driver.navigate().back();
        expectedTitle = "Google";
        actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("ver title is passed");
        }else{
            System.out.println("ver title failed");
        }
    }
}
