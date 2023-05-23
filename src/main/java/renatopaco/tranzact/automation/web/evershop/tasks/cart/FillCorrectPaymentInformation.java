package renatopaco.tranzact.automation.web.evershop.tasks.cart;

import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.SendKeysIntoBy;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Keys;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.CartPage;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.InsertCardInformation;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillCorrectPaymentInformation implements Task {

//    InsertCardInformation insertCardInformation = new InsertCardInformation();

    @Override
    @Step("Fill Correct Payment Information")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
//                WaitUntil.the(CartPage.TXTBX_CARDNUMBER_CREDITCARD_PAYMENT, isVisible()).forNoMoreThan(5).seconds(),
//                Click.on(CartPage.TXTBX_CARDNUMBER_CREDITCARD_PAYMENT),
//                Enter.theValue("1234").into(CartPage.TXTBX_CARDNUMBER_CREDITCARD_PAYMENT)
                Click.on(CartPage.TXTBX_CASHONDELIVERY_PAYMENT)

        );


//                Enter.theValue("4242424242424242").into(CartPage.TXTBX_CARDNUMBER_CREDITCARD_PAYMENT)
//
//                WaitUntil.the(CartPage.TXTBX_CARDEXPIRY_CREDITCARD_PAYMENT, isVisible()).forNoMoreThan(5).seconds(),
//                Click.on(CartPage.TXTBX_CARDEXPIRY_CREDITCARD_PAYMENT),
//                Enter.theValue("04/24").into(CartPage.TXTBX_CARDEXPIRY_CREDITCARD_PAYMENT),
//
//                WaitUntil.the(CartPage.TXTBX_CVV_CREDITCARD_PAYMENT, isVisible()).forNoMoreThan(5).seconds(),
//                Click.on(CartPage.TXTBX_CVV_CREDITCARD_PAYMENT),
//                Enter.theValue("242").into(CartPage.TXTBX_CVV_CREDITCARD_PAYMENT)

//        insertCardInformation.agregainformacionTarjeta();
    }
}
