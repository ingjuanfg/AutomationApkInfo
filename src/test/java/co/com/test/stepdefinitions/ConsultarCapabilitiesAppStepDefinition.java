package co.com.test.stepdefinitions;

import co.com.test.exceptions.LaAplicacionNoEsLaSeleccionadaException;
import co.com.test.interactions.Seleccionar;
import co.com.test.questions.AplicacionListada;
import co.com.test.tasks.ConsultarCapabilities;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.test.exceptions.LaAplicacionNoEsLaSeleccionadaException.LA_APLICACION_NO_ES_LA_BUSCADA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultarCapabilitiesAppStepDefinition {

    @Before
    public void prepararEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) quiere consultar las capabilities de una app$")
    public void queJuanConsultaLaAppDeFacebook(String actor){
        theActorCalled(actor).attemptsTo(
                Seleccionar.lupa()
        );
    }

    @Cuando("^El busca la app de (.*)$")
    public void elSeleccionaLaApp(String nombreApp) {
        theActorInTheSpotlight().attemptsTo(
                ConsultarCapabilities.deLaApp(nombreApp)
        );

    }

    @Entonces("^el deberia de ver las caracteristicas de esta$")
    public void elDeberiaDeVerLasCaracteristicasDeEsta() {
        theActorInTheSpotlight().should(seeThat(AplicacionListada.esCorrecta()).
                orComplainWith(LaAplicacionNoEsLaSeleccionadaException.class, LA_APLICACION_NO_ES_LA_BUSCADA));
    }

}
