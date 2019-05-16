package com.local.farmatodo.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SeRegistroElUsaurioSatisfactoriamente implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		Serenity.takeScreenshot();
		return false;
	}

	public static SeRegistroElUsaurioSatisfactoriamente enLaAplicacion() {
		return new SeRegistroElUsaurioSatisfactoriamente();
	}
}
