package com.orangehrmlive.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.orangehrmlive.userInterfaces.ValidacionUI.TXT_VALIDACION;

public class ValidacionContratacion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return TXT_VALIDACION.resolveFor(actor).isVisible();
    }
    public static Question<Boolean> on(){
        return actor -> TXT_VALIDACION.resolveFor(actor).isVisible();
    }
}
