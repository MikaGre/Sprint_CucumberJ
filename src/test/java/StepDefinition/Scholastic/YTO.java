package StepDefinition.Scholastic;

import Pages.Scholastic.LandingPage;
import Pages.Scholastic.YTOPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class YTO {
    LandingPage landingPage = new LandingPage();
    YTOPage yto = new YTOPage();

    @When("^I go to YTO page$")
    public void i_go_to_YTO_page()  {
        landingPage.clickYTO();
    }

    @When("^I go to By Flyer tab$")
    public void i_go_to_By_Flyer_tab()  {
        yto.scrollToTable();
    }

    @When("^I click on Price-Qty$")
    public void i_click_on_Price_Qty() {
        yto.clickPriceQty();
    }

    @Then("^I verify jumper with text is displayed$")
    public void i_verify_jumper_with_text_is_displayed() {
        Assert.assertTrue(yto.isJumperVis());
        yto.closeJumper();
    }

    @Then("^I verify jumper is NOT displayed$")
    public void i_verify_jumper_is_NOT_displayed()  {
        Assert.assertFalse(yto.isJumperVis());
    }

    @When("^I click on BonusPoint-Qty box$")
    public void i_click_on_BonusPoint_Qty_box() {
        yto.clickBonusQty();

    }

    @Then("^I click on Price-Qty box$")
    public void i_click_on_Price_Qty_box() {
        yto.clickPriceQty();
    }

    @Then("^I verify jumper is displayed$")
    public void i_verify_jumper_is_displayed()  {
        Assert.assertTrue(yto.isJumperVis());
    }

}
