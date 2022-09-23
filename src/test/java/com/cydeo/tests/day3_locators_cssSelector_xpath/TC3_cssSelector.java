package com.cydeo.tests.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class TC3_cssSelector {
    /*
    1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “Log in” button text is as expected:
Expected: Log In
     */
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        // locate with using css selector by type attribute:
       // WebElement loginBtn = driver.findElement(By.cssSelector("input[type='submit']"));

        // locate with css selector by value attribute:
       // WebElement logInBtn = driver.findElement(By.cssSelector("input[value='Log In']"));

        //locate with using css selector by class attribute:
        //WebElement logInBtn = driver.findElement(By.cssSelector("input[class='login-btn']"));

        //locate with using css selector by class attribute: with syntax #2:
        //WebElement logInBtn = driver.findElement(By.cssSelector("input.login-btn"));

        //locate with using css selector by onclick attribute:
        //WebElement logInBtn = driver.findElement(By.cssSelector("input[onclick=\"BX.addClass(this, 'wait');\"]"));




    }
}
