package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class SignInPage extends BasePage {
    By emailLocator = By.xpath("//input[@placeholder='Email address']");
    By passwordLocator = By.xpath("//input[@placeholder='Password']");
    By signInButtonLocator = By.xpath("//button[contains(text(), 'SIGN IN')]");

    public void signIn () {
        type(emailLocator,"MBlue@outlook.com");
        type(passwordLocator,"rv9_4BS#HdNvh!w");
        clickThis(signInButtonLocator);
    }
}
