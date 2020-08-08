package StepDef.Scholastic;

import Drivers.Web;
import Pages.Scholastic.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateAccount {
    LandingPage landingPage = new LandingPage();

    @Given("^I am on the Homepage$")
    public void i_am_on_the_Homepage() {
        Web.initDriver("https://clubs3qa1.scholastic.com/home");
    }

    @When("^I tap on 'Create an Account'$")
    public void i_tap_on_Create_an_Account()  {
        landingPage.clickCreateAccountButton();
    }


    @When("^I click on Teacher radio button if not selected$")
    public void i_click_on_Teacher_radio_button_if_not_selected()  {
        landingPage.clickOnNextButton();
    }

    @When("^I fill out all required fields$")
    public void i_fill_out_all_required_fields()  {
        //Selects the title OTHER
        landingPage.selectOtherTitle();

        landingPage.typeFirstName("Margo");
        landingPage.typeLastName("Tulsa");
        landingPage.typeEmail("MargoT12345@gmail.com");
        landingPage.typePassword("password1234");
        landingPage.typeMobileNum("317-222-2323");

        landingPage.checkTermsBox();
        //Clicks the next button below terms of service
        landingPage.clickAccountNextButton();
        //Enters provided zipcode
        landingPage.typeZipCode("10001");
        landingPage.clickOnSearchButton();
        //Uses an aberration to view the list of schools while also providing the entire name for selection method
        landingPage.typeSchool("Tt","Tt Of Nyc");
        landingPage.clickOnSchoolNextButton();
        //Selects a Teacher as the role
        landingPage.selectTeacher();
        //Selects 12th grade
        landingPage.selectSenGrade();
        //Enters 20 as the amount of child
        landingPage.typeStudentAmt("20");

    }

    @When("^I submit the form$")
    public void i_submit_the_form() {

    }

    @Then("^I verify successful creation of a user profile$")
    public void i_verify_successful_creation_of_a_user_profile() {

    }

}
