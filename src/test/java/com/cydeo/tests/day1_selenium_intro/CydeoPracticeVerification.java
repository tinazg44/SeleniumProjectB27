package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoPracticeVerification {

    public static void main(String[] args) {
        /*
        TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to
https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
       Expected: Practice
         */

        // 1. set up web driver manager
        WebDriverManager.chromedriver().setup();


        //  2. opening  an empty browser with creating instance driver
        WebDriver driver = new ChromeDriver();

        // making window full screen(maximizing)
        driver.manage().window().maximize();

        // 3. go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");

        //4. verify title: Expected:Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Practice verification is PASSED");
        }else{
            System.out.println("Practice verification is FAILED");
        }



    }
}
