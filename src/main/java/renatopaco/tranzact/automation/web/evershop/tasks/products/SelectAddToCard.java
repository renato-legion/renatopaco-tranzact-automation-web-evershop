package renatopaco.tranzact.automation.web.evershop.tasks.products;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.MenuAccountPage;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.ProductsPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

/**
 * @author Renato Paco
 */
public class SelectAddToCard implements Task {
    @Override
    @Step("Agregar al carrito")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ProductsPage.BTN_ADDTOCART_DETAILPRODUCT, isVisible()).forNoMoreThan(2500).milliseconds(),
                Click.on(ProductsPage.BTN_ADDTOCART_DETAILPRODUCT),
                WaitUntil.the(ProductsPage.LBL_DETAILCART_DETAILPRODUCT, isVisible()).forNoMoreThan(4).seconds(),
                Click.on(ProductsPage.BTN_CONTINUESHOPPING_DETAILPRODUCT),
                WaitUntil.the(MenuAccountPage.TXTBTN_KIDS_MENU_MENUACCOUNT, isVisible()).forNoMoreThan(4).seconds()
        );

    }
}
