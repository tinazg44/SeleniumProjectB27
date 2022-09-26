package com.cydeo.tests.day4_xpath_findElements_checkbox;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector {
    public static void main(String[] args) {
        /*
        1. Open Chrome browser


2. Go to https://practice.cydeo.com/forgot_password


3. Locate all the WebElements on the page using XPATH and/or CSS
locator only (total of 6)
a. “Home” link


b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cydeo text
4. Verify all web elements are displayed.
T1_xpath_cssSelector
         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        driver.get("https://practice.cydeo.com/forgot_password");

        // Locate using cssSelector with class attribute syntax #2
        WebElement homeLink1 = driver.findElement(By.cssSelector(".nav-link"));

        // Locate using cssSelector with class attribute syntax #1
        WebElement homeLink2 = driver.findElement(By.cssSelector("a[class='nav-link']"));


        // Locate using xpath with class attribute syntax #1
        WebElement homeLink3 = driver.findElement(By.xpath("//a[@class='nav-link']"));

       // b. “Forgot password” header
        // Locate using cssSelector with class attribute syntax #1
        WebElement forgotPassword1 = driver.findElement(By.cssSelector("div[class='example']>h2"));

        // Locate using cssSelector with class attribute syntax #2
        WebElement forgotPassword2 = driver.findElement(By.cssSelector("div.example>h2"));

        // Locate using xpath with class attribute syntax #1
        // instead //h2[text()='Forgot Password'] we can also write //h2[.='Forgot Password']
        WebElement forgotPassword3 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        // Locate using xpath with class attribute from parent to child
        WebElement forgotPassword4 = driver.findElement(By.xpath("//div[@class='example']/h2"));


//        c. “E-mail” text
        // Locate using xpath with text
        WebElement emailText1 = driver.findElement(By.xpath("//label[.='E-mail']"));

        // Locate using xpath with contains
        WebElement emailText2 = driver.findElement(By.xpath("//label[contains(@for,'email')]"));

//        d. E-mail input box
        WebElement emailInput = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

//        e. “Retrieve password” button
        WebElement retrievePassword = driver.findElement(By.cssSelector("button[id='form_submit']>i"));

//        f. “Powered by Cydeo text
        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

//        4. Verify all web elements are displayed.
        // isDisplayed() method return to boolean true/false
        System.out.println("homeLInk1.isDisplayed() = " + homeLink1.isDisplayed());
        System.out.println("forgotPassword3.isDisplayed() = " + forgotPassword3.isDisplayed());
        System.out.println("emailText1.isDisplayed() = " + emailText1.isDisplayed());
        System.out.println("emailInput.isDisplayed() = " + emailInput.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());





    }
}
