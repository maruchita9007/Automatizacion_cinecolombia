package com.cinecolombia.certification.questions;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import java.util.List;

import com.cinecolombia.certification.userinterfaces.CinecolombiaTrailerPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CinecolombiaMovieResult implements Question<Boolean>{
	
	private static String errorMessage = "wrong movie";
	
	private List<?> trailer;
	public CinecolombiaMovieResult(List<?> trailer) {
		this.trailer = trailer;
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {
		
		//Retorna un true si la pelicula esta actualmente visible para el actor
		 return the(CinecolombiaTrailerPage.CINECOLOMBIA_MOVIE.of((String) trailer.get(1))).answeredBy(actor).isCurrentlyVisible();
	}
	
	//Constructor de la clase	
	public static CinecolombiaMovieResult page(List<?> trailer) {
		return new CinecolombiaMovieResult(trailer);
	}
	
	public static String getErrorMessage() {
		return errorMessage;
	}

}
