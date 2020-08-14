package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class YTOPage extends BasePage {
    By qtyColLocator = By.xpath("//th[@class='item-qty sorting_disabled'][contains(text(),'QTY.')]");
    By jumperAlertLocator = By.xpath("//div[@class='info-modal-content']");
    By jumperAlertCloseLocator = By.xpath("//i[@class='fa fa-times info-modal-close']");
    By priceQtyLocator = By.xpath("//input[@data-isbn13='9781338737547']");
    By bonusQtyLocator = By.xpath("(//td[@class=' bonus-qty'])/input[1]");


    public void scrollToTable(){
        scrollToElement(qtyColLocator);
    }

    public void clickPriceQty(){
        clickThis(priceQtyLocator);
    }

    public void clickBonusQty(){
        clickThis(bonusQtyLocator);
    }

    public void closeJumper(){
        clickThis(jumperAlertCloseLocator);
    }

    public boolean isJumperVis(){
        return isDisplayed(jumperAlertLocator);

    }




}
