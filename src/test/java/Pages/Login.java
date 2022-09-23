package Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {
     WebDriver driver;

    By username= By.xpath("//input[@placeholder='Username']");
    By password= By.xpath("//input[@placeholder='Password']");
    By clickOnSubmit= By.xpath("//input[@type='submit']");

    public Login(WebDriver driver)
    {
        this.driver = driver;
    }

    public void logInUserName() {
        driver.findElement(username).sendKeys("performance_glitch_user");
    }
        public void logInUserPassword() {
            driver.findElement(password).sendKeys("secret_sauce");
        }
    public void logInSubmitButton()
    {
        driver.findElement(clickOnSubmit).click();

}
}
