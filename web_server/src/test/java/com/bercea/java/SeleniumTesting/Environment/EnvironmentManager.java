package com.bercea.java.SeleniumTesting.Environment;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.OperatingSystem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnvironmentManager {

    public static void initWebDriver(){
        WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.LINUX).setup();
        WebDriver driver = new FirefoxDriver();
        RunEnvironment.setWebDriver(driver);
    }

    public static void shutDownDriver(){
        RunEnvironment.getWebDriver().quit();
    }
}