package com.cinecolombia.certification.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import java.util.List;
import com.cinecolombia.certification.userinterfaces.CinecolombiaSelectMoviePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class SelectThe implements Task{

	private List<?> movie;
	public SelectThe(List<?> movie) {
		this.movie = movie;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(CinecolombiaSelectMoviePage.CINECOLOMBIA_POPUP),
				SelectFromOptions.byValue((String) movie.get(4)).from(CinecolombiaSelectMoviePage.CINECOLOMBIA_SELECT_CITY),
				//Click.on(CinecolombiaSelectMoviePage.CINECOLOMBIA_POPUP),
				SelectFromOptions.byValue((String) movie.get(5)).from(CinecolombiaSelectMoviePage.CINECOLOMBIA_SELECT_THEATRE),
				Click.on(CinecolombiaSelectMoviePage.CINECOLOMBIA_COOKIE),
				Click.on(CinecolombiaSelectMoviePage.CINECOLOMBIA_SELECT_CALENDAR),
				Click.on(CinecolombiaSelectMoviePage.CINECOLOMBIA_SELECT_DATE.of((String) movie.get(6))),
				Click.on(CinecolombiaSelectMoviePage.CINECOLOMBIA_SELECT_MOVIE.of((String) movie.get(7)))
				//Click.on(CinecolombiaSelectMoviePage.CINECOLOMBIA_SELECT_HOUR.of((String) movie.get(7)))
				);
			
				
			}
	
	public static SelectThe movie(List<?> movie) {
		return instrumented(SelectThe.class,movie);
	}

}
