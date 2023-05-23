package renatopaco.tranzact.automation.web.evershop.tasks.products;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import renatopaco.tranzact.automation.web.evershop.tasks.menu.SelectMenuKWM;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.MenuAccountPage;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.ProductsPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectProducts  implements Task {

    private final String positionImage;

    public SelectProducts(String positionImage) {
        this.positionImage = positionImage;
    }
    @Override
    @Step("Select Products")
    public <T extends Actor> void performAs(T actor) {
        switch (positionImage){
            case "First":
                actor.attemptsTo(
                        WaitUntil.the(ProductsPage.IMG_FIRST_KIDS_WOMAN_MEN, isVisible()).forNoMoreThan(15).seconds(),
                        Click.on(ProductsPage.IMG_FIRST_KIDS_WOMAN_MEN)
                );

                break;
            case "Second":
                actor.attemptsTo(
                        WaitUntil.the(ProductsPage.IMG_SECOND_KIDS_WOMAN_MEN, isVisible()).forNoMoreThan(15).seconds(),
                        Click.on(ProductsPage.IMG_SECOND_KIDS_WOMAN_MEN)
                );

                break;
            case "Third":
                actor.attemptsTo(
                        WaitUntil.the(ProductsPage.IMG_THIRD_KIDS_WOMAN_MEN, isVisible()).forNoMoreThan(15).seconds(),
                        Click.on(ProductsPage.IMG_THIRD_KIDS_WOMAN_MEN)
                );
                break;
            case "Fourth":
                actor.attemptsTo(
                        WaitUntil.the(ProductsPage.IMG_FOURTH_KIDS_WOMAN_MEN, isVisible()).forNoMoreThan(15).seconds(),
                        Click.on(ProductsPage.IMG_FOURTH_KIDS_WOMAN_MEN)
                );
                break;
            default:
                System.out.println("Position is not found.");

        }
    }

    public static Performable withData(String positionImage) {
        return instrumented(SelectProducts.class, positionImage);
    }

}
