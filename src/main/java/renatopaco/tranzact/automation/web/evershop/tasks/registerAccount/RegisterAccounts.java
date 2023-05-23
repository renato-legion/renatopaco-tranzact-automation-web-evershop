package renatopaco.tranzact.automation.web.evershop.tasks.registerAccount;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.thucydides.core.annotations.Step;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.RegisterPage;
import static net.serenitybdd.screenplay.Tasks.instrumented;
/**
 * @author Renato Paco
 */
public class RegisterAccounts implements Task {

    private final String user;
    private final String password;
    private final String email;

    public RegisterAccounts(String user, String password,String email ) {
        this.user = user;
        this.password = password;
        this.email  = email;
    }

    @Override
    @Step("{0} {0} Ingresamos datos de usuario para Registro")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(RegisterPage.INP_FULLNAME_REGISTER),
                Enter.theValue(email).into(RegisterPage.INP_EMAIL_REGISTER),
                Enter.theValue(password).into(RegisterPage.INP_PASSWORD_REGISTER),
                Click.on(RegisterPage.BTN_SIGNUP_REGISTER)
        );

    }

    public static Performable withData(String user, String password,String email) {
        return instrumented(RegisterAccounts.class, user, password,email);
    }
}
