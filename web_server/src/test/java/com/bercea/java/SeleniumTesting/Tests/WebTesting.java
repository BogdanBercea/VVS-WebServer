package com.bercea.java.SeleniumTesting.Tests;

import com.bercea.java.SeleniumTesting.Environment.EnvironmentManager;
import com.bercea.java.SeleniumTesting.Environment.RunEnvironment;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class WebTesting {

    @Before
    public void startBrowser(){
        EnvironmentManager.initWebDriver();
    }

    @After
    public void tearDown(){
        EnvironmentManager.shutDownDriver();
    }

    @Test
    public void homePageTitleTest() {
        String expectedTitle = "Index of /";

        WebDriver driver = RunEnvironment.getWebDriver();
        driver.get("localhost:8080");

        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void homePageHeader(){
        String expectedHeader = "Index of /";

        WebDriver driver = RunEnvironment.getWebDriver();
        driver.get("localhost:8080");

        String actualHeader = driver.findElement(By.tagName("h1")).getText();

        assertEquals(expectedHeader, actualHeader);
    }

    @Test
    public void homePageTestClassesAnchor(){
        String expectedTitle = "Index of /test-classes";

        WebDriver driver = RunEnvironment.getWebDriver();
        driver.get("localhost:8080");

        driver.findElement(By.linkText("./test-classes")).click();

        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void homePageSurefireReportsAnchorTitleTest(){
        String expectedTitle = "Index of /surefire-reports";

        WebDriver driver = RunEnvironment.getWebDriver();
        driver.get("localhost:8080");

        driver.findElement(By.linkText("./surefire-reports")).click();

        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void homePageSurefireReportsAnchorHeaderTest(){
        String expectedHeader = "Index of /surefire-reports";

        WebDriver driver = RunEnvironment.getWebDriver();
        driver.get("localhost:8080");

        driver.findElement(By.linkText("./surefire-reports")).click();

        String actualHeader = driver.findElement(By.tagName("h1")).getText();
        assertEquals(expectedHeader, actualHeader);

    }

    @Test
    public void archiveTmpAnchorTest(){
        String expectedTitle = "Index of /archive-tmp";

        WebDriver driver = RunEnvironment.getWebDriver();
        driver.get("localhost:8080");

        driver.findElement(By.linkText("./archive-tmp")).click();

        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void generatedTestSourcesTest(){
        String expectedTitle = "Index of /generated-test-sources";

        WebDriver driver = RunEnvironment.getWebDriver();
        driver.get("localhost:8080");

        driver.findElement(By.linkText("./generated-test-sources")).click();

        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void mavenStatusTest(){
        String expectedTitle = "Index of /maven-status";

        WebDriver driver = RunEnvironment.getWebDriver();
        driver.get("localhost:8080");

        driver.findElement(By.linkText("./maven-status")).click();

        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void classesAnchorTest(){
        String expectedTitle = "Index of /classes";

        WebDriver driver = RunEnvironment.getWebDriver();
        driver.get("localhost:8080");

        driver.findElement(By.linkText("./classes")).click();

        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void mavenArchiverTest(){
        String expectedTitle = "Index of /maven-archiver";

        WebDriver driver = RunEnvironment.getWebDriver();
        driver.get("localhost:8080");

        driver.findElement(By.linkText("./maven-archiver")).click();

        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void generatedSourcesTest(){
        String expectedTitle = "Index of /generated-sources";

        WebDriver driver = RunEnvironment.getWebDriver();
        driver.get("localhost:8080");

        driver.findElement(By.linkText("./generated-sources")).click();

        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void testClassesAnchorsChainingTest(){
        String expectedTitle = "Index of /test-classes/com";

        WebDriver driver = RunEnvironment.getWebDriver();
        driver.get("localhost:8080");

        driver.findElement(By.linkText("./test-classes")).click();
        driver.findElement(By.linkText("./test-classes/com")).click();

        String actualTitle = driver.getTitle();

        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void generatedTestSourcesChainingTest(){
        String expectedHeader = "Index of /generated-test-sources/test-annotations";

        WebDriver driver = RunEnvironment.getWebDriver();
        driver.get("localhost:8080");

        driver.findElement(By.linkText("./generated-test-sources")).click();
        driver.findElement(By.linkText("./generated-test-sources/test-annotations")).click();

        String actualHeader = driver.findElement(By.tagName("h1")).getText();

        assertEquals(expectedHeader, actualHeader);
    }
}
