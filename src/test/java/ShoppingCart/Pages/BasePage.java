package ShoppingCart.Pages;

import ShoppingCart.Utils.ConfigLoader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    public BasePage(WebDriver driver)
    {
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver,this);
    }
    public void load(String url) {
        driver.get(ConfigLoader.config().getBaseUrl() +url);
    }
}
