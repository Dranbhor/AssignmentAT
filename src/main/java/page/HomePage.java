package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePage extends BaseTest {
    @FindBy(xpath = "//span[contains(text(),'John Smith')]")
    WebElement userProfile;

    public HomePage() throws IOException {
        super();

        PageFactory.initElements(driver, this);
    }

    public String verifyHomePagePageTitle() {
        return driver.getTitle();
    }

    public ProfilePage clickOnProfile() throws IOException {
        userProfile.click();
        return new ProfilePage();
    }
}
