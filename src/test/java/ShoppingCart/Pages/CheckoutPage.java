package ShoppingCart.Pages;

import ShoppingCart.Objects.BillingDetails;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage{
    @FindBy(id="billing_first_name")
    private WebElement FirstName;
    @FindBy(id = "billing_last_name")
    private WebElement LastName;
    @FindBy(id = "billing_country")
    private WebElement country;
    @FindBy(id = "billing_address_1")
    private WebElement address;
    @FindBy(id="billing_city")
    private WebElement city;
    @FindBy(id = "billing_state")
    private WebElement state;
    @FindBy(id = "billing_postcode")
    private WebElement pincode;
    @FindBy(id = "billing_email")
    private  WebElement Email;
    @FindBy(id = "place_order")
    private WebElement placeOrder;
    @FindBy(css = ".woocommerce-notice")
    private WebElement orderMessage;

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutPage enterBillingFirstName(String firstName)
    {
        wait.until(ExpectedConditions.visibilityOf(FirstName)).sendKeys(firstName);
        return this;
    }
    public CheckoutPage enterBillingLastName(String lastName){
        wait.until(ExpectedConditions.visibilityOf(LastName)).sendKeys(lastName);
return this;
    }
    public CheckoutPage enterCountry(String Country){
        Select select=new Select(wait.until(ExpectedConditions.visibilityOf(country)));
        select.selectByVisibleText(Country);
        return this;
    }
    public CheckoutPage streetAddress(String Address){
        wait.until(ExpectedConditions.visibilityOf(address)).sendKeys(Address);
        return this;
    }
    public CheckoutPage Town(String Town)
    {
        wait.until(ExpectedConditions.visibilityOf(city)).sendKeys(Town);
        return this;
    }
    public CheckoutPage State(String State)
    {
        Select stat=new Select(wait.until(ExpectedConditions.visibilityOf(state)));
        stat.selectByVisibleText(State);
        return this;
    }
    public CheckoutPage PinCode(String pinCode)
    {
        wait.until(ExpectedConditions.visibilityOf(pincode)).sendKeys(pinCode);
        return this;
    }
    public CheckoutPage Email(String email)
    {
        wait.until(ExpectedConditions.visibilityOf(Email)).sendKeys(email);
        return this;
    }
    public CheckoutPage PlaceOrder()
    {
        wait.until(ExpectedConditions.elementToBeClickable(placeOrder)).click();
        return this;
    }
    public CheckoutPage setBillingDetails(BillingDetails billingDetails)
    {
        return enterBillingFirstName(billingDetails.getFirstName()).enterBillingLastName(billingDetails.getLastName()).enterCountry(billingDetails.getCountry())
                .streetAddress(billingDetails.getAddress()).Town(billingDetails.getCity()).State(billingDetails.getState()).PinCode(billingDetails.getZipCode()).Email(billingDetails.getEmail());
    }
    public String orderSummary()
    {
        return wait.until(ExpectedConditions.visibilityOf(orderMessage)).getText();
    }


}
