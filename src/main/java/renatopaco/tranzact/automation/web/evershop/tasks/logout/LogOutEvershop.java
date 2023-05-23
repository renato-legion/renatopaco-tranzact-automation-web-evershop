package renatopaco.tranzact.automation.web.evershop.tasks.logout;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.MenuAccountPage;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.RegisterPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LogOutEvershop implements Task{

    @Override
    @Step("Click in Logout Session")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MenuAccountPage.TXTBTN_LOGOUT_MENUACCOUNT, isVisible()).forNoMoreThan(100).milliseconds(),
                Click.on(MenuAccountPage.TXTBTN_LOGOUT_MENUACCOUNT)
        );
    }
}
