package com.bercea.java.SeleniumTesting.Environment;

import org.openqa.selenium.WebDriver;

public class RunEnvironment {
    public static WebDriver driver = null;

    public static void setWebDriver(WebDriver driver){
        RunEnvironment.driver = driver;
        System.out.println(driver.getTitle());
    }

    public static WebDriver getWebDriver(){
        return RunEnvironment.driver;
    }
}
