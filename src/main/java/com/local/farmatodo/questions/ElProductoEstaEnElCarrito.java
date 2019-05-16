package com.local.farmatodo.questions;

import static com.local.farmatodo.user_interfaces.CarritoPage.CARRITO_DE_COMPRAS;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

public class ElProductoEstaEnElCarrito implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {

		actor.attemptsTo(Click.on(CARRITO_DE_COMPRAS));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public static ElProductoEstaEnElCarrito deCompras() {
		return new ElProductoEstaEnElCarrito();
	}
}
