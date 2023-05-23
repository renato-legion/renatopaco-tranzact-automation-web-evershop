package renatopaco.tranzact.automation.web.evershop.tasks.products;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.ProductsPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectSizeProducts implements Task {
    private final String sizeProducts;

    public SelectSizeProducts(String sizeProducts) {
        this.sizeProducts = sizeProducts;
    }

    @Override
    @Step("Select Size Products")
    public <T extends Actor> void performAs(T actor) {
        switch (sizeProducts){
            case "S":
                actor.attemptsTo(
                        WaitUntil.the(ProductsPage.BTN_SIZE_S_DETAILPRODUCT, isVisible()).forNoMoreThan(15).seconds(),
                        Click.on(ProductsPage.BTN_SIZE_S_DETAILPRODUCT)
                );

                break;
            case "M":
                actor.attemptsTo(
                        WaitUntil.the(ProductsPage.BTN_SIZE_M_DETAILPRODUCT, isVisible()).forNoMoreThan(15).seconds(),
                        Click.on(ProductsPage.BTN_SIZE_M_DETAILPRODUCT)
                );

                break;
            case "L":
                actor.attemptsTo(
                        WaitUntil.the(ProductsPage.BTN_SIZE_L_DETAILPRODUCT, isVisible()).forNoMoreThan(15).seconds(),
                        Click.on(ProductsPage.BTN_SIZE_L_DETAILPRODUCT)
                );
                break;
            case "X":
                actor.attemptsTo(
                        WaitUntil.the(ProductsPage.BTN_SIZE_X_DETAILPRODUCT, isVisible()).forNoMoreThan(15).seconds(),
                        Click.on(ProductsPage.BTN_SIZE_X_DETAILPRODUCT)
                );
                break;
            case "XL":
                actor.attemptsTo(
                        WaitUntil.the(ProductsPage.BTN_SIZE_XL_DETAILPRODUCT, isVisible()).forNoMoreThan(15).seconds(),
                        Click.on(ProductsPage.BTN_SIZE_XL_DETAILPRODUCT)
                );
                break;
            default:
                System.out.println("SIZE is not found in that product.");

        }

    }

    public static Performable withData(String sizeProducts) {
        return instrumented(SelectSizeProducts.class, sizeProducts);
    }
}
