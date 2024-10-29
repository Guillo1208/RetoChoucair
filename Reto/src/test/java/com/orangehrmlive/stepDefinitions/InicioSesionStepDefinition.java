package com.orangehrmlive.stepDefinitions;

import com.orangehrmlive.questions.ValidarInicioSesion;
import com.orangehrmlive.tasks.InicioSesionTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InicioSesionStepDefinition {

    @Before
    public void prepareActorStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("el usuario este en la pagina principal orangehrm")
    public void elUsuarioEsteEnLaPaginaPrincipalOrangehrm() {
        theActorCalled("asesor").wasAbleTo(Open.url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
    }
    @Cuando("el usuario ingrese los datos de logue")
    public void elUsuarioIngreseLosDatosDeLogue() {
        theActorInTheSpotlight().attemptsTo(InicioSesionTask.on());
    }
    @Entonces("el usuario valida que se logueo correctamente")
    public void elUsuarioValidaQueSeLogueoCorrectamente() {
        theActorInTheSpotlight().should(seeThat(ValidarInicioSesion.on(), Matchers.equalTo(true)));
    }

}
