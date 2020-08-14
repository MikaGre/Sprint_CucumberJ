package StepDefinition.Hotels;

import Drivers.Web;
import Pages.Hotels.HotelsLandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;


public class ChildrenDropDown {
    HotelsLandingPage hotelLP = new HotelsLandingPage();

    @Given("^I am on hotels landing page$")
    public void i_am_on_hotels_landing_page() {
        Web.initDriver("https://www.hotels.com/");
    }

    @When("^I select (.+) in children dropdown$")
    public void i_select_in_children_dropdown(int expectedDropDowns) {
        hotelLP.clickChildDropDownAndSelectAmt(expectedDropDowns);
    }

    @Then("^I see (\\d+) child age dropdowns$")
    public void i_see_child_age_dropdowns(int expectedDropDowns) {
        int actual = hotelLP.getTotalChildDropDowns();
        Assert.assertEquals(actual,expectedDropDowns,"The amount of drop downs do not match");
    }
}
