package Pages.Hotels;

import Drivers.Web;
import Pages.BasePage;
import Utils.DateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HotelsLandingPage extends BasePage {
    By searchBoxLocator = By.id("qf-0q-destination");
    By searchButtonLocator = By.xpath("//button[@type='submit']");
    By autoSuggestionLocator = By.xpath("//div[@class='autosuggest-category-result']");
    By checkInDateBoxLocator = By.id("qf-0q-localised-check-in");
    By checkOutDateBoxLocator = By.id("qf-0q-localised-check-out");
    By numberOfNightsLocator = By.xpath("//span[contains(@class,'widget-query-num-nights')]");
    By adPopUpXLocator = By.xpath("//button[@class='cta widget-overlay-close']");
    By allCalenderDatesLocator = By.xpath("//div[@class='widget-datepicker']//tr//td[@data-date]");
    By calenderCheckInIconLocator = By.id("widget-query-label-1");
    By calenderCheckOutIconLocator = By.id("widget-query-label-3");
    By allMonthsCalenderLocator = By.xpath("//div[@class='widget-datepicker-label']");
    By nextMonthButtonLocator = By.xpath("//div[@class='widget-daterange-cont']//div[2]//div[1]//button[2]");
    By monthTextLocator = By.xpath("//div[@class='widget-datepicker-label']");


    public void closePopUpWindow() {
        clickThis(adPopUpXLocator);
    }

    public void enterTextInSearchBox(String place){
        type(searchBoxLocator,place);
    }

    public void clickSearchButton(){
        WebDriverWait wait = new WebDriverWait(Web.getDriver(),10);
        wait.until(ExpectedConditions.and(
                ExpectedConditions.elementToBeClickable(searchButtonLocator),
                ExpectedConditions.visibilityOfElementLocated(searchButtonLocator)
        ));
            clickThis(searchButtonLocator);
    }

    public void selectDestinationFromAutoSuggestion(String value)  {
        waitForElementVisible(autoSuggestionLocator,10);
        selectFromAutoSuggestions(autoSuggestionLocator, value);
    }

    public void enterCheckInDate(int month, int day, int year){
       clearField(checkInDateBoxLocator);
       String checkInDate = String.format("%d/%d/%d",month,day,year);
       type(checkInDateBoxLocator,checkInDate);
    }

    public void enterCheckOutDate(int month, int day, int year){
       clearField(checkOutDateBoxLocator);
       String checkOutDate = String.format("%d/%d/%d",month,day,year);
       type(checkOutDateBoxLocator,checkOutDate);
    }

    public String getTextFromNumNightsIcon() {
       return getTextFromElement(numberOfNightsLocator);
    }

    public void selectCheckInDate(String dateValue) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        selectDateFromCalendar(allCalenderDatesLocator, dateValue);
    }

    public void selectCheckOutDate(String dateValue) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        selectDateFromCalendar(allCalenderDatesLocator, dateValue);
    }

    public void clickCheckInCalendarIcon () {
        clickThis(calenderCheckInIconLocator);
    }

    public void clickCheckOutCalendarIcon () {
        clickThis(calenderCheckOutIconLocator);
    }

    public String selectDateXamountOfDaysFromTomorrow (int amountOfDays) {
       return DateHelper.getDateValueXDaysFromTomorrow(amountOfDays);
    }

    public String selectDateXamountOfDaysFromToday (int amountOfDays) {
        return DateHelper.getDateValueXDaysFromToday(amountOfDays);
    }

    public void selectMonthFromCalender(String month) {
        selectMonthFromCalendar(monthTextLocator,allCalenderDatesLocator,nextMonthButtonLocator,month);
    }

    public String getMonthText (){
        return getTextFromElement(monthTextLocator);
    }

}