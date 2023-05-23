package renatopaco.tranzact.automation.web.evershop.tasks.cart;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.CartPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClicPlaceOrder implements Task {

    @Override
    @Step("Clic Place Order")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CartPage.BTN_PLACEHOLDER_PAYMENT, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CartPage.BTN_PLACEHOLDER_PAYMENT)

        );
    }
}
