package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class CartPage extends BasePage {

    By checkOutButtonLocator = By.xpath("//button[@id='dwfrm_cart_checkoutCart']");
    By proceedToCheckOutLocator = By.xpath("//button[@class='button-text'][contains(text(),'Proceed to Checkout')]");
    By continueToCheckOutLocator = By.xpath("//button[@id='btn-continue-checkout']//span[contains(text(),'Continue Checkout')]");
    By paymentMethodBoxLocator = By.id("payment-options");
    By paymentSelectCCLocator = By.xpath("//li[@class='custom-option CREDIT_CARD']//span[contains(text(),'Credit Card')]");
    By paymentCCSelectionLocator = By.xpath("//div[@class='custom-select credit']");

    public void scrollToCheckoutButtonAndClick(){
        scrollToElement(checkOutButtonLocator);
        clickThis(checkOutButtonLocator);
        clickThis(proceedToCheckOutLocator);
        scrollToElement(continueToCheckOutLocator);
        clickThis(continueToCheckOutLocator);
    }

    public void selectCC(){
        scrollToElement(paymentMethodBoxLocator);
        clickThis(paymentMethodBoxLocator);
        clickThis(paymentSelectCCLocator);
    }

    public boolean isCardPresent(String last4Cardnum){
       return isPresentTextFromList(paymentCCSelectionLocator,last4Cardnum);
    }


}
