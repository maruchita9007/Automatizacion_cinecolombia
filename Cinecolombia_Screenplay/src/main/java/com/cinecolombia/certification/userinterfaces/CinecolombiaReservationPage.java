package com.cinecolombia.certification.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CinecolombiaReservationPage {
	public static final Target CINECOLOMBIA_USER = Target.the("Cinecolombia enter the user").located(By.id("edit-name--2"));
	public static final Target CINECOLOMBIA_PWD = Target.the("Cinecolombia enter the pwd").located(By.id("edit-pass--2"));
	public static final Target CINECOLOMBIA_CAPTCHA = Target.the("Cinecolombia enter el captcha").locatedBy("/html[1]/body[1]/div[8]/div[1]/div[2]/div[2]/div[2]");
	
}
