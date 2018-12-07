package com.cinecolombia.certification.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resource/features/cinecolombia_reservation.feature", 
		glue = "com.cinecolombia.certification.stepdefinitions",
		snippets = SnippetType.CAMELCASE
)


public class Cinecolombia {

	
	
}




