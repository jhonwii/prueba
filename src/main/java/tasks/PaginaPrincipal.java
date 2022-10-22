package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.PaginaBienvenida;

import static userinterface.PaginaBienvenida.*;

public class PaginaPrincipal implements Task {
    private userinterface.PaginaBienvenida PaginaBienvenida;

    public static Performable Ingresar() {

        return Tasks.instrumented(PaginaPrincipal.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(PaginaBienvenida),
                Click.on(UNETE_HOY)
                );
    }
}