package com.orangehrmlive.userInterfaces;

import com.orangehrmlive.utils.Excel;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.io.IOException;

public class ContratacionUI {

    static Excel excel= new Excel();

    public static final Target TXT_PRIMERNOMBRE = Target.the("Input primer nombre").
            located(By.name("firstName"));
    public static final Target TXT_SEGUNDONOMBRE = Target.the("Input segundo nombre").
            located(By.name("middleName"));
    public static final Target TXT_APELLIDO = Target.the("Input apellido").
            located(By.name("lastName"));
    public static final Target BTN_DESPLEGARLISTA= Target.the("Botón desplegar lista").
            located(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
    public static Target LIST_VACANTE=null;
    public static Target LIST_ENTREVISTADOR=null;

    static {
        try {
            LIST_VACANTE= Target.the("lista seleccionar vacante").
                    located(By.xpath("//div[@role='listbox']/div/span[contains(text(),'"+excel.leerDatoExcel("DatosPersona","Data reto.xlsx",1,3)+"')]"));
            LIST_ENTREVISTADOR= Target.the("lista seleccionar ENTREVISTADOR").
                    located(By.xpath("//div[@role='listbox']/div/span[contains(text(),'"+excel.leerDatoExcel("DatosPersona","Data reto.xlsx",1,6)+"')]"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static final Target TXT_CORREO = Target.the("Input correo").
            located(By.xpath("//label[contains(text(),'Email')]/ancestor::div[@class='oxd-input-group__label-wrapper']/following-sibling::div[1]/input"));
    public static final Target CHK_AUTORIZACION = Target.the("chek autorizacion").
            located(By.xpath("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));
    public static final Target BTN_SAVE= Target.the("Botón de BTN_SAVE").
            located(By.xpath("//button[@type='submit']"));
    public static final Target BTN_SHORTLIST = Target.the("Botón de BTN_SHORTLIST").
            located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--success']"));
    public static final Target BTN_SCHEDULEINTERVIEW = Target.the("Botón de SCHEDULEINTERVIEW").
            located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--success']"));
    public static final Target TXT_TITULO = Target.the("Input primer titulo").
            located(By.xpath("//label[contains(text(),'Interview Title')]/ancestor::div[@class='oxd-input-group__label-wrapper']/following-sibling::div[1]/input"));
    public static final Target TXT_ENTREVISTADOR = Target.the("Input entrevistador").
            located(By.xpath("//input[@include-employees='onlyCurrent']"));
    public static final Target TXT_FECHA = Target.the("Input para el ingreso de la fecha").
            located(By.xpath("//input[@placeholder='yyyy-dd-mm']"));
    public static final Target BTN_MARKINTERVIEWPASSED = Target.the("Botón de MARKINTERVIEWPASSED").
            located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--success']"));
    public static final Target BTN_OFFERJOB = Target.the("Botón de OFFERJOB").
            located(By.xpath("//div[@class='orangehrm-recruitment-actions']/button[3]"));
    public static final Target BTN_HIRE = Target.the("Botón de HIRE").
            located(By.xpath("//div[@class='orangehrm-recruitment-actions']/button[3]"));

}
