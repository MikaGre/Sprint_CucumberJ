package Pages.Darksky;

import Drivers.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LandingPage extends BasePage {
    By feelsLikeTempDegreesLocator = By.xpath("//span[@class='feels-like-text']");
    By lowTempDegreesLocator = By.xpath("//span[@class='low-temp-text']");
    By highTempDegreesLocator = By.xpath("//span[@class='high-temp-text']");
    By mapTempUnitsLocator = By.id("map_units");
    By tempUnitLocator = By.xpath("//div[@id='header']//div[@class='selectric-wrapper selectric-units']//b[@class='button']");
    By CMPHSelection = By.xpath("//div[@id='header']//li[@class='last'][contains(text(),'C, mph')]");
    By todayTimeLineLocator = By.xpath("//span[contains(text(),'Today')]");
    By todayTimeLineMinTempLocator = By.xpath("//div[@id=\"week\"]/a[1]/span[2]/span[@class='minTemp']");
    By todayTimeLineMaxTempLocator = By.xpath("//div[@id=\"week\"]/a[1]/span[2]/span[@class='maxTemp']");
    By todayTimeLineBarLocator = By.xpath("//div[@id=\"week\"]/a[1]/span[2]/span[@class='bar']");
    By todayLowTempDetailsLocator = By.xpath("//div[@class='dayDetails revealed']//span[@class='highTemp swip']//span[@class='temp']");
    By todayHighTempDetailsLocator = By.xpath("//div[@class='dayDetails revealed']//span[@class='lowTemp swap']//span[@class='temp']");

    public boolean isFeelsLikeTempisDisplayed(){
         return Web.getDriver().findElement(feelsLikeTempDegreesLocator).isDisplayed();
    }

    public boolean isLowTempisDisplayed(){
         return Web.getDriver().findElement(lowTempDegreesLocator).isDisplayed();
    }

    public boolean isHighTempisDisplayed(){
         return Web.getDriver().findElement(highTempDegreesLocator).isDisplayed();
    }

    public int getFeelsLikeTemp(){
        String feelsLikeTempDegrees = Web.getDriver().findElement(feelsLikeTempDegreesLocator).getText();
        String[] feelsLikeTemp = feelsLikeTempDegrees.split("\\W");
        return Integer.parseInt(feelsLikeTemp[0]);
    }

    public int getLowTemp(){
        String lowTempDegrees = Web.getDriver().findElement(lowTempDegreesLocator).getText();
        String[] lowTemp = lowTempDegrees.split("\\W");
        return Integer.parseInt(lowTemp[0]);
    }

    public int getHighTemp(){
        String highTempDegrees = Web.getDriver().findElement(highTempDegreesLocator).getText();
        String[] highTemp = highTempDegrees.split("\\W");
        return Integer.parseInt(highTemp[0]);
    }

    public void selectTempUnitFromMapDropDown (String tempUnit){
        Select tempUnitsDropDown = new Select((WebElement) mapTempUnitsLocator);
        tempUnitsDropDown.selectByVisibleText(tempUnit.toUpperCase());
    }

    public void selectCTempFromNavDropDown(){
        try {
            clickThis(Web.getDriver().findElement(tempUnitLocator));
            Thread.sleep(1000);
            clickThis(Web.getDriver().findElement(CMPHSelection));
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void scrollToTodayTimeline(){
        scrollToElement(todayTimeLineLocator);
    }

    public String getMinTempFromTodayTimeLine(){
       return getTextFromElement(todayTimeLineMinTempLocator);
    }

    public String getMaxTempFromTodayTimeLine(){
        return getTextFromElement(todayTimeLineMaxTempLocator);
    }

    public String getTodayTimeLineDetailsLowTemp(){
        return getTextFromElement(todayLowTempDetailsLocator);
    }

    public String getTodayTimeLineDetailsHighTemp(){
        return getTextFromElement(todayHighTempDetailsLocator);
    }

    public void clickOnTodayTimeLine(){
        clickThis(todayTimeLineBarLocator);
    }

}
