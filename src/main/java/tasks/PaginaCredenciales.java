package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterface.PaginaCredenciales.*;
public class PaginaCredenciales implements Task {
    private static userinterface.PaginaCredenciales PaginaCredenciales;

    public static tasks.PaginaCredenciales Validar() {

        return Tasks.instrumented(tasks.PaginaCredenciales.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("1020479049.Hj").into(CONTRASENA),
                Enter.theValue("1020479049.Hj").into(CONFIRMACION_CONTRASENA),
                Click.on(CHECKBOX_1),
                Click.on(CHECKBOX_2),
                Click.on(CHECKBOX_3),
                Click.on(BOTON_FINALIZAR)
                );
    }
}