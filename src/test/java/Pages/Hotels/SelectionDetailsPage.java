package Pages.Hotels;

import Pages.BasePage;
import org.openqa.selenium.By;

public class SelectionDetailsPage extends BasePage {
    By destinationHeaderLocator = By.xpath("//h1[@class='destination-title']");
    By destinationPropertyLandmarkText = By.xpath("//label[text()='Destination, property, or landmark']/following-sibling::input[@id='q-destination']");
    By priceSortMenuLocator = By.xpath("//a[@data-menu='sort-submenu-price']");
    By priceLowestToHighestOpt = By.xpath("//ul[@id='sort-submenu-price']//a[contains(text(),'Price (low to high)')]");
    By pricesOfHotelsLowestToHighestResultsLocator = By.xpath("//div[@class='price']//ins[1]");
    By starRatingOptLocator = By.xpath("//h3[contains(text(),'Star rating')]");
    By numStarTextLocator = By.xpath("//div[@class='additional-details resp-module']/span[1]");




    public boolean isInListingRatingResults (int starRating){
      return isPresentTextFromList(numStarTextLocator,starRating);
    }

    public void clickOnStarRating (int sRating) {
        String starRating = "//span[@class='star-rating'][contains(text(),'"+sRating+"-star')]";
        By starRatingLocator = By.xpath(starRating);
        clickThis(starRatingLocator);
    }

    public void scrollTillRatingIsVis () {
        scrollToElement(starRatingOptLocator);
    }

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
