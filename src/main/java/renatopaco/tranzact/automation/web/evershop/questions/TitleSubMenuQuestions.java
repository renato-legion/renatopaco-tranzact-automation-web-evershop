package renatopaco.tranzact.automation.web.evershop.questions;

import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.MenuAccountPage;

import net.serenitybdd.screenplay.Question;
public class TitleSubMenuQuestions {

    public static Question<String> tittleSubMenu() {
        return actor -> MenuAccountPage.LABEL_KIDS_WOMAN_MEN_MENU_MENUACCOUNT.resolveFor(actor).waitUntilVisible().getText();
    }
}
