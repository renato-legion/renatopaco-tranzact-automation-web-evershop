package renatopaco.tranzact.automation.web.evershop.tasks.menu;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import renatopaco.tranzact.automation.web.evershop.questions.TitleSubMenuQuestions;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.MenuAccountPage;
import renatopaco.tranzact.automation.web.evershop.userinterface.registerAccount.ProductsPage;

import java.util.Locale;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;

public class VerifySubMenuKWM implements Task {

    private final String typeMenu;


    public VerifySubMenuKWM(String typeMenu) {

        this.typeMenu = typeMenu.toUpperCase(Locale.ROOT);
    }

    @Override
    @Step("Verificamos SUBtitulo de la pagina")
    public <T extends Actor> void performAs(T actor) {

                theActorInTheSpotlight().should(
                        seeThat(TitleSubMenuQuestions.tittleSubMenu(), equalTo(typeMenu))
                );
        System.out.println("Subtitulo verificado:" +typeMenu + " exitosamente");
    }

    public static Performable withData(String typeMenu) {
        return instrumented(SelectMenuKWM.class, typeMenu);
    }
}
