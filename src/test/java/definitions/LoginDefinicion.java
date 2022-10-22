package definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Validar;
import tasks.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginDefinicion {
    @Before
    public void setStage(){

        OnStage.setTheStage(new OnlineCast());
    }
    @Given(": El usuario esta en la pagina de bienvenida")
    public void elUsuarioEstaEnLaPaginaDeBienvenida() {
        OnStage.theActorCalled("cliente").attemptsTo(PaginaPrincipal.Ingresar());
    }
    @When(": el usuario ingresa los campos requeridos para su registro")
    public void elUsuarioIngresaLosCamposRequeridosParaSuRegistro() throws InterruptedException {
        OnStage.theActorInTheSpotlight().attemptsTo(PaginaIngresar.Informacion());
        OnStage.theActorInTheSpotlight().attemptsTo(Ubicacion.Ingresar());
        OnStage.theActorInTheSpotlight().attemptsTo(PaginaDispositivos.Validar());
    }

    @Then(": el usuario crea su perfil y ingresa")
    public void elUsuarioCreaSuPerfilYIngresa()  throws InterruptedException {
        OnStage.theActorInTheSpotlight().attemptsTo(PaginaCredenciales.Validar());
    }

}
