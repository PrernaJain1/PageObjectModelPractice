package com.demoqa.bookstore.Base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static WebDriver driver;

    public static void initialize(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
    }

    public static void closing(){
        driver.quit();
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor script = (JavascriptExecutor) driver;
        script.executeScript("arguments[0].scrollIntoView(true)", element);
    }
}
