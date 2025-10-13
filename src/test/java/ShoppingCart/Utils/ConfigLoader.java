package ShoppingCart.Utils;

import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigLoader {
    private final Properties properties;
    private static ConfigLoader loader;
    private ConfigLoader()  {
        properties=PropertiesUtil.propertyLoader("src/test/resources/config.properties");
    }
    public static ConfigLoader config() {
        try {
            if (loader == null) {
                loader = new ConfigLoader();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return loader;
    }
    public String getBaseUrl(){
        String url=properties.getProperty("baseUrl");
        if(url!=null)
        {
            return url;
        }
        else{
            throw new RuntimeException("No such property in base file ");
        }
    }

}
