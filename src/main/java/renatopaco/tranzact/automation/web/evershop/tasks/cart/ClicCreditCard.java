package renatopaco.tranzact.automation.web.evershop.tasks.cart;

import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.CartPage;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.InsertCardInformation;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClicCreditCard implements Task {
    InsertCardInformation insertCardInformation = new InsertCardInformation();
    @SneakyThrows
    @Override
    @Step("Clic Credit Card")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CartPage.BTN_CREDITCARD_PAYMENT, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CartPage.BTN_CREDITCARD_PAYMENT),
                WaitUntil.the(CartPage.BTN_TEST_SUCCESS_CREDITCARD_PAYMENT, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CartPage.BTN_TEST_SUCCESS_CREDITCARD_PAYMENT)
        );
//        insertCardInformation.putCorrectCreditCard();
//        Click.on(CartPage.TXTBX_CARDNUMBER_CREDITCARD_PAYMENT);
//        Enter.theValue("4242424242424242").into(CartPage.TXTBX_CARDNUMBER_CREDITCARD_PAYMENT);
//
//        actor.attemptsTo(
//        Click.on(CartPage.TXTBX_CARDEXPIRY_CREDITCARD_PAYMENT)
//        );
    }
}
