package ShoppingCart.StepDefinitions;

import ShoppingCart.Constants.EndPoints;
import ShoppingCart.Factory.DriverFactory;
import ShoppingCart.Objects.Product;
import ShoppingCart.Pages.PageFactoryManager;
import ShoppingCart.Pages.StorePage;
import ShoppingCart.TestContext.Context;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class StoreStepDef {
    private WebDriver driver;
    private final StorePage storePage;

    public StoreStepDef(Context context)
    {

        this.driver=context.driver;
        storePage= PageFactoryManager.getStorePage(driver);
    }
    @When("I add a {product} to the cart")
    public void iAddAProductToTheCart(Product product)
    {
        storePage.addToCart(product.getProductName());
    }
    @Given("I am on Store Page")
    public void i_am_on_store_page()
    {

        storePage.load(EndPoints.STORE.url);
    }
}
