package renatopaco.tranzact.automation.web.evershop.tasks.login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.RegisterPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class ButtomLoginSectionWITHACC implements Task {

    @Override
    @Step("Click in LoginSection with ACC")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(RegisterPage.BTN_LOGINSECTION_WITHACCOUNT, isVisible()).forNoMoreThan(100).milliseconds(),
                Click.on(RegisterPage.BTN_LOGINSECTION_WITHACCOUNT)
        );
    }



}
