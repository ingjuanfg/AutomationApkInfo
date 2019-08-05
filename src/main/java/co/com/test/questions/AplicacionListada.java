package co.com.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.test.user_interface.AppPage.IMG_APP;

public class AplicacionListada implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return IMG_APP.resolveFor(actor).isVisible();
    }

    public static AplicacionListada esCorrecta() {
        return new AplicacionListada();
    }
}
