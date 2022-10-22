package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static userinterface.PaginaUbicacionP.*;

public class Ubicacion implements Task {
    private userinterface.PaginaUbicacionP PaginaUbicacionP;

    public static Performable Ingresar() {

        return Tasks.instrumented(Ubicacion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Bello").into(CIUDAD).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Enter.theValue("050043").into(CODIGO_POSTAL),
                Click.on(CONTENEDOR_PAIS),
                Enter.theValue("Colombia").into(PAIS).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(BOTON_SIGUIENTE)
                );
    }
}