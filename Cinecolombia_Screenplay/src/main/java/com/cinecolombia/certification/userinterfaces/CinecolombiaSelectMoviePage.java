package com.cinecolombia.certification.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CinecolombiaSelectMoviePage {
	
	public static final Target CINECOLOMBIA_POPUP = Target.the("Cinecolombia cancel popup button").located(By.id("cboxClose"));
	public static final Target CINECOLOMBIA_SELECT_CITY = Target.the("Cinecolombia select city list").located(By.id("edit-select-ciudades"));
	public static final Target CINECOLOMBIA_SELECT_THEATRE = Target.the("Cinecolombia select theatre list").located(By.id("edit-por-teatro"));
	public static final Target CINECOLOMBIA_SELECT_CALENDAR = Target.the("Cinecolombia select calendar").locatedBy("//img[@title='...']");
	//public static final Target CINECOLOMBIA_SELECT_DATE = Target.the("Cinecolombia select date").locatedBy("//input[@id='edit-fecha--2']");
	public static final Target CINECOLOMBIA_SELECT_DATE = Target.the("Cinecolombia select date").locatedBy("/html[1]/body[1]/div[11]/table[1]/tbody[1]/tr[2]/td[{0}]/a[1]");
	//public static final Target CINECOLOMBIA_SELECT_HOUR = Target.the("Cinecolombia select hour").locatedBy("//a[contains(text(),'{0}')]");
	public static final Target CINECOLOMBIA_SELECT_MOVIE = Target.the("Cinecolombia select movie").locatedBy("//a[@href='/pelicula/medellin/{0}']//img[@class='a109x161']");
	
}
