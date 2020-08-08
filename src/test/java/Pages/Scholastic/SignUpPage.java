package Pages.Scholastic;

import Drivers.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignUpPage extends BasePage {
    By fnameLocator = By.xpath("//input[contains(@placeholder,'First name')]");
    By lnameLocator = By.xpath("//input[contains(@placeholder,'Last name')]");
    By emailLocator = By.xpath("//input[contains(@placeholder,'Email address')]");
    By nextButtonLocator = By.id("nextButton");
    By passwordLocator = By.name("password");
    By confirmPasswordLocator = By.name("confirmPassword");
    By termsOfUseLocator = By.xpath("//div[contains(@class,'mysch-input-checkbox')]//label");
    By emailErrorMsgLocator = By.className("mysch-error-msg");
    By roleBoxLocator = By.className("form-control roles dropdown-toggle");
    By gradeBoxLocator = By.className("form-control gradename dropdown-toggle grade-placeholder");
    By gradeListLocator = By.xpath("(//ul[@class='dropdown-menu grades-dropdown'])//li[@ng-repeat='grades in gradeList']");
    By zipCodeBoxLocator = By.xpath("//input[contains(@placeholder,'Enter ZIP code')]");
    By schoolBoxLocator = By.xpath("//span[contains(text(),'Select your school')]");
    By schoolListLocator = By.xpath("(//ul[@class='dropdown-menu expanded-dropdown school'])//li[@class='ng-scope']");
    By successfulMsgLocator = By.xpath("//p[contains(text(),'You have completed your registration.')]");

    public void teacherSelectSchoolName (String schoolName) {
        clickThis(schoolBoxLocator);
        selectFromAutoSuggestions(schoolListLocator,schoolName);
    }

    public void selectARole(String role) {
        clickThis(roleBoxLocator);
        String roleLocator = "//a[contains(text(),'"+ role +"')]";
        By rLocator = By.xpath(roleLocator);
        clickThis(rLocator);
    }

    public void enterZipCode (String zipCode){
        type(zipCodeBoxLocator,zipCode);
    }

    public void teacherSelectSchoolType (String schoolType){
       switch (schoolType){
           case "United States school":
               clickThis((WebElement) Web.getDriver().findElement(By.xpath("mysch-checkboxID_1")));
               break;
           case "Military base school":
               clickThis((WebElement) Web.getDriver().findElement(By.xpath("mysch-checkboxID_2")));
               break;
           case "Home school":
               clickThis((WebElement) Web.getDriver().findElement(By.xpath("mysch-checkboxID_3")));
               break;
           case "Non-U.S. school":
               clickThis((WebElement) Web.getDriver().findElement(By.xpath("mysch-checkboxID_4")));
               break;
       }
    }

    public void teacherSelectAGrade (String grade){
        clickThis(gradeBoxLocator);
        selectFromAutoSuggestions(gradeListLocator,grade);
    }

    public void enterFname(String fName){
        type(fnameLocator,fName);
    }

    public void enterLname(String lName){
        type(lnameLocator,lName);
    }

    public void enterEmail(String email){
        type(emailLocator,email);
    }

    public void enterPassword(String password){
        type(passwordLocator,password);
    }

    public void enterConfirmPassword(String confirmPassword){
        type(confirmPasswordLocator, confirmPassword);
    }

    public void clickNext () {
        clickThis(nextButtonLocator);
    }

    public void clickTermsOfUse () {
        clickThis(termsOfUseLocator);
    }

    public boolean isEmailErrorMsgVis () {
      return isDisplayed(emailErrorMsgLocator);
    }

    public String getSuccessfulMsg () {
        return getTextFromElement(successfulMsgLocator);
    }
}
