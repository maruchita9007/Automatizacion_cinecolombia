package com.cinecolombia.certification.tasks;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.hamcrest.Matcher;

import com.cinecolombia.certification.exceptions.WithoutConnectionToTheNetwork;
import com.cinecolombia.certification.questions.CinecolombiaPageVisible;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import com.cinecolombia.certification.userinterfaces.CinecolombiaSelectMoviePage;
public class OpenTheBrowser implements Task {

	private PageObject page;
	public OpenTheBrowser(PageObject page) {
		this.page = page;		
	}
	
	@Override
	@Step("{0} open the browser on Cincecolombia Home Page")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));	
		WaitUntil.the(CinecolombiaSelectMoviePage.CINECOLOMBIA_POPUP, WebElementStateMatchers.isVisible());

//		actor.should(seeThat(CinecolombiaPageVisible.isVisible()).orComplainWith(WithoutConnectionToTheNetwork.class,
//				getNoInternetConectionMessage()));
	}
	
	public String getNoInternetConectionMessage() {
		return String.format(WithoutConnectionToTheNetwork.getErrorNetworkMessage());

	}
	
	public static OpenTheBrowser on(PageObject page) {
		return instrumented(OpenTheBrowser.class,page);
	}
	
}
