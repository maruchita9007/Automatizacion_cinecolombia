package com.cinecolombia.certification.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import java.util.List;
import org.openqa.selenium.WebDriver;
import com.cinecolombia.certification.questions.CinecolombiaMovieResult;
import com.cinecolombia.certification.tasks.DoThe;
import com.cinecolombia.certification.tasks.OpenTheBrowser;
import com.cinecolombia.certification.tasks.SelectThe;
import com.cinecolombia.certification.userinterfaces.CinecolombiaHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class CinecolombiaStepDefinitions {

	//Definición del driver
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	
	private Actor mari = Actor.named("Mari");
	private CinecolombiaHomePage cinecolombiaHomePage;
	
	//Inicialización del driver a cargo del actor
	@Before
	public void setUp() {
		mari.can(BrowseTheWeb.with(herBrowser));
		herBrowser.manage().window().maximize(); 
	}
	
	@Given("^that Mari wants to add a movie to the reservation$")
	public void that_Mari_wants_to_add_a_movie_to_the_reservation(List<String> data) {
		mari.wasAbleTo(OpenTheBrowser.on(cinecolombiaHomePage),
						SelectThe.movie(data));
	}

	@When("^she do the reservation$")
	public void she_do_the_reservation(List<String> data) {
		//mari.attemptsTo(DoThe.reservation(data));
	}


	@Then("^she should see the movie in the reservation$")
	public void she_should_see_the_movie_in_the_reservation(List<String> trailer) {
		mari.should(seeThat(CinecolombiaMovieResult.page(trailer)));
		
	}
	
}
