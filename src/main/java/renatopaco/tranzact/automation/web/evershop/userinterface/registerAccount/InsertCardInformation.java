package renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount;

import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import renatopaco.tranzact.automation.web.evershop.utils.Shadow;

public class InsertCardInformation extends PageObject {

    Shadow general = new Shadow();

    @FindBy(xpath = "/html/body/div/form/div/div[2]")
    WebElement INPT_CARDNUMBER;


    public void agregainformacionTarjeta() throws InterruptedException {
        waitForCondition().until(ExpectedConditions.visibilityOf(INPT_CARDNUMBER));
        WebElement valueText = general.expandContainer("1css",INPT_CARDNUMBER,"#root > form > div > div.CardField-input-wrapper > span.CardField-number.CardField-child > span:nth-child(2) > div > div.CardNumberField-input-wrapper > span > input","","","");
        valueText.sendKeys("1234");
        Thread.sleep(1500);

    }

    public void putCorrectCreditCard() throws InterruptedException {
//        Thread.sleep(3000);
//        waitForCondition().until(ExpectedConditions.elementToBeClickable(INPT_CARDNUMBER));
//        INPT_CARDNUMBER.sendKeys("4242 4242 4242 4242");\
        Thread.sleep(1500);
        waitForCondition().until(ExpectedConditions.visibilityOf(INPT_CARDNUMBER));
        WebElement valueText = general.expandContainer("1css",INPT_CARDNUMBER,"#root > form > div > div.CardField-input-wrapper > span.CardField-number.CardField-child > span:nth-child(2) > div > div.CardNumberField-input-wrapper > span > input","","","");
        valueText.sendKeys("1234");
        Thread.sleep(1500);

    }
}
