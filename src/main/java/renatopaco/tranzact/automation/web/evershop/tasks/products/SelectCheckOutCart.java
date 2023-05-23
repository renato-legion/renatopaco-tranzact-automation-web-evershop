package renatopaco.tranzact.automation.web.evershop.tasks.products;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.MenuAccountPage;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.ProductsPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectCheckOutCart implements Task {


    @Override
    @Step("Select CheckOut")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ProductsPage.BTN_CHECKOUT_CART, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(ProductsPage.BTN_CHECKOUT_CART)
        );
    }

}
