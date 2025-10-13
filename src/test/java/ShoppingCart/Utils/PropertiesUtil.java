package ShoppingCart.Utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class PropertiesUtil {
    public static Properties propertyLoader(String FilePath) {
        Properties properties = null;
        BufferedReader Reader = null;
        try {
            if (FilePath != null) {
                Reader=   new BufferedReader(new FileReader(FilePath));
            }
            properties=new Properties();
            try {
                if(Reader!=null) {
                    properties.load(Reader);
                    Reader.close();
                }
                else{
                    throw new RuntimeException("Failed to Load the properties file");
                }
            }
            catch (Exception e1)
            {
                throw new RuntimeException("Failed to Load the properties file");
            }


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return properties;
    }
}
