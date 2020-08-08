package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class LandingPage extends BasePage {
    By createAccountButtonLocator = By.xpath("//a[@class='create-account-trigger']");
    By nextButtonLocator = By.xpath("//a[@id='linkChooseAcount']");
    By accountNextButtonLocator = By.xpath("//button[@name='dwfrm_profile_confirm']");
    By personTitleBoxLocator = By.xpath("//div[@class='selected-option input-select profile-title required']");
    By personTitleOtherLocator = By.xpath("//span[contains(text(),'OTHER')]");
    By termsOfUseBox = By.xpath("//input[@id='dwfrm_registration_termsofuseteacher']");
    By firstnameBoxLocator = By.xpath("//input[@id='dwfrm_profile_customer_firstname']");
    By lastnameBoxLocator = By.xpath("//input[@id='dwfrm_profile_customer_lastname']");
    By emailBoxLocator = By.xpath("//input[@id='dwfrm_profile_customer_email']");
    By passwordBoxLocator = By.xpath("//input[@id='dwfrm_profile_login_password']");
    By mobileNumBoxLocator = By.xpath("//input[@id='dwfrm_profile_customer_phone']");
    By zipCodeBoxLocator = By.xpath("//input[@id='dwfrm_myschool_schoolzip']");
   // By stateBoxLocator = By.xpath("//div[@class='selected-option input-select']");
   // By stateListLocator = By.xpath("//li[@class='custom-option select-option']");
    By searchButtonLocator = By.xpath("//div[@class='findschool-byzip']//button[@id='button-search']");
    By schoolNameBoxLocator = By.xpath("//input[@id='dwfrm_searchschool_schoolvalue']");
    By schoolListLocator = By.className("(//ul[@id='ui-id-774'])/li");
   // By ttSchoolLocator = By.xpath("//span[contains(text(),'of nyc')]");
    By ttSchoolLocator = By.xpath("//span[contains(text(),'of nyc')]");
    By schoolNextButtonLocator = By.xpath("//button[@name='dwfrm_searchschool_findnext']");
    By roleBoxLocator = By.xpath("//div[@class='selected-option input-select primaryrole required']");
    By roleTeacherByGradeLocator = By.xpath("//span[contains(text(),'Teacher (by Grade)')]");
    By gradeBoxLocator = By.xpath("//div[@class='selected-option input-select noscroll selected-active']");
    By seniorOptLocator = By.xpath("//span[contains(text(),'12th Grade')]");
    By roleNextButton = By.xpath("//button[@name='dwfrm_myrole_findgrade']");
    By numOfStudentLocator = By.xpath("//input[@id='dwfrm_myrole_students']");
    By readingLvlBoxLocator = By.xpath("//div[@class='selected-option input-select required']");




    public void clickCreateAccountButton () {
        clickThis(createAccountButtonLocator);
    }

    public void clickOnRoleNextButton () {clickThis(roleNextButton);}

    public void clickAccountNextButton () {
        clickThis(accountNextButtonLocator);
    }

    public void clickOnNextButton () {
        clickThis(nextButtonLocator);
    }

    public void clickOnSchoolNextButton () {
        clickThis(schoolNextButtonLocator);
    }

    public void clickOnSearchButton () {clickThis(searchButtonLocator);}

    public void selectOtherTitle () {
        clickThis(personTitleBoxLocator);
        clickThis(personTitleOtherLocator);
    }

    public void typeFirstName (String fName) {
       type(firstnameBoxLocator,fName);
    }

    public void typeLastName (String lName) {
       type(lastnameBoxLocator,lName);
    }

    public void typeEmail (String email) {
        type(emailBoxLocator,email);
    }

    public void typePassword (String password) {
        type(passwordBoxLocator,password);
    }

    public void typeMobileNum (String mobile) {
        type(mobileNumBoxLocator,mobile);
    }

    public void checkTermsBox (){
        clickThis(termsOfUseBox);
    }

    public void typeZipCode (String zip) {
        type(zipCodeBoxLocator,zip);
    }

    public void typeSchool (String abrvSchoolName,String schoolName) {
        type(schoolNameBoxLocator, abrvSchoolName);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jsSelectFromAutoSuggestions(schoolListLocator,schoolName);
        clickThis(ttSchoolLocator);


    }

    public void selectTeacher () {
        clickThis(roleBoxLocator);
        clickThis(roleTeacherByGradeLocator);
    }

    public void selectSenGrade () {
        clickThis(gradeBoxLocator);
        clickThis(seniorOptLocator);
    }

    public void typeStudentAmt (String studentAmt) {
        type(numOfStudentLocator,studentAmt);
    }
}
