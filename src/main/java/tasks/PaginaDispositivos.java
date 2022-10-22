package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static userinterface.PaginaDispositivos.*;

public class PaginaDispositivos implements Task {
    private userinterface.PaginaDispositivos PaginaDispositivos;

    public static Performable Validar() {

        return Tasks.instrumented(tasks.PaginaDispositivos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CONTENEDOR_COMPUTADOR),
                Enter.theValue("Windows").into(COMPUTADOR).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTENEDOR_VERSION),
                Enter.theValue("10").into(VERSION).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTENEDOR_LENGUAJE),
                Enter.theValue("Spanish").into(LENGUAJE).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTENEDOR_CELULAR),
                Enter.theValue("Apple").into(CELULAR).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTENEDOR_MODELO),
                Enter.theValue("iPhone 6 Plus").into(MODELO).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTENEDOR_SYSTEMA_OPERATIVO),
                Enter.theValue("iOS 8.1").into(SYSTEMA_OPERATIVO).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(BOTON_SIGUIENTE)
                );
    }
}