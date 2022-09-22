package com.cydeo.tests.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1_locators_getText {
    /*
    1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password
     */
    public static void main(String[] args) {
     //  WebDriverManager.chromedriver().setup();
      // WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");


        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");
        WebElement inputUserName = driver.findElement(By.name("USER_LOGIN"));
        inputUserName.sendKeys("incorrect");
        // Mac: option + enter tazi opciq e short cut to store vaiables kato Webelement inputUsserpassword
        //Windows; alt + Enter
        WebElement inputUserPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputUserPassword.sendKeys("incorrect"); // sendKeys() ni pomaga da typeing the incorrect duma
        WebElement loginBtn = driver.findElement(By.className("login-btn"));
        loginBtn.click();

        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();
        if(actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("error mess ver passed");
        }else{
            System.out.println("error mess ver failed");
        }
        driver.quit();


    }
}
