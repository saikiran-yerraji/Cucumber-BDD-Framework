package ShoppingCart.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage{

    @FindBy(xpath = "//td[@class='product-name']/a")
    public WebElement productName;
    @FindBy(css = "input[type='number']")
    public WebElement quantity;
    @FindBy(xpath="//a[normalize-space()='Proceed to checkout']")
    public WebElement proccedToCheckout;
    public CartPage(WebDriver driver) {
        super(driver);
    }
    public String getProductName()
    {
        return wait.until(ExpectedConditions.visibilityOf(productName)).getText();
    }
    public int getProductQuantity()
    {

        return Integer.parseInt(wait.until(ExpectedConditions.visibilityOf(quantity)).getAttribute("value"));
    }
    public void checkoutPage(){
        wait.until(ExpectedConditions.elementToBeClickable(proccedToCheckout)).click();

    }
}
