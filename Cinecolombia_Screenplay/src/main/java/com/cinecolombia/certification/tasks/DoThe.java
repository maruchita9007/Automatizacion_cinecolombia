package com.cinecolombia.certification.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import java.util.List;

import com.cinecolombia.certification.userinterfaces.CinecolombiaReservationPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DoThe implements Task {

	private List<?> reservation;
	public DoThe(List<?> reservation) {
		this.reservation = reservation;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue((String) reservation.get(4)).into(CinecolombiaReservationPage.CINECOLOMBIA_USER),
					     Enter.theValue((String) reservation.get(5)).into(CinecolombiaReservationPage.CINECOLOMBIA_PWD),
					     Click.on(CinecolombiaReservationPage.CINECOLOMBIA_CAPTCHA));
		
	}
	
	public static DoThe reservation(List<?> reservation) {
		return instrumented(DoThe.class,reservation);
	}

}
