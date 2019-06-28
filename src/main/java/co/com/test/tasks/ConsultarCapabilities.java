package co.com.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.test.user_interface.InicioPage.BTN_APP;
import static co.com.test.user_interface.InicioPage.TXT_BUSCAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultarCapabilities implements Task {

    private String nombreApp;

    public ConsultarCapabilities(String nombreApp){
        this.nombreApp = nombreApp;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TXT_BUSCAR),
                Enter.theValue(nombreApp).into(TXT_BUSCAR),
                Click.on(BTN_APP)
        );
    }

    public static Performable deLaApp(String nombreApp) {
        return instrumented(ConsultarCapabilities.class, nombreApp);
    }
}
