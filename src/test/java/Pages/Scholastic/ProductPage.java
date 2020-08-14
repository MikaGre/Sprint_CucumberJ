package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class ProductPage extends BasePage {
    By starHarryItemLocator = By.xpath("//div[@data-isbn13='978-1-338-29920-5']/div[2]/div[3]/div[2]/i[1]");
    By toolTipCloseLocator = By.xpath("//span[contains(@class,'tooltipster-close')]");


    public void setStarHarryItem(){
        clickThis(starHarryItemLocator);
        clickThis(toolTipCloseLocator);
    }

}
