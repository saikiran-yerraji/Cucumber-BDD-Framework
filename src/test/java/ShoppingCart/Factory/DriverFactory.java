package ShoppingCart.Factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class DriverFactory {


    public static WebDriver intializeDriver(String browser){
        WebDriver driver=null;
        switch (browser.toUpperCase()) {
            case "CHROME":
            System.setProperty("webdriver.chrome.driver", "D:\\enahncement\\IntegratedExcel\\DRIVER\\chromedriver.exe");
               // WebDriverManager.chromedriver().cachePath("D:\\work\\Cucumber-FrameworkLearning\\DRIVER").setup();
                            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.addArguments(CapabilityType.ACCEPT_INSECURE_CERTS);
            driver = new ChromeDriver(options);

            break;
            case "EDGE":
                System.setProperty("webdriver.edge.driver", "D:\\enahncement\\IntegratedExcel\\DRIVER\\edge.exe");
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--remote-allow-origins=*");
                edgeOptions.addArguments(CapabilityType.ACCEPT_INSECURE_CERTS);
                driver = new EdgeDriver(edgeOptions);
                break;
            default:
                System.out.println("Invalid Browser");

        }

        driver.manage().window().maximize();

        return driver;
    }

}
