package StepDef.Hotels;

import Drivers.Web;
import Pages.Hotels.HotelsLandingPage;
import Pages.Hotels.SelectionDetailsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class Ratings {
        HotelsLandingPage hotelslp = new HotelsLandingPage();
        SelectionDetailsPage detailsPage = new SelectionDetailsPage();

    @Given("^I am on default locations search result screen$")
    public void i_am_on_default_locations_search_result_screen()  {
        Web.initDriver("https://www.hotels.com/");
        hotelslp.closeJoinNowPopUp();
        hotelslp.clickSearchButton();
        hotelslp.enterTextInSearchBox("New York");
        hotelslp.selectDestinationFromAutoSuggestion("New York, New York, United States of America");
        hotelslp.clickSearchButton();
    }

    @When("^I click on (\\d+) star$")
    public void i_click_on_star(int num)  {
        detailsPage.scrollTillRatingIsVis();
        detailsPage.clickOnStarRating(num);
    }

    @When("^I verify hotels are (\\d+) star rating$")
    public void i_verify_hotels_are_star_rating(int num)  {
        Assert.assertTrue(detailsPage.isInListingRatingResults(num));
    }
}
