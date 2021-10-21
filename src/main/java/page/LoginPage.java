
package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends BaseTest {
    //declaration

    @FindBy(id="email")
    WebElement username;

    @FindBy(xpath = "//input[@id='pass']")
    WebElement password;

    @FindBy(name = "login")
    WebElement loginButton;

    //initialization
    public LoginPage() throws IOException {
        super();
        PageFactory.initElements(driver,this);
    }


    public String verifyPageTitle(){
        return driver.getTitle();
    }


    public HomePage login(){

        username.sendKeys(properties.getProperty("username"));
        password.sendKeys(properties.getProperty("password"));
        loginButton.click();
        return new HomePage();
    }

}
