package renatopaco.tranzact.automation.web.evershop.tasks.login;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;
import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * @author Renato Paco
 */

public class OpenEvershop  implements Task{

    EnvironmentVariables environmentVariables;

    private final String url;

    public OpenEvershop(String url) {
        this.url = url;
    }

    @Override
    @Step("{0} Start page #url")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(url))
        );
    }

    public static Task loginEvershopPage() {
        String url = "evershop.page";
        return instrumented(OpenEvershop.class, url);
    }
}
