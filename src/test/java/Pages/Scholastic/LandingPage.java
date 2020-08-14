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
    By signInButtonLocator = By.className("signin");
    By emailAccountFieldSinginLocator = By.xpath("//div[contains(@class,'login-box-content returning-customers clearfix')]//input[contains(@placeholder,'Scholastic Account Email')]");
    By passwordAccountFieldSinginLocator = By.xpath("//div[contains(@class,'form-row row-password-input required')]//input[@id='dwfrm_login_password']");
    By topNavMyAccountLocator = By.xpath("//span[@class='hide-mobile user-account-name']");
    By signInLocator = By.xpath("//div[@id='dialog-container']//button[1]");
    By menuProfileLocator = By.xpath("//a[@class='null'][contains(text(),'Profile')]");
    By notificationCloseLocator = By.xpath("//span[@class='notification-close']");
    By enterOrdersMenuLocator = By.xpath("//div[@class='hide-mobile desktop_nav_menu']//a[@id='enter-orders']");
    By ytoOptLocator = By.xpath("//div[@class='hide-mobile desktop_nav_menu']//a[contains(text(),'Your Teacher Order')]");
    By cartButtonLocator = By.xpath("//i[@class='minicart-icon shopping-cart']");
    By searchBarLocator = By.xpath("//input[@id='q']");
    By searchBntLocator = By.xpath("//i[@class='fa fa-search']");
    By myListButtonLocator = By.xpath("//span[contains(text(),'My Lists')]");
    By recommendationListButtonLocator = By.xpath("//li[@class='recommend']/a[1]/span[1]");

    public void clickOnMyListPop (){
        clickThis(myListButtonLocator);
        clickThis(notificationCloseLocator);
        clickThis(myListButtonLocator);
        clickThis(recommendationListButtonLocator);
    }

    public void clickOnMyList (){
        clickThis(myListButtonLocator);
    }

    public void clickRecommendationList(){
      clickThis(myListButtonLocator);
      clickThis(recommendationListButtonLocator);
    }

    public void searchItem(String item){
        type(searchBarLocator,item);
        clickThis(searchBntLocator);
    }

    public void clickCart(){
        clickThis(cartButtonLocator);
    }

    public void clickYTO(){
       mouseHoverOverElement(enterOrdersMenuLocator);
       clickThis(notificationCloseLocator);
       mouseHoverOverElement(enterOrdersMenuLocator);
       clickThis(ytoOptLocator);
    }

    public void clickProfile(){
        clickThis(topNavMyAccountLocator);
        clickThis(notificationCloseLocator);
        clickThis(topNavMyAccountLocator);
        clickThis(menuProfileLocator);
    }

    public void signIn (String email, String password) {
        clickThis(signInButtonLocator);
        type(emailAccountFieldSinginLocator,email);
        type(passwordAccountFieldSinginLocator,password);
        clickThis(signInLocator);

    }

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
