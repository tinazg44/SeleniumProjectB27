package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarInsuranceAppVerification {
    public static void main(String[] args) {



    /*
    1. Open Chrome browser
2. Go to
https://www.qa1.excelsoirinsurance.com/login
3. Verify URL contains
     Expected: "excelsoirinsurance"
4. Verify title:
       Expected: "Login | Excelsoir Insurance"
day2_locators_getText_getAttribute
CarInsuranceAppVerification
     */

        // 1. set up web driver manager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.qa1.excelsoirinsurance.com/login");

        //3. verify url
        String excpectedURL = "excelsoirinsurance"; // comes from requirement
        String actualURL = driver.getCurrentUrl(); // comes from browser
        if(actualURL.contains(excpectedURL)){
            System.out.println("URL verification is passed");
        }else{
            System.out.println("URL verification is failed");
        }

        String expectedTitle = "Login | Excelsoir Insurance";
        String actualTitle = driver.getTitle();

                if(actualTitle.equals(expectedTitle)){
                    System.out.println("Title verification test passed");
                }else{
                    System.out.println("Title verification test failed");
                }


        driver.quit();












    }
}
