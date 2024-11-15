package com.demoqa.bookstore.Page;

import com.demoqa.bookstore.Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BaseClass {

    public WebDriver driver;

    @FindBy(xpath = "//h5[text()='Book Store Application']")
    private WebElement bookStore;

    @FindBy (xpath = "//div[text()='Book Store Application']")
    private WebElement bookStoreApplication;

    @FindBy (xpath = "//span[text()='Login']")
    private WebElement login;

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void registration(){
        //Scroll to bookstore and click
        scrollToElement(bookStore);
        bookStore.click();

        //scroll to bookstore application
        scrollToElement(bookStoreApplication);

        //Click on login
        login.click();
    }
}
