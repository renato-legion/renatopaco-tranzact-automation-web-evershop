package renatopaco.tranzact.automation.web.evershop.tasks.cart;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.CartPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillShippingInformation implements Task {


    @Override
    @Step("Fill Shipping Information")
    public <T extends Actor> void performAs(T rena) {

        rena.attemptsTo(
                WaitUntil.the(CartPage.TXTBX_FULLNAME_SHIPPING, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue("Renato Paco Huerta").into(CartPage.TXTBX_FULLNAME_SHIPPING),
                Enter.theValue("987654321").into(CartPage.TXTBX_TELEPHONE_SHIPPING),
                Enter.theValue("Av. la Molina 378, La Molina").into(CartPage.TXTBX_ADDRESS_SHIPPING),
                Enter.theValue("Lima Metropolitana").into(CartPage.TXTBX_CITY_SHIPPING),
                Click.on(CartPage.DROPDOWN_COUNTRY_SHIPPING).then(Click.on(CartPage.DROPDOWN_COUNTRY_USA_SHIPPING)),
                Enter.theValue("07001").into(CartPage.TXTBX_POSTCODE_SHIPPING),
                Click.on(CartPage.DROPDOWN_PROVINCE_SHIPPING).then(Click.on(CartPage.DROPDOWN_PROVINCE_USA_SHIPPING)),

                WaitUntil.the(CartPage.RADIOBTN_EXPRESSDELIVERY_SHIPPING, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CartPage.RADIOBTN_EXPRESSDELIVERY_SHIPPING),

                WaitUntil.the(CartPage.BTN_CONTINUE_PAYMENT_SHIPPING, isVisible()).forNoMoreThan(2500).milliseconds(),
                Click.on(CartPage.BTN_CONTINUE_PAYMENT_SHIPPING)
        );

    }
}
