package com.orangehrmlive.userInterfaces;

import com.orangehrmlive.utils.Excel;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.io.IOException;

public class ValidacionUI {


    static Excel excel= new Excel();

    public static Target TXT_VALIDACION=null;

    static {
        try {
            TXT_VALIDACION= Target.the("lista seleccionar vacante").
                    located(By.xpath("//div[contains(text(),'"+excel.leerDatoExcel("DatosPersona","Data reto.xlsx",1,8)+"')]/ancestor::div[@class='oxd-table-cell oxd-padding-cell']/following-sibling::div[3]/div[contains(text(),'Hired')]"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
