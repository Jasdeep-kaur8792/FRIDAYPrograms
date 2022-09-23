package BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;

public class BaseClass {
    static WebDriver driver;
    protected static PageFactory pageFactory;


    @Parameters("browserName")
    @BeforeClass

    public static void setup(String browserName) throws MalformedURLException {
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");
            pageFactory = new PageFactory(driver);

        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");
            pageFactory = new PageFactory(driver);
        }
    }

    @AfterClass
    public void close() {
        driver.close();
    }
}
