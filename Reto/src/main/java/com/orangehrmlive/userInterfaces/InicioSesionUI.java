package com.orangehrmlive.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioSesionUI {

    public static final Target TXT_USUARIO = Target.the("Input de usuario").
            located(By.name("username"));
    public static final Target TXT_CLAVE = Target.the("Input de clave").
            located(By.name("password"));
    public static final Target BTN_INICTO_SESSION = Target.the("Botón de inicio de sesión").
            located(By.xpath("//button[@type='submit']"));

}
