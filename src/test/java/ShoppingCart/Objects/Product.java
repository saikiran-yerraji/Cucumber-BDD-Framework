package ShoppingCart.Objects;

public class Product {

    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Product(String productName) {
        this.productName = productName;
    }
}
