package com.mn.bl.testcases;

import base.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginPage;
import page.ProfilePage;

import java.io.IOException;

public class HomePageTest extends BaseTest {
    LoginPage loginPage;
    HomePage homepage;
    ProfilePage profilePage;

    public HomePageTest() throws IOException {
        super();
    }

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        loginPage = new LoginPage();
        homepage = new HomePage();
        homepage = loginPage.login();
    }

    @Test
    public void verifyClickOnProfile() throws IOException {
        profilePage = homepage.clickOnProfile();

    }

    @AfterMethod
    public void tearDown() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
