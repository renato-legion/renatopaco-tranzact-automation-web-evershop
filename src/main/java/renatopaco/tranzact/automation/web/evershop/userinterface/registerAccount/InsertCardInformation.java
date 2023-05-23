package renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import renatopaco.tranzact.automation.web.evershop.utils.Shadow;

public class InsertCardInformation extends PageObject {

    Shadow general = new Shadow();
    @FindBy(xpath = "/html/body/div/form")
    WebElement LABEL_TEST;

    public void agregainformacionTarjeta() throws InterruptedException {
        waitForCondition().until(ExpectedConditions.visibilityOf(LABEL_TEST));
        WebElement valueText = general.expandContainer("1css",LABEL_TEST,"#root > form > div > div.CardField-input-wrapper > span.CardField-number.CardField-child > span:nth-child(2) > div > div.CardNumberField-input-wrapper > span > input","","","");
        valueText.sendKeys("1234");
        Thread.sleep(1500);

    }
}
