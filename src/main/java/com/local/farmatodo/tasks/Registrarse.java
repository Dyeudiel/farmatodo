package com.local.farmatodo.tasks;

import static com.local.farmatodo.user_interfaces.RegistroPage.APELLIDOS;
import static com.local.farmatodo.user_interfaces.RegistroPage.CELULAR;
import static com.local.farmatodo.user_interfaces.RegistroPage.CODIGO_CONFIRMACION;
import static com.local.farmatodo.user_interfaces.RegistroPage.CONTINUAR;
import static com.local.farmatodo.user_interfaces.RegistroPage.CONTRASENA;
import static com.local.farmatodo.user_interfaces.RegistroPage.CORREO_ELECTRONICO;
import static com.local.farmatodo.user_interfaces.RegistroPage.CREAR_CUENTA;
import static com.local.farmatodo.user_interfaces.RegistroPage.DOCUMENTO_DE_IDENTIDAD;
import static com.local.farmatodo.user_interfaces.RegistroPage.GENERO;
import static com.local.farmatodo.user_interfaces.RegistroPage.NOMBRES;
import static com.local.farmatodo.user_interfaces.RegistroPage.SALTAR_INTRODUCCION;

import com.local.farmatodo.models.Cliente;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Registrarse implements Task {

	private String nombres, apellidos, correo, contraseña, numCedula, numCelular, sexo;

	public Registrarse() {
		this.nombres = Cliente.LeerDatosDelCliente(0).getNombres();
		this.apellidos = Cliente.LeerDatosDelCliente(0).getApellidos();
		this.correo = Cliente.LeerDatosDelCliente(0).getCorreo();
		this.contraseña = Cliente.LeerDatosDelCliente(0).getContraseña();
		this.numCedula = Cliente.LeerDatosDelCliente(0).getNumCedula();
		this.numCelular = Cliente.LeerDatosDelCliente(0).getNumCelular();
		this.sexo = Cliente.LeerDatosDelCliente(0).getSexo();
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SALTAR_INTRODUCCION), Click.on(CREAR_CUENTA),
				Enter.theValue(numCedula).into(DOCUMENTO_DE_IDENTIDAD), Enter.theValue(correo).into(CORREO_ELECTRONICO),
				Click.on(CONTINUAR), Enter.theValue(contraseña).into(CONTRASENA), Click.on(CONTINUAR),
				Enter.theValue(nombres).into(NOMBRES), Click.on(CONTINUAR), Enter.theValue(apellidos).into(APELLIDOS),
				Click.on(CONTINUAR), Click.on(GENERO.of(sexo)), Click.on(CONTINUAR),
				Enter.theValue(numCelular).into(CELULAR), Click.on(CONTINUAR));
		actor.attemptsTo(Enter.theValue("123456").into(CODIGO_CONFIRMACION), Click.on(CONTINUAR));
	}

	public static Registrarse enFarmatodo() {
		return Tasks.instrumented(Registrarse.class);
	}
}
