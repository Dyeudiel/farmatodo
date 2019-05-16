package com.local.farmatodo.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegistroPage {

	public static final Target SALTAR_INTRODUCCION = Target.the("Saltar Introducción")
			.locatedBy("//*[@text='Saltar Introducción']");

	public static final Target CREAR_CUENTA = Target.the("Crear cuenta").locatedBy("//*[@text='Crear cuenta']");
	public static final Target DOCUMENTO_DE_IDENTIDAD = Target.the("Documento de Identidad")
			.locatedBy("//*[@text='Documento de Identidad']");
	public static final Target CORREO_ELECTRONICO = Target.the("Correo Electrónico")
			.locatedBy("//*[@text='Correo Electrónico']");
	public static final Target CONTRASENA = Target.the("Contraseña").locatedBy("//*[@text='Contraseña']");
	public static final Target NOMBRES = Target.the("Nombres").locatedBy("//*[@text='Nombres']");
	public static final Target APELLIDOS = Target.the("Apellidos").locatedBy("//*[@text='Apellidos']");
	public static final Target GENERO = Target.the("{0}").locatedBy("//*[@text='{0}']");
	public static final Target CELULAR = Target.the("Celular").locatedBy("//*[@text='Celular']");
	public static final Target CODIGO_CONFIRMACION = Target.the("Código Confirmación").locatedBy("//*[@text='Código']");

	public static final Target CONTINUAR = Target.the("Continuar").locatedBy("//*[@text='Continuar']");

}
