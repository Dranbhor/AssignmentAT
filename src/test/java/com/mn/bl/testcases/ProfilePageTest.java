package com.mn.bl.testcases;

import base.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginPage;
import page.ProfilePage;

import java.io.IOException;

public class ProfilePageTest extends BaseTest {
    LoginPage loginPage;
    ProfilePage profilePage;
    HomePage homePage;
    public  ProfilePageTest() throws IOException {
        super();
    }

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        loginPage = new LoginPage();
        profilePage =homePage.clickOnProfile();
    }

    @Test
    public void launchFB_profilePage() throws InterruptedException, IOException {
        profilePage = new ProfilePage();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
