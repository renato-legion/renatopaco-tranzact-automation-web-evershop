package renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
/**
 * @author Renato Paco
 */
public class ProductsPage {

    public static final Target IMG_FIRST_KIDS_WOMAN_MEN = Target.the("Buttom LogOut").located(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]"));
    public static final Target IMG_SECOND_KIDS_WOMAN_MEN = Target.the("Buttom LogOut").located(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/a[1]/img[1]"));
    public static final Target IMG_THIRD_KIDS_WOMAN_MEN = Target.the("Buttom LogOut").located(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/a[1]/img[1]"));
    public static final Target IMG_FOURTH_KIDS_WOMAN_MEN = Target.the("Buttom LogOut").located(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/a[1]/img[1]"));

////////// DETAILS PRODUCTS////////////

    public static final Target TXTBX_QUANTITY_DETAILPRODUCT = Target.the("Buttom LogOut").located(By.name("qty"));

    public static final Target BTN_SIZE_S_DETAILPRODUCT = Target.the("Buttom LogOut").located(By.linkText("S"));
    public static final Target BTN_SIZE_M_DETAILPRODUCT = Target.the("Buttom LogOut").located(By.linkText("M"));
    public static final Target BTN_SIZE_L_DETAILPRODUCT = Target.the("Buttom LogOut").located(By.linkText("L"));
    public static final Target BTN_SIZE_X_DETAILPRODUCT = Target.the("Buttom LogOut").located(By.linkText("X"));
    public static final Target BTN_SIZE_XL_DETAILPRODUCT = Target.the("Buttom LogOut").located(By.linkText("XL"));


    public static final Target BTN_COLOR_WHITE_DETAILPRODUCT = Target.the("Buttom LogOut").located(By.linkText("White"));
    public static final Target BTN_COLOR_PINK_DETAILPRODUCT = Target.the("Buttom LogOut").located(By.linkText("Pink"));
    public static final Target BTN_COLOR_GREEN_DETAILPRODUCT = Target.the("Buttom LogOut").located(By.linkText("Green"));
    public static final Target BTN_COLOR_BLACK_DETAILPRODUCT = Target.the("Buttom LogOut").located(By.linkText("Black"));
    public static final Target BTN_COLOR_BROWN_DETAILPRODUCT = Target.the("Buttom LogOut").located(By.linkText("Brown"));
    public static final Target BTN_COLOR_BLUE_DETAILPRODUCT = Target.the("Buttom LogOut").located(By.linkText("Blue"));
    public static final Target BTN_COLOR_RED_DETAILPRODUCT = Target.the("Buttom LogOut").located(By.linkText("Red"));

    public static final Target BTN_ADDTOCART_DETAILPRODUCT = Target.the("Buttom LogOut").located(By.cssSelector("button[type='button']"));
    public static final Target LBL_DETAILCART_DETAILPRODUCT = Target.the("Buttom LogOut").located(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
    public static final Target BTN_CONTINUESHOPPING_DETAILPRODUCT = Target.the("Buttom LogOut").located(By.linkText("Continue Shopping"));

    public static final Target BTN_CHECKOUT_CART = Target.the("Buttom LogOut").located(By.cssSelector("a[class='button primary']"));
}
