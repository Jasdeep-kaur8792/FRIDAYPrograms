package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private Login clickLogin;
    public PageFactory(WebDriver driver){
        this.driver = driver;
    }

    public Login getLogin()

    {
        if (clickLogin == null) {
            clickLogin = new Login(driver);
        }
        return clickLogin;
    }
}
