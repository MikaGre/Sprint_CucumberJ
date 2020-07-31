package Pages.Hotels;

import Pages.BasePage;
import org.openqa.selenium.By;

public class SelectionDetailsPage extends BasePage {
    By destinationHeaderLocator = By.xpath("//h1[@class='destination-title']");
    By destinationPropertyLandmarkText = By.xpath("//label[text()='Destination, property, or landmark']/following-sibling::input[@id='q-destination']");
    By priceSortMenuLocator = By.xpath("//a[@data-menu='sort-submenu-price']");
    By priceLowestToHighestOpt = By.xpath("//ul[@id='sort-submenu-price']//a[contains(text(),'Price (low to high)')]");
    By pricesOfHotelsLowestToHighestResultsLocator = By.xpath("//div[@class='price']//ins[1]");


    public String getDestinationHeader() {
        return getTextFromElement(destinationHeaderLocator);
    }

    public String getDestinationPropertyLandmarkText() {
        return getAttributeValueFromElement(destinationPropertyLandmarkText, "value");
    }

    public void selectLowestToHighestPriceSort(){
        mouseHoverOverElement(priceSortMenuLocator);
        clickThis(priceLowestToHighestOpt);
    }

    public void hoverAndClickOnLowtoHigh(){
        mouseHoverOverElementAndClick(priceSortMenuLocator,priceLowestToHighestOpt);
    }



    public String isLowestPriceFromResultsLessThan(){
        waitForElementVisible(pricesOfHotelsLowestToHighestResultsLocator,10);
        return getFirstNumberFromListOfResults(pricesOfHotelsLowestToHighestResultsLocator);
    }
}
