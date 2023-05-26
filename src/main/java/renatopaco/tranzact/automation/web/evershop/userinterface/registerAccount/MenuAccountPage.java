package renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
/**
 * @author Renato Paco
 */

public class MenuAccountPage {
    ///////////// SESSION ACTIVE - WITH ACCOUNT //////////////////////////
    public static final Target TXTBTN_LOGOUT_MENUACCOUNT = Target.the("TXTBTN_LOGOUT_MENUACCOUNT").located(By.cssSelector(".text-interactive"));


    public static final Target TXTBTN_KIDS_MENU_MENUACCOUNT = Target.the("TXTBTN_KIDS_MENU_MENUACCOUNT").located(By.linkText("Kids"));
    public static final Target TXTBTN_WOMEN_MENU_MENUACCOUNT = Target.the("TXTBTN_WOMEN_MENU_MENUACCOUNT").located(By.linkText("Women"));
    public static final Target TXTBTN_MEN_MENU_MENUACCOUNT = Target.the("TXTBTN_MEN_MENU_MENUACCOUNT").located(By.linkText("Men"));

    public static final Target TXTBTN_MENUHOME_MENU_MENUACCOUNT = Target.the("TXTBTN_MENUHOME_MENU_MENUACCOUNT").located(By.xpath("//a[@class='logo-icon']//*[name()='svg']"));

    public static final Target BTN_CART_MENU_MENUACCOUNT = Target.the("BTN_CART_MENU_MENUACCOUNT").located(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/a[1]/*[name()='svg'][1]"));

    public static final Target LABEL_KIDS_WOMAN_MEN_MENU_MENUACCOUNT = Target.the("LABEL_KIDS_WOMAN_MEN_MENU_MENUACCOUNT").located(By.cssSelector(".category-name.mt-25"));

    ///////////// SESSION ACTIVE - WITH ACCOUNT //////////////////////////
}
