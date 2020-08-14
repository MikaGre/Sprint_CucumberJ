package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class AccountPage extends BasePage {
    By editProfileLocator = By.xpath("//div[@class='name-section']//a[@class='reading-club'][contains(text(),'Edit')]");
    By lastNameTextBoxLocator = By.xpath("//input[@id='dwfrm_profile_customer_lastname']");
    By firstNameTextBoxLocator = By.xpath("//input[@id='dwfrm_profile_customer_firstname']");
    By profileSaveButtonLocator = By.xpath("//button[@name='dwfrm_profile_save']");
    By headerNameTextLocator = By.xpath("//span[@class='user-data']");
    By profileNameTextBoxLocator = By.xpath("//div[@class='name-section']//div[@class='info']//div[1]");
    By paymentTextLocator = By.xpath("//h2[contains(text(),'Payment & Billing Information')]");
    By addCardLocator = By.xpath("//a[contains(text(),'Add a Card')]");
    By cardNumLocator = By.xpath("//div[@class='form-row newnumber cc-num required']/input");
    By securityCodeLocator = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_cvn");
    By expMonthLocator = By.xpath("//div[contains(text(),'Month')]");
    By expYearLocator = By.xpath("//div[contains(text(),'Year')]");
    By expjanLocator = By.xpath("//li[@class='custom-option select-option']//span[contains(text(),'01')]");
    By exp2023Locator = By.xpath("//span[contains(text(),'2023')]");
    By billingFNameLocator = By.xpath("//div[@class='form-row newfirstname required']/input");
    By billingLNameLocator = By.xpath("//div[@class='form-row newlastname required']/input");
    By billingAddressLocator = By.xpath("//div[@class='form-row newaddrone required']/input");
    By billingZipLocator = By.xpath("//div[@class='form-row newpostal required']/input");
    By billingPhoneLocator = By.xpath("//input[@placeholder='e.g. 111-222-3333']");
    By billingSaveButtonLocator = By.id("applyBtn");
    By cardSectionLocator = By.xpath("//div[@class='cards-section']");


    public void editProfileName(String updatedFirstName, String updatedLastName){
        clickThis(editProfileLocator);
        new LandingPage().selectOtherTitle();
        clearField(firstNameTextBoxLocator);
        clearField(lastNameTextBoxLocator);
        type(firstNameTextBoxLocator,updatedFirstName);
        type(lastNameTextBoxLocator,updatedLastName);
        clickThis(profileSaveButtonLocator);
    }

    public String getHeaderName(){
        return getTextFromElement(headerNameTextLocator);
    }

    public String getProfileBoxName(){
        return getTextFromElement(profileNameTextBoxLocator);
    }

    public void inputCardInfo(String cardNum,String securityCode ){
        scrollToElement(paymentTextLocator);
        clickThis(addCardLocator);

        type(cardNumLocator,cardNum);
        type(securityCodeLocator,securityCode);
        clickThis(expMonthLocator);
        clickThis(expjanLocator);
        clickThis(expYearLocator);
        clickThis(exp2023Locator);
    }

    public void inputBillingInfo(String fName, String lName, String address, String zip, String phone){
        type(billingFNameLocator,fName);
        type(billingLNameLocator,lName);
        type(billingAddressLocator,address);
        type(billingZipLocator,zip);
        type(billingPhoneLocator,phone);
        clickThis(billingSaveButtonLocator);

    }

    public boolean isCardPresent(String last4cardNum){
        return isPresentTextFromList(cardSectionLocator,last4cardNum);
    }
}
