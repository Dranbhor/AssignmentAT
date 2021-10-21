package com.mn.bl.testcases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;

import java.io.IOException;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage;

    public void LoginPageTest() throws IOException {
        //super();
    }

    public LoginPageTest() throws IOException {
    }

    @BeforeMethod
    public void setUp(){
        initialization();
    }
    @Test(priority = 1)
    public void loginPageTitleTest() throws IOException {
        loginPage = new LoginPage();
        String loginPageTitle = loginPage.verifyPageTitle();
        //System.out.println("Login Page Title is:"+loginPageTitle);
        Assert.assertEquals(loginPageTitle, "Facebook – log in or sign up", loginPageTitle);

    }
    @Test(priority = 2)
    public void loginTest() throws IOException {
        loginPage = new LoginPage();
        loginPage.login();
    }

    @AfterMethod
    public void tearDown(){
        // driver.quit();
    }

}
