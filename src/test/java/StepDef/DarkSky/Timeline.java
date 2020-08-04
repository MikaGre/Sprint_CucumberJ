package StepDef.DarkSky;

import Drivers.Web;
import Pages.Darksky.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class Timeline {
    LandingPage landingPage = new LandingPage();

    @Given("^I am on Darksky home page$")
    public void i_am_on_Darksky_home_page()  {
        Web.initDriver("https://darksky.net/");
    }

    @Then("^I verify timeline is displayed with (\\d+) hours increment$")
    public void i_verify_timeline_is_displayed_with_hours_increment(int increment) {
        Assert.assertTrue(landingPage.getTimelineHr(increment));
    }

}
