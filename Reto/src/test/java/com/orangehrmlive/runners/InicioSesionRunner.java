package com.orangehrmlive.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/iniciosesion.feature",
        glue = "com/orangehrmlive/stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class InicioSesionRunner {
}
