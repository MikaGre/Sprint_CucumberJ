package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    By emailAddressLocator = By.xpath("//input[@placeholder='Email address']");
    By passwordLocator = By.xpath("//input[@placeholder='Password']");
    By signInButtonLocator = By.className("mysch-btn btn-nxt signin-btn btn-next-nav mysch-reg-btn sch-btn-short disabled");
    By registerButtonLocator = By.xpath("//button[@class='mysch-btn mysch-reg-btn sch-btn-short']");

    public void clickOnRegisterButton () {
        clickThis(registerButtonLocator);
    }
}
