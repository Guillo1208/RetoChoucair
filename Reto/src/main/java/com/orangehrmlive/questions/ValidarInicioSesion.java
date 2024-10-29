package com.orangehrmlive.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.orangehrmlive.userInterfaces.PaginaInicialUI.BTN_RECRUITMENT;

public class ValidarInicioSesion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return BTN_RECRUITMENT.resolveFor(actor).isVisible();
    }

    public static Question<Boolean> on(){
        return actor -> BTN_RECRUITMENT.resolveFor(actor).isVisible();
    }
}
