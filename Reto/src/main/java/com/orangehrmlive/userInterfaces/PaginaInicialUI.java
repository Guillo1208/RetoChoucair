package com.orangehrmlive.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicialUI {
    public static final Target BTN_RECRUITMENT = Target.the("Boton recruitment").
            located(By.xpath("//a[@href='/web/index.php/recruitment/viewRecruitmentModule']"));
    public static final Target BTN_ADD = Target.the("Boton add").
            located(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']"));
}
