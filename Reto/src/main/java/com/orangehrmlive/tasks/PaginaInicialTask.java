package com.orangehrmlive.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.orangehrmlive.userInterfaces.PaginaInicialUI.BTN_ADD;
import static com.orangehrmlive.userInterfaces.PaginaInicialUI.BTN_RECRUITMENT;


public class PaginaInicialTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Click.on(BTN_RECRUITMENT),
                    Click.on(BTN_ADD)
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static PaginaInicialTask on(){
        return Tasks.instrumented(PaginaInicialTask.class);
    }
}
