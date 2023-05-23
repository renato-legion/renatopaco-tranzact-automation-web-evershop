package renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
/**
 * @author Renato Paco
 */
public class CartPage {
    public static final Target TXTBX_FULLNAME_SHIPPING = Target.the("Lalal").located(By.cssSelector("input[placeholder='Full name']"));
    public static final Target TXTBX_TELEPHONE_SHIPPING = Target.the("Bfdsf").located(By.name("address[telephone]"));
    public static final Target TXTBX_ADDRESS_SHIPPING = Target.the("Buttom LogOut").located(By.name("address[address_1]"));
    public static final Target TXTBX_CITY_SHIPPING = Target.the("Buttom LogOut").located(By.name("address[city]"));
    public static final Target TXTBX_POSTCODE_SHIPPING = Target.the("Buttom LogOut").located(By.name("address[postcode]"));

    public static final Target DROPDOWN_COUNTRY_SHIPPING = Target.the("Buttom LogOut").located(By.name("address[country]"));
    public static final Target DROPDOWN_COUNTRY_USA_SHIPPING = Target.the("Buttom LogOut").located(By.cssSelector("option[value='US']"));
    public static final Target DROPDOWN_PROVINCE_SHIPPING = Target.the("Buttom LogOut").located(By.name("address[province]"));
    public static final Target DROPDOWN_PROVINCE_USA_SHIPPING = Target.the("Buttom LogOut").located(By.cssSelector("option[value='US-NE']"));

    public static final Target RADIOBTN_EXPRESSDELIVERY_SHIPPING = Target.the("Buttom LogOut").located(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[2]/label[1]/span[2]"));
    public static final Target BTN_CONTINUE_PAYMENT_SHIPPING = Target.the("Buttom LogOut").located(By.cssSelector("button[type='button']"));

    public static final Target BTN_CREDITCARD_PAYMENT = Target.the("Buttom LogOut").located(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]/*[name()='svg'][1]"));
    public static final Target BTN_TEST_SUCCESS_CREDITCARD_PAYMENT = Target.the("Buttom LogOut").located(By.cssSelector("button[class='button interactive outline']"));


    public static final Target TXTBX_SUCCESS_CARDNUMBER_CREDITCARD_PAYMENT = Target.the("Buttom LogOut").located(By.xpath("/html/body/div/form/div/div[2]/span[1]/span[2]/div/div[2]/span"));

    public static final Target TXTBX_CASHONDELIVERY_PAYMENT = Target.the("CredCard").located(By.xpath("//div[@class='checkout-payment checkout-step']//div//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//*[name()='svg']"));

    public static final Target BTN_PLACEHOLDER_PAYMENT = Target.the("BTBPlaceholder").located(By.cssSelector("button[type='button']"));

    public static final Target TXTBX_CARDNUMBER_CREDITCARD_PAYMENT = Target.the("CredCard").located(By.cssSelector("input[placeholder='Número de tarjeta']"));
    public static final Target TXTBX_CARDEXPIRY_CREDITCARD_PAYMENT = Target.the("Buttom LogOut").located(By.xpath("/html[1]/body[1]"));
    public static final Target TXTBX_CVV_CREDITCARD_PAYMENT = Target.the("Buttom LogOut").located(By.xpath("/html[1]/body[1]"));

}
