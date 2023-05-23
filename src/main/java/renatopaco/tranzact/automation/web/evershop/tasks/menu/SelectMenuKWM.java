package renatopaco.tranzact.automation.web.evershop.tasks.menu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import renatopaco.tranzact.automation.web.evershop.tasks.registerAccount.RegisterAccounts;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.MenuAccountPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectMenuKWM implements Task{
    private final String typeMenu;

    public SelectMenuKWM(String typeMenu) {
        this.typeMenu = typeMenu;
    }

    @Override
    @Step("Click in el menu KWM:1")
    public <T extends Actor> void performAs(T actor) {
        switch (typeMenu){
            case "Kids":
                actor.attemptsTo(
                        WaitUntil.the(MenuAccountPage.TXTBTN_KIDS_MENU_MENUACCOUNT, isVisible()).forNoMoreThan(15).seconds(),
                        Click.on(MenuAccountPage.TXTBTN_KIDS_MENU_MENUACCOUNT)
                );

                break;
            case "Women":
                actor.attemptsTo(
                        WaitUntil.the(MenuAccountPage.TXTBTN_WOMEN_MENU_MENUACCOUNT, isVisible()).forNoMoreThan(15).seconds(),
                        Click.on(MenuAccountPage.TXTBTN_WOMEN_MENU_MENUACCOUNT)
                );

                break;
            case "Men":
                actor.attemptsTo(
                        WaitUntil.the(MenuAccountPage.TXTBTN_MEN_MENU_MENUACCOUNT, isVisible()).forNoMoreThan(15).seconds(),
                        Click.on(MenuAccountPage.TXTBTN_MEN_MENU_MENUACCOUNT)
                );

                break;
            case "Menu":
                actor.attemptsTo(
                        WaitUntil.the(MenuAccountPage.TXTBTN_MENUHOME_MENU_MENUACCOUNT, isVisible()).forNoMoreThan(15).seconds(),
                        Click.on(MenuAccountPage.TXTBTN_MENUHOME_MENU_MENUACCOUNT)
                );

                break;
            case "Cart":
                actor.attemptsTo(
                        WaitUntil.the(MenuAccountPage.BTN_CART_MENU_MENUACCOUNT, isVisible()).forNoMoreThan(15).seconds(),
                        Click.on(MenuAccountPage.BTN_CART_MENU_MENUACCOUNT)
                );

                break;
            default:
                System.out.println("Menu Type is not found.");

        }
    }

    public static Performable withData(String typeMenu) {
        return instrumented(SelectMenuKWM.class, typeMenu);
    }

}
