package com.local.farmatodo.tasks;

import static com.local.farmatodo.user_interfaces.CarritoPage.AGREGAR;
import static com.local.farmatodo.user_interfaces.CarritoPage.BARRA_DE_BUSQUEDA;
import static com.local.farmatodo.user_interfaces.CarritoPage.SALIR_DE_BARRA_DE_BUSQUEDA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AgregarAl implements Task {

	private String producto;

	public AgregarAl(String producto) {
		this.producto = producto;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(BARRA_DE_BUSQUEDA), Enter.theValue(producto).into(BARRA_DE_BUSQUEDA),
				Click.on(AGREGAR), Click.on(SALIR_DE_BARRA_DE_BUSQUEDA));
	}

	public static AgregarAl carritoEl(String producto) {
		return Tasks.instrumented(AgregarAl.class, producto);
	}
}
