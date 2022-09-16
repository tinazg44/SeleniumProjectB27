package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {


        // 1. set up web driver manager
        WebDriverManager.chromedriver().setup();

      //  2. opening  an empty browser with creating instance driver
        WebDriver driver = new ChromeDriver(); // everytime when we creat this part we creating new session and when we quit ,it will kill the sesion and need to creat a new one if we want to use it again

        // making window full screen(maximizing)
        driver.manage().window().maximize();

        // 3. go to "https:// www. tesla.com"
       // driver.get("https://www.tesla.com");

        driver.navigate().to("https://www.tesla.com"); // another way to open tesla page but more useable is the first one driver.get()
        // stops execution of code during for 3 seconds
        Thread.sleep(3000);

        // navigate().back() - method will take previous page

        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);
        driver.navigate().refresh();

        driver.navigate().to("https://www.google.com");
       // System.out.println("driver.getTitle() = " + driver.getTitle()); // when the method that we right will give as return type ex String we need to put it in Sout( kakto napravihme zashtoto shte ni dade title (String ). Ne moje da go ostavin izvan Sout zashtoto nqma da ni dade title like this driver.getTitle();

        String currentTitle = driver.getTitle();
        System.out.println("title = " + currentTitle);
        //System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        String currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);

        // stops execution of code for 3 sec.
        Thread.sleep(3000);

        // navigate().back() method will take previous page
        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();


        driver.navigate().to("https://www.google.com");
        //System.out.println("driver.getTitle() = " + driver.getTitle());
        currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        driver.manage().window().fullscreen();


        // close() method will close the current page
        //driver.close();

        // quit() will close all opened pages
        //driver.quit();

       // driver.get("https://www.tesla.com"); after we quit on line 42 we need to creat a new one object to continue it


    }
}
