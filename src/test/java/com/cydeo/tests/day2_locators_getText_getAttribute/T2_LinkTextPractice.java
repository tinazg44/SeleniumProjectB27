package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {
    public static void main(String[] args) throws InterruptedException {
        /*
        1- Open a chrome browser
2- Go to: https://practice.cydeo.com/
3- Click to A/B Testing from top of the list.
4- Verify title is:
  Expected: No A/B Test
5- Go back to home page by using the .back();
6- Verify title equals:
  Expected: Practice
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");


       // driver.findElement(By.linkText("A/B Testing")).click(); we can use this way but every time we need to writing it and instead we just need to assing it like the second row
       // WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));

        WebElement abTestLink = driver.findElement(By.partialLinkText("A/B"));
        abTestLink.click(); // this is another way na po-gornoto



        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("No A/B test title verification passed");
        }else{
            System.out.println("No A/B title ver failed");
        }

        Thread.sleep(3000);

        driver.navigate().back();


        expectedTitle = "Practice";
        actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Practice page title verification passed");
        }else{
            System.out.println("Practice page title verification failed");
        }


        driver.quit();






    }
}
