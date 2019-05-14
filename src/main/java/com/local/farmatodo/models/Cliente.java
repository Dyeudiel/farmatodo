package com.local.farmatodo.models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nombres, apellidos, correo, contraseña, numCedula, numCelular, sexo;

	public static List<Cliente> clientes = new ArrayList<>();

	public static void GuardarDatosDelCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public static Cliente LeerDatosDelCliente(int index) {
		return clientes.get(index);
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getNumCedula() {
		return numCedula;
	}

	public void setNumCedula(String numCedula) {
		this.numCedula = numCedula;
	}

	public String getNumCelular() {
		return numCelular;
	}

	public void setNumCelular(String numCelular) {
		this.numCelular = numCelular;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
