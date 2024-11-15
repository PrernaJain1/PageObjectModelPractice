package com.demoqa.bookstore.Test;

import com.demoqa.bookstore.Base.BaseClass;
import com.demoqa.bookstore.Page.RegistrationPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseClass {

    private static RegistrationPage reg;

    @BeforeMethod
    public static void preSetUp(){
        BaseClass.initialize();
        reg = new RegistrationPage(driver);
    }

    @Test
    public void register(){
        reg.registration();
    }

    @AfterMethod
    public static void postSetUp(){
        BaseClass.closing();
    }
}
