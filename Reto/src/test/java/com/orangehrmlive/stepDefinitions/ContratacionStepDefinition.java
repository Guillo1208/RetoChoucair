package com.orangehrmlive.stepDefinitions;

import com.orangehrmlive.questions.ValidacionContratacion;
import com.orangehrmlive.tasks.ContratacionTask;
import com.orangehrmlive.tasks.PaginaInicialTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ContratacionStepDefinition {

    @Before
    public void prepareActorStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("el usuario diligencia la informacion requerida")
    public void elUsuarioDiligenciaLaInformacionRequerida() {
        theActorInTheSpotlight().attemptsTo(PaginaInicialTask.on());
        theActorInTheSpotlight().attemptsTo(ContratacionTask.on());
    }
    @Entonces("la contratacion se realiza de manera exitosa")
    public void laContratacionSeRealizaDeManeraExitosa() {
        theActorInTheSpotlight().should(seeThat(ValidacionContratacion.on(), Matchers.equalTo(true)));
    }
}
