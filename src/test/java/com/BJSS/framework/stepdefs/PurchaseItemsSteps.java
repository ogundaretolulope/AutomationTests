package com.BJSS.framework.stepdefs;

import com.BJSS.framework.models.OrderHistoryPageModel;
import com.BJSS.framework.models.QuickViewModel;
import com.BJSS.framework.models.SearchPageModel;
import com.BJSS.framework.page_objects.cms.*;
import com.BJSS.framework.page_objects.gui.QuickViewPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class PurchaseItemsSteps {

    private CartSummaryPage cartSummaryPage;
    private HomePage homePage;
    private MyAccountPage myAccountPage;
    private SearchPage searchPage;
    private ShippingAddressPage shippingAddressPage;
    private OrderHistoryPage orderHistoryPage;
    private BillingAddressPage billingAddressPage;
    private PaymentPage paymentPage;
    private QuickViewPage quickViewPage;
    private QuickViewModel quickViewModel;
    private SearchPageModel searchPageModel;
    private OrderConfirmationPage orderConfirmationPage;
    private OrderHistoryPageModel orderHistoryPageModel;

    public PurchaseItemsSteps
        (CartSummaryPage CartSummaryPage, HomePage HomePage, MyAccountPage MyAccountPage,
          SearchPage SearchPage, ShippingAddressPage ShippingAddressPage, OrderHistoryPage OrderHistoryPage,
          BillingAddressPage BillingAddressPage, PaymentPage PaymentPage, QuickViewPage QuickViewPage,
         QuickViewModel QuickViewModel, SearchPageModel SearchPageModel, OrderConfirmationPage OrderConfirmationPage,
         OrderHistoryPageModel OrderHistoryPageModel)
    {
        this.cartSummaryPage = CartSummaryPage;
        this.homePage = HomePage;
        this.myAccountPage = MyAccountPage;
        this.searchPage = SearchPage;
        this.shippingAddressPage = ShippingAddressPage;
        this.orderHistoryPage = OrderHistoryPage;
        this.billingAddressPage = BillingAddressPage;
        this.paymentPage = PaymentPage;
        this.quickViewPage = QuickViewPage;
        this.quickViewModel = QuickViewModel;
        this.searchPageModel = SearchPageModel;
        this.orderConfirmationPage = OrderConfirmationPage;
        this.orderHistoryPageModel = OrderHistoryPageModel;
    }

    @Given ("^I am logged in customer on homepage$")
    public void iAmLoggedInCustomerOnHomepage() throws Throwable {
        homePage.startHomepage();
        homePage.clickSignIn();
        myAccountPage.login();
        myAccountPage.returnToHomepage();
    }

    @When("^I search for (?:an|another) item '(.*)'$")
    public void iSearchForAnItem(String item){
        homePage.searchItem(item);
        searchPageModel.setItemName(item);
    }

    @And("^I quick view the item from the search results page$")
    public void iQuickViewItemFromTheSearchResultsPage(){
        String item = searchPageModel.getItemName();
        searchPage.quickViewAnItem(item);
        quickViewPage.focusOnQuickView();
        if(item.equalsIgnoreCase("Printed Dress")) {
            quickViewModel.setItem2DefaultSize(quickViewPage.getDefaultSize());
            quickViewModel.setItem2Price(quickViewPage.getUnitPrice());
        }
    }

    @And("^I change the size to '(.*)'$")
    public void iChangeTheSize(String size){
        quickViewPage.selectASize(size);
        quickViewModel.setItem1SelectedSize(size);
        quickViewModel.setItem1Price(quickViewPage.getUnitPrice());
    }

    @And("^I add the item to basket$")
    public void iAddTheItemToBasket(){
        quickViewPage.clickAddToCart();
        quickViewPage.clickContinueShopping();
    }

    @And("^I proceed to basket summary$")
    public void iProceedToBasketSummary(){
        homePage.clickCartSummary();
    }

    @Then("^I verify that the items sizes are correct$")
    public void iVerifyThatTheItemsSizesAreCorrect(){
        String item1ExpectedSize = quickViewModel.getItem1SelectedSize();
        String item2ExpectedSize = quickViewModel.getItem2DefaultSize();

        assertTrue(cartSummaryPage.getItemSizeColourPrice("Blouse").trim().contains("Size : "+item1ExpectedSize));
        assertTrue(cartSummaryPage.getItemSizeColourPrice("Printed Dress").trim().contains("Size : "+item2ExpectedSize));
    }

    @And("^I verify that the items prices are correct$")
    public void iVerifyThatTheItemsPricesAreCorrect(){
        String item1ExpectedPrice = quickViewModel.getItem1Price();
        String item2ExpectedPrice = quickViewModel.getItem2Price();

        assertTrue(cartSummaryPage.getItemSizeColourPrice("Blouse").trim().contains(item1ExpectedPrice));
        assertTrue(cartSummaryPage.getItemSizeColourPrice("Printed Dress").trim().contains(item2ExpectedPrice));
        assertEquals(cartSummaryPage.addAllItemsTotal(), (cartSummaryPage.getTotalProducts()));

        Double addTotalAndShipping = cartSummaryPage.getTotalProducts() + cartSummaryPage.getTotalShipping();
        assertEquals(cartSummaryPage.getTotalBeforeShipping(), addTotalAndShipping);
   }

    @And("^I am able to complete my order successfully$")
    public void iCanCompleteMyOrderSuccessfully(){
        cartSummaryPage.clickCheckoutBtn();
        billingAddressPage.clickProceedToCheckoutBtn();
        shippingAddressPage.clicktAndcTickbox();
        shippingAddressPage.clickProceedToCheckoutBtn();
        paymentPage.clickPayByWireBtn();
        paymentPage.clickConfirmOrderBtn();
        assertTrue(orderConfirmationPage.getOrderConfirmationTitle().isDisplayed());
        orderConfirmationPage.clickLogOut();
    }

    @And("^I click to view orders history$")
    public void iClickPreviousOders(){
        myAccountPage.clickOrderHistory();
    }

    @And("^I select an item from my previous order$")
    public void iSelectAnItemFromPreviousOrder(){
        orderHistoryPage.sortOrderByMostRecent();
        orderHistoryPage.selectLastOrder();
        orderHistoryPage.selectAnItemFromOrder();
    }

    @And("^I navigate to my account section$")
    public void iNavigateToMyAccountSection(){
        homePage.clickMyAccount();
    }

    @When("^I add a comment$")
    public void iAddAComment(){
        orderHistoryPage.addCommentToOrder();
        orderHistoryPage.clickSendComment();
    }

    @Then("^I verify the comment appears under message$")
    public void iVerifyTheCommentAppearsUnderMessage(){
        assertEquals(orderHistoryPage.lastSavedComment(), orderHistoryPageModel.getOrderComment());
        assertEquals("blue", "red");
    }

    @After
    public void embedScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) homePage.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException wde) {
                System.err.println(wde.getMessage());
            } catch (ClassCastException cce) {
                cce.printStackTrace();
            }
        }
    }
}