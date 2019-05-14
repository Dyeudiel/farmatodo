package com.local.farmatodo.tasks;

import com.local.farmatodo.models.Cliente;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Registrarse implements Task {

	private String nombres, apellidos, correo, contraseña, numCedula, numCelular, sexo;

	public Registrarse(String nombres, String apellidos, String correo, String contraseña, String numCedula,
			String numCelular, String sexo) {
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
		actor.attemptsTo();
	}

	public static Registrarse enFarmatodo() {
		return Tasks.instrumented(Registrarse.class);
	}
}
