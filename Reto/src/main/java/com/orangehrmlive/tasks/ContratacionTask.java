package com.orangehrmlive.tasks;

import com.orangehrmlive.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.orangehrmlive.userInterfaces.ContratacionUI.*;
import static com.orangehrmlive.userInterfaces.PaginaInicialUI.BTN_RECRUITMENT;


public class ContratacionTask implements Task {

    Excel excel= new Excel();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(

                    Enter.theValue(excel.leerDatoExcel("DatosPersona","Data reto.xlsx",1,0)).into(TXT_PRIMERNOMBRE),
                    Enter.theValue(excel.leerDatoExcel("DatosPersona","Data reto.xlsx",1,1)).into(TXT_SEGUNDONOMBRE),
                    Enter.theValue(excel.leerDatoExcel("DatosPersona","Data reto.xlsx",1,2)).into(TXT_APELLIDO),
                    Click.on(BTN_DESPLEGARLISTA),
                    Click.on(LIST_VACANTE),
                    Enter.theValue(excel.leerDatoExcel("DatosPersona","Data reto.xlsx",1,4)).into(TXT_CORREO),
                    Click.on(CHK_AUTORIZACION),
                    Click.on(BTN_SAVE),
                    Click.on(BTN_SHORTLIST),
                    Click.on(BTN_SAVE),
                    Click.on(BTN_SCHEDULEINTERVIEW),
                    Enter.theValue(excel.leerDatoExcel("DatosPersona","Data reto.xlsx",1,5)).into(TXT_TITULO),
                    Enter.theValue(excel.leerDatoExcel("DatosPersona","Data reto.xlsx",1,6)).into(TXT_ENTREVISTADOR),
                    Click.on(LIST_ENTREVISTADOR),
                    Enter.theValue(excel.leerDatoExcel("DatosPersona","Data reto.xlsx",1,7)).into(TXT_FECHA),
                    Click.on(BTN_SAVE),
                    Click.on(BTN_MARKINTERVIEWPASSED),
                    Click.on(BTN_SAVE),
                    Click.on(BTN_OFFERJOB),
                    Click.on(BTN_SAVE),
                    Click.on(BTN_HIRE),
                    Click.on(BTN_SAVE),
                    Click.on(BTN_RECRUITMENT)


            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static ContratacionTask on(){
        return Tasks.instrumented(ContratacionTask.class);
    }
}
