package renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;


public class GetPriceNameProducts extends PageObject {
    @FindBy(className = "sale-price")
    WebElement LABEL_PRICE_PRODUCT;

    @FindBy(className = "product-single-name")
    WebElement LABEL_NAME_PRODUCT;

    public String PrecioProducto=null;
    public String NombreProducto=null;

    public void seteaPrecioProducto(){
        PrecioProducto=LABEL_PRICE_PRODUCT.getText();
        PrecioProducto = PrecioProducto.replace("$","");
        PrecioProducto = PrecioProducto.replace(".","");
        PrecioProducto = PrecioProducto.replace("0","");
        System.out.println("PRECIO PRODUCTO: "+ PrecioProducto);
    }
    public String getPrecioProducto(){
        return PrecioProducto;
    }

    public String getNombreProducto(){
        NombreProducto = LABEL_NAME_PRODUCT.getText();
        return NombreProducto;
    }
}
