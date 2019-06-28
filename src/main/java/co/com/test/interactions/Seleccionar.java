package co.com.test.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.test.user_interface.InicioPage.BTN_LUPA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Seleccionar implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LUPA)
        );
    }

    public static Performable lupa() {
        return instrumented(Seleccionar.class);
    }
}
