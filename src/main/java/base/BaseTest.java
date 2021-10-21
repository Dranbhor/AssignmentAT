package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;
    public static Properties properties;


    public BaseTest() throws IOException {
        properties = new Properties();
        FileInputStream inputStream=null;
        try {
            inputStream = new FileInputStream(
                    "src/main/java/com/bridgelabz/facebook/config/config.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // for launching the browser
    public void initialization() {
        String browserName = properties.getProperty("browser");
        if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            // System.setProperty("webdriver.chrome.driver","/home/bridglabz/selenium webdriver/chromedriver_linux64/chromedriver");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(500,TimeUnit.MILLISECONDS);
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS);
        driver.get(properties.getProperty("url"));

    }


}
