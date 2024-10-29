package com.orangehrmlive.tasks;

import com.orangehrmlive.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;

import static com.orangehrmlive.userInterfaces.InicioSesionUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class InicioSesionTask implements Task {

    Excel excel= new Excel();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    WaitUntil.the(TXT_USUARIO, isClickable()).forNoMoreThan(30).seconds(),
                    Enter.theValue(excel.leerDatoExcel("DatosLogueo","Data reto.xlsx",1,0)).into(TXT_USUARIO),
                    Enter.theValue(excel.leerDatoExcel("DatosLogueo","Data reto.xlsx",1,1)).into(TXT_CLAVE),
                    Click.on(BTN_INICTO_SESSION)

            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static InicioSesionTask on(){
        return Tasks.instrumented(InicioSesionTask.class);
    }
}
