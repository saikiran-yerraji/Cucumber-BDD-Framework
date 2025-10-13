package ShoppingCart.Hooks;

import ShoppingCart.TestContext.Context;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import ShoppingCart.Factory.DriverFactory;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class Hook {
private  WebDriver driver;
private Context context;

public Hook(Context context)
{
    this.context=context;
}

    @Before
   public void intiBrowser(Scenario scenario){
        System.out.println("In Before Hook Thread ID:"+Thread.currentThread().getId()+" Scenario : "+scenario.getName());
        driver= DriverFactory.intializeDriver( System.getProperty("browser","chrome"));
        context.driver=driver;
    }

    @After
    public void close(Scenario scenario){
        System.out.println("In After Hook Thread ID:"+Thread.currentThread().getId()+" Scenario : "+scenario.getName());
        driver.quit();
    }
}
