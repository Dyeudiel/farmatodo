package com.local.farmatodo.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoPage {

	public static final Target AVANZAR_SIN_REGUISTRARME = Target.the("Avanzar Sin Registrarme")
			.locatedBy("//*[@text='Avanzar sin registrarme']");
	public static final Target BARRA_DE_BUSQUEDA = Target.the("Barra de Busqueda")
			.locatedBy("//*[@text='Busca aquí tu producto']");

	public static final Target PRODUCTO = Target.the("Producto")
			.locatedBy("//android.view.ViewGroup/*[@text='Oferta Chapstick Tripack']");

	public static final Target AGREGAR = Target.the("Agregar al Carrito").locatedBy("//*[@text='AGREGAR']");

	public static final Target SALIR_DE_BARRA_DE_BUSQUEDA = Target.the("Salir del Buscador")
			.locatedBy("//*[contains(@resource-id,'algoliaSearch_imageButtonClose')]");

	public static final Target CARRITO_DE_COMPRAS = Target.the("Carrito de Compras")
			.locatedBy("//*[contains(@resource-id,'shopCart_layout')]");
	public static final Target NOMBRE_DEL_PRODUCTO = Target.the("Nombre del Producto")
			.locatedBy("//*[contains(@resource-id,'product_name')]");

}
