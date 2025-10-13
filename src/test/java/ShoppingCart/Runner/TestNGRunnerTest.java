package ShoppingCart.Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(plugin = {"html:target/cucumber.cucumber.html"},
        glue = {"ShoppingCart.StepDefinitions","ShoppingCart.Hooks","ShoppingCart.CustomType"},
        features = "src/test/resources/Features"
        )
public class TestNGRunnerTest extends AbstractTestNGCucumberTests {
@DataProvider(parallel = true)
    public Object[][] scenarios()
{
    return super.scenarios();
}

}
