package ShoppingCart.CustomType;

import ShoppingCart.Objects.BillingDetails;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class customDataTable {

    @DataTableType
    public BillingDetails billingDetails(Map<String,String> data)
    {
        return new BillingDetails(data.get("firstName"),data.get("LastName"),data.get("Country")
        ,data.get("streetAddress"),data.get("City"),data.get("State"),
                data.get("ZipCode"),data.get("Email"));
    }
}
