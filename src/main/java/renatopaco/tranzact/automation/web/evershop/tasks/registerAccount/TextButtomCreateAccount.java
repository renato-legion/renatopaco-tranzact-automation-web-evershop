package renatopaco.tranzact.automation.web.evershop.tasks.registerAccount;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.RegisterPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

/**
 * @author Renato Paco
 */
public class TextButtomCreateAccount implements Task {

    @Override
    @Step("Click in CreateAccount")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(RegisterPage.TXTBTN_CREATEACCOUNT, isVisible()).forNoMoreThan(100).milliseconds(),
                Click.on(RegisterPage.TXTBTN_CREATEACCOUNT)
        );
    }
}
