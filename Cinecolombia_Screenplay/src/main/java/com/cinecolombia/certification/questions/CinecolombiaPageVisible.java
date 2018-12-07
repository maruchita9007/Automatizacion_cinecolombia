package com.cinecolombia.certification.questions;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import com.cinecolombia.certification.userinterfaces.CinecolombiaSelectMoviePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CinecolombiaPageVisible implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		return the(CinecolombiaSelectMoviePage.CINECOLOMBIA_POPUP).answeredBy(actor).isCurrentlyVisible();
	}
	
	public static Question<Boolean> isVisible() {
		return new CinecolombiaPageVisible();
	}

}
