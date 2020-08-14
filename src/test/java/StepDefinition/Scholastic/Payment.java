package StepDefinition.Scholastic;

import Pages.Scholastic.AccountPage;
import Pages.Scholastic.CartPage;
import Pages.Scholastic.LandingPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class Payment {
    LandingPage landingPage = new LandingPage();
    AccountPage accountPage = new AccountPage();
    CartPage cartPage = new CartPage();

    @When("^I login$")
    public void i_login(){
        landingPage.signIn("mtest@sch.org","#1Student");
    }

    @When("^I select 'Your Teacher Order' from Enter Orders$")
    public void i_select_Your_Teacher_Order_from_Enter_Orders()  {

    }

    @When("^I go to 'BY FlYER' category$")
    public void i_go_to_BY_FlYER_category()  {

    }

    @When("^I add quantity$")
    public void i_add_quantity()  {

    }

    @When("^I click on 'REVIEW CART' button$")
    public void i_click_on_REVIEW_CART_button()  {

    }

    @When("^I proceed to checkout$")
    public void i_proceed_to_checkout()  {

    }

    @Then("^I verify order has been placed successfully$")
    public void i_verify_order_has_been_placed_successfully()  {

    }

    @When("^I go to My Accounts page$")
    public void i_go_to_My_Accounts_page()  {
        landingPage.clickProfile();
    }

    @When("^I add credit card$")
    public void i_add_credit_card()  {
        accountPage.inputCardInfo("41111111111111111","808");
        accountPage.inputBillingInfo("margo","tester","55 ST Nicholas Ave","10026","2122220092");

    }

    @Then("^I verify credit card is added successfully in My Accounts$")
    public void i_verify_credit_card_is_added_successfully_in_My_Accounts()  {
      Assert.assertTrue(accountPage.isCardPresent("1111"));
    }

    @Then("^I verify added card is displayed when shopping using credit card$")
    public void i_verify_added_card_is_displayed_when_shopping_using_credit_card() {
        landingPage.clickCart();
        cartPage.scrollToCheckoutButtonAndClick();
        cartPage.selectCC();
        Assert.assertTrue(cartPage.isCardPresent("1111"));
    }

}
