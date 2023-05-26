package renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class LoginPage {

    public static final Target TXT_EMAIL_LOGIN = Target.the("TXT_EMAIL_LOGIN").located(By.name("email"));
    public static final Target TXT_PASSWORD_LOGIN = Target.the("TXT_PASSWORD_LOGIN").located(By.name("password"));
    public static final Target BTN_SIGNIN_LOGIN = Target.the("BTN_SIGNIN_LOGIN").located(By.cssSelector("button[type='submit']"));


}
