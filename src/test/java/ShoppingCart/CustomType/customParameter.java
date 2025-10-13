package ShoppingCart.CustomType;

import ShoppingCart.Objects.Product;
import io.cucumber.java.ParameterType;

public class customParameter {

    @ParameterType(".*")
    public Product product(String productName){
        return new Product(productName.replace("\"",""));

    }
}
