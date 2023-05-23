package renatopaco.tranzact.automation.web.evershop.tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.thucydides.core.annotations.Step;
import renatopaco.tranzact.automation.web.evershop.tasks.registerAccount.RegisterAccounts;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.LoginPage;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.RegisterPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
/**
 * @author Renato Paco
 */

public class LoginAccount implements Task{


    private final String email;
    private final String password;

    public LoginAccount( String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    @Step("{0} {0} Ingresamos datos de usuario para Login")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(LoginPage.TXT_EMAIL_LOGIN),
                Enter.theValue(password).into(LoginPage.TXT_PASSWORD_LOGIN),
                Click.on(LoginPage.BTN_SIGNIN_LOGIN)
        );
    }
    public static Performable withData(String email, String password) {
        return instrumented(LoginAccount.class,email,password);
    }

}
