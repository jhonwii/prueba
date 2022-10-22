package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.PaginaPrincipal;

import static userinterface.PaginaPrincipal.*;

public class PaginaIngresar implements Task {
    private static PaginaPrincipal PaginaPrincipal;

    public static PaginaIngresar Informacion() {

        return Tasks.instrumented(PaginaIngresar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("jhon william").into(NOMBRE_INPUT),
                Enter.theValue("castrillon").into(APELLIDO_INPUT),
                Enter.theValue("aikor972476@gmail.com").into(CORREO_ELECTRONICO),
                SelectFromOptions.byVisibleText("February").from(MES_NACIMIENTO),
                SelectFromOptions.byVisibleText("10").from(DIA_NACIMIENTO),
                SelectFromOptions.byValue("number:1997").from(AÑO_NACIMIENTO),
                Click.on(BOTON_SIGUIENTE)
        );
    }
}