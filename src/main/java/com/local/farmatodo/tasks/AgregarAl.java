package com.local.farmatodo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AgregarAl implements Task {

	private String producto;

	public AgregarAl(String producto) {
		this.producto = producto;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

	}

	public static AgregarAl carritoEl(String producto) {
		return Tasks.instrumented(AgregarAl.class, producto);
	}
}
