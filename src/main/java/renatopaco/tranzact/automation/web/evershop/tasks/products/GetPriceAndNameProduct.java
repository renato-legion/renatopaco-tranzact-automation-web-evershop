package renatopaco.tranzact.automation.web.evershop.tasks.products;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.GetPriceNameProducts;

public class GetPriceAndNameProduct implements Task {

    GetPriceNameProducts getPriceNameProducts = new GetPriceNameProducts();
    static String PrecioProductoTask=null;
    static String NameProductTask=null;
    @Override
    @Step("TraerPrecio")
    public <T extends Actor> void performAs(T actor) {
        getPriceNameProducts.seteaPrecioProducto();
        PrecioProductoTask = getPriceNameProducts.getPrecioProducto();
        NameProductTask = getPriceNameProducts.getNombreProducto();
        System.out.println("Precio:" + PrecioProductoTask + " Name: "+NameProductTask);
        Serenity.setSessionVariable("Price").to(PrecioProductoTask);
        Serenity.setSessionVariable("Name").to(NameProductTask);
    }

}
