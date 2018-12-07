package com.cinecolombia.certification.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CinecolombiaTrailerPage extends PageObject{
	
	public static final Target CINECOLOMBIA_MOVIE = Target.the("Movie´s name").locatedBy("//img[contains(@title,'{0}')]");

}
