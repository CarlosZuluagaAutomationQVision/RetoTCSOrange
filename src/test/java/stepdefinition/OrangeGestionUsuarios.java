package stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import questions.ComprobarUsuario;
import tasks.Crear;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static tasks.Crear.CODIGO_USUARIO;

public class OrangeGestionUsuarios {

    @Cuando("agrega un usuario {string}")
    public void crearUsuario(String nombreUsuario){
        theActorInTheSpotlight().attemptsTo(Crear.usuario(nombreUsuario));
    }

    @Entonces("observa el usuario {string} en la tabla")
    public void validarUsuarioCreado(String nombreUsuario){
        theActorInTheSpotlight().should(seeThat(ComprobarUsuario.creado(), equalToIgnoringCase(nombreUsuario.concat(theActorInTheSpotlight().recall(CODIGO_USUARIO)))));
    }
}
