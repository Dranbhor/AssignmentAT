package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ProfilePage extends BaseTest {


        @FindBy(xpath = "//span[contains(text(),'John Smith')]")
        WebElement element;
        public ProfilePage() throws IOException {
            super();
            PageFactory.initElements(driver, this);
        }

    }
