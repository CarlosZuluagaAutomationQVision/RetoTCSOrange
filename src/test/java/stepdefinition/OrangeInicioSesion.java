package stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import questions.ComprobarInicioSesion;
import tasks.IniciarSesion;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;


public class OrangeInicioSesion {

    @Cuando("{word} inicia sesion en la pagina de Orange")
    public void iniciarSesionOrange(String nombreUsuario) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.enOrange(nombreUsuario.toUpperCase()));
    }

    @Entonces("puede visualizar el modulo de bienvenida")
    public void validarInicioSesion() {
        theActorInTheSpotlight().should(seeThat(ComprobarInicioSesion.enOrange()));
    }

}
