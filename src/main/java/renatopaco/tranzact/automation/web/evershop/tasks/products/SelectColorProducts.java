package renatopaco.tranzact.automation.web.evershop.tasks.products;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.ProductsPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectColorProducts implements Task {
    private final String colorProducts;

    public SelectColorProducts(String colorProducts) {
        this.colorProducts = colorProducts;
    }
    @Override
    @Step("Select Color Products")
    public <T extends Actor> void performAs(T actor) {
        switch (colorProducts){
            case "White":
                actor.attemptsTo(
                        WaitUntil.the(ProductsPage.BTN_COLOR_WHITE_DETAILPRODUCT, isVisible()).forNoMoreThan(15).seconds(),
                        Click.on(ProductsPage.BTN_COLOR_WHITE_DETAILPRODUCT)
                );

                break;
            case "Pink":
                actor.attemptsTo(
                        WaitUntil.the(ProductsPage.BTN_COLOR_PINK_DETAILPRODUCT, isVisible()).forNoMoreThan(15).seconds(),
                        Click.on(ProductsPage.BTN_COLOR_PINK_DETAILPRODUCT)
                );

                break;
            case "Green":
                actor.attemptsTo(
                        WaitUntil.the(ProductsPage.BTN_COLOR_GREEN_DETAILPRODUCT, isVisible()).forNoMoreThan(15).seconds(),
                        Click.on(ProductsPage.BTN_COLOR_GREEN_DETAILPRODUCT)
                );
                break;
            case "Black":
                actor.attemptsTo(
                        WaitUntil.the(ProductsPage.BTN_COLOR_BLACK_DETAILPRODUCT, isVisible()).forNoMoreThan(15).seconds(),
                        Click.on(ProductsPage.BTN_COLOR_BLACK_DETAILPRODUCT)
                );
                break;
            case "Brown":
                actor.attemptsTo(
                        WaitUntil.the(ProductsPage.BTN_COLOR_BROWN_DETAILPRODUCT, isVisible()).forNoMoreThan(15).seconds(),
                        Click.on(ProductsPage.BTN_COLOR_BROWN_DETAILPRODUCT)
                );
                break;
            case "Blue":
                actor.attemptsTo(
                        WaitUntil.the(ProductsPage.BTN_COLOR_BLUE_DETAILPRODUCT, isVisible()).forNoMoreThan(15).seconds(),
                        Click.on(ProductsPage.BTN_COLOR_BLUE_DETAILPRODUCT)
                );
                break;
            case "Red":
                actor.attemptsTo(
                        WaitUntil.the(ProductsPage.BTN_COLOR_RED_DETAILPRODUCT, isVisible()).forNoMoreThan(15).seconds(),
                        Click.on(ProductsPage.BTN_COLOR_RED_DETAILPRODUCT)
                );
                break;
            default:
                System.out.println("COLOR is not found in that product.");

        }

    }

    public static Performable withData(String colorProducts) {
        return instrumented(SelectColorProducts.class, colorProducts);
    }

}
