package com.cydeo.tests.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HW_practice_xpath {
    /*
    XPATH Practice
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #6:  XPATH LOCATOR practice
1. Open Chrome browser
2. Go to http://practice.cydeo.com/multiple_buttons
3. Click on Button 1
4. Verify text displayed is as expected:
Expected: “Clicked on button one!”
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/multiple_buttons");

        WebElement button1 = driver.findElement(By.cssSelector("//button[@class='btn btn-primary']"));
        button1.click();
       // Thread.sleep(3000);

        WebElement textDisplayed = driver.findElement(By.xpath("//div[@class='col-4 col-md-4']"));

        String expectedTextDisplayed= "Clicked on button one!";
        String actualTextDisplayed =textDisplayed.getText();
        if(actualTextDisplayed.equals(expectedTextDisplayed)){
            System.out.println("Text displayed is passed");
        }else{
            System.out.println("Text displayed failed");
        }




    }
}
