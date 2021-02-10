package tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.Random;

import static userinterface.OrangePaginaInicialUserInterface.*;

@AllArgsConstructor
public class Crear implements Task {

    private final String nombreUsuario;
    public static final String CODIGO_USUARIO = null;

    public static Crear usuario(String nombreUsuario) {
        return Tasks.instrumented(Crear.class, nombreUsuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String codigoUsuario = String.valueOf(new Random().nextInt(99999));
        actor.remember(CODIGO_USUARIO, codigoUsuario);
        actor.attemptsTo(Click.on(LBL_ADMIN),
                Click.on(LBL_USERS_MANAGMENT),
                Click.on(LBL_USERS));
        LBL_PRIMER_USUARIO.resolveFor(actor).waitUntilVisible();
        actor.attemptsTo(Click.on(LBL_ADD),
                Click.on(TXT_EMPLOYEE_VALUE),
                Enter.theValue("Grant madison").into(TXT_EMPLOYEE_VALUE).thenHit(Keys.TAB),
                Enter.theValue(nombreUsuario+codigoUsuario).into(TXT_USER_NAME),
                Click.on(TXT_PASSWORD),
                Enter.theValue("123456789").into(TXT_PASSWORD).thenHit(Keys.TAB),
                Click.on(TXT_CONFIRM_PASSWORD),
                Enter.theValue("123456789").into(TXT_CONFIRM_PASSWORD).thenHit(Keys.TAB),
                Click.on(BTN_SAVE));
        actor.attemptsTo(WaitUntil.angularRequestsHaveFinished());
    }
}
