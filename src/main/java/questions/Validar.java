package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.SelectOptions;
import userinterface.PaginaCredenciales;
import userinterface.PaginaUbicacionP;

public class Validar implements Question<Boolean> {
    public static Validar CampodExisten(){
        return new Validar();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        String contrasena=SelectOptions.of(PaginaCredenciales.CONTRASENA).answeredBy(actor).get(1);
        String contrasena2=SelectOptions.of(PaginaCredenciales.CONFIRMACION_CONTRASENA).answeredBy(actor).get(2);

        return contrasena.equals("1020479049.Hj")
                && contrasena2.equals("1020479049.Hj");



    }
}