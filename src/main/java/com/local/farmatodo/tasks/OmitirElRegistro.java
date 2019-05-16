package com.local.farmatodo.tasks;

import static com.local.farmatodo.user_interfaces.CarritoPage.AVANZAR_SIN_REGUISTRARME;
import static com.local.farmatodo.user_interfaces.RegistroPage.SALTAR_INTRODUCCION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OmitirElRegistro implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SALTAR_INTRODUCCION), Click.on(AVANZAR_SIN_REGUISTRARME));
	}

	public static OmitirElRegistro enLaAplicacion() {
		return Tasks.instrumented(OmitirElRegistro.class);
	}
}
