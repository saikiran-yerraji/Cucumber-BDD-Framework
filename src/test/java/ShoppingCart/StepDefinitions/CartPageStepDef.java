package ShoppingCart.StepDefinitions;

import ShoppingCart.Constants.EndPoints;
import ShoppingCart.Factory.DriverFactory;
import ShoppingCart.Objects.Product;
import ShoppingCart.Pages.CartPage;
import ShoppingCart.Pages.PageFactoryManager;
import ShoppingCart.Pages.StorePage;
import ShoppingCart.TestContext.Context;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartPageStepDef {
    private WebDriver driver;
    private final CartPage cartPage;
    public  CartPageStepDef(Context context)
    {
        this.driver=context.driver;
        cartPage= PageFactoryManager.getCartPage(driver);
    }
   @Then("I should be see {int} {product} in the cart")
    public void iShoulBeSeeProductInTheCart(int quantity,Product product)
    {

        Assert.assertEquals(cartPage.getProductName(),product.getProductName());
        Assert.assertEquals(cartPage.getProductQuantity(),quantity);
    }
    @And("I navigated to checkout Page")
    public void inCheckoutPage(){


        cartPage.checkoutPage();

    }
}
