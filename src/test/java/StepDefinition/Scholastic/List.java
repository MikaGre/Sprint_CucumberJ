package StepDefinition.Scholastic;

import Pages.Scholastic.LandingPage;
import Pages.Scholastic.ListPage;
import Pages.Scholastic.ProductPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class List {
    LandingPage landingPage = new LandingPage();
    ProductPage productPage = new ProductPage();
    ListPage listPage = new ListPage();
    int amt1;
    int amt2;

    @When("^I search '(.+)' using search box$")
    public void i_search_Harry_using_search_box(String item)  {
       landingPage.clickOnMyListPop();
       amt1 = listPage.getAmt();
       landingPage.searchItem(item);
    }

    @When("^I click on '(star|heart)' icon$")
    public void i_click_on_star_icon(String typeOfList) {
        productPage.setStarHarryItem();
        landingPage.clickRecommendationList();
        amt2 = listPage.getAmt();
    }

    @Then("^I verify item is added to recommended list$")
    public void i_verify_item_is_added_to_recommended_list()  {
        Assert.assertNotEquals(amt1,amt2,"Amounts are the same");
    }


}
