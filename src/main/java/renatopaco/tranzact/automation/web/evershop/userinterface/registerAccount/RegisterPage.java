package renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * @author Renato Paco
 */
public class RegisterPage {
/////////////////////////////////==========REGISTER==========/////////////////////////////////
public static final Target TXTBTN_CREATEACCOUNT = Target.the("Buttom CreateAccount").located(By.xpath("//a[normalize-space()='Create an account']"));

    public static final Target INP_FULLNAME_REGISTER = Target.the("INP_FULLNAME_REGISTER").located(By.name("full_name"));
    public static final Target INP_EMAIL_REGISTER = Target.the("INP_EMAIL_REGISTER").located(By.name("email"));
    public static final Target INP_PASSWORD_REGISTER= Target.the("INP_PASSWORD_REGISTER").located(By.name("password"));
    public static final Target BTN_SIGNUP_REGISTER= Target.the("BTN_SIGNUP_REGISTER").located(By.xpath("//button[@type='button']"));



    /////////////////////////////////==========LOGIN==========/////////////////////////////////
    public static final Target BTN_LOGINSECTION_WITHOUTACCOUNT = Target.the("BTN_LOGINSECTION_WITHOUTACCOUNT").located(By.xpath("//a[@href='/account/login']//*[name()='svg']"));

    public static final Target BTN_LOGINSECTION_WITHACCOUNT = Target.the("BTN_LOGINSECTION_WITHACCOUNT").located(By.xpath("//a[@href='/account']//*[name()='svg']"));

}
