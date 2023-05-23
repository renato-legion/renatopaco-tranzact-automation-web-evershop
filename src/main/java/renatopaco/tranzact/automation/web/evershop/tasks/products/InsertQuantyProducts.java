package renatopaco.tranzact.automation.web.evershop.tasks.products;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.ProductsPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InsertQuantyProducts implements Task {
    private final String quantityProducts;

    public InsertQuantyProducts(String quantityProducts) {
        this.quantityProducts = quantityProducts;
    }
    @Override
    @Step("Insert Quantity Products")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Clear.field(ProductsPage.TXTBX_QUANTITY_DETAILPRODUCT).then(Enter.theValue(quantityProducts).into(ProductsPage.TXTBX_QUANTITY_DETAILPRODUCT)));

    }

    public static Performable withData(String quantityProducts) {
        return instrumented(InsertQuantyProducts.class, quantityProducts);
    }

}
