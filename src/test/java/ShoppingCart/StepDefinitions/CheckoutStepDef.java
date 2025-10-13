package ShoppingCart.StepDefinitions;

import ShoppingCart.Constants.EndPoints;
import ShoppingCart.CustomType.customDataTable;
import ShoppingCart.Factory.DriverFactory;
import ShoppingCart.Objects.BillingDetails;
import ShoppingCart.Pages.CartPage;
import ShoppingCart.Pages.CheckoutPage;
import ShoppingCart.Pages.PageFactoryManager;
import ShoppingCart.Pages.StorePage;
import ShoppingCart.TestContext.Context;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class CheckoutStepDef {
    private WebDriver driver;
    private final CheckoutPage checkoutPage;
    public CheckoutStepDef(Context context)
    {

        this.driver=context.driver;
        checkoutPage= PageFactoryManager.getCheckoutPage(driver);
    }


    @When("I entered my billing details")
    public void SetBilling(BillingDetails details)
    {


        checkoutPage.setBillingDetails(details);
    }
    @And("I place an Order")
    public void placeAnOrder()
    {

        checkoutPage.PlaceOrder();
    }
    @Then("the order should be placed successfully")
    public void OrderSummary()
    {

       Assert.assertEquals(checkoutPage.orderSummary(),"Thank you. Your order has been received.");
    }


}
