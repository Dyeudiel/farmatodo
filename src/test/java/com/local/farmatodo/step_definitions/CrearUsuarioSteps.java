package com.local.farmatodo.step_definitions;

import static com.local.farmatodo.drivers.AndroidAppiumDriver.android;
import static net.serenitybdd.screenplay.abilities.BrowseTheWeb.with;
import static net.serenitybdd.screenplay.actors.Cast.ofStandardActors;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;

import com.local.farmatodo.models.Cliente;
import com.local.farmatodo.tasks.AgregarAl;
import com.local.farmatodo.tasks.Registrarse;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CrearUsuarioSteps {

	@Given("^Aun no estoy registrado en la plataforma de Farmatodo$")
	public void aunNoEstoyRegistradoEnLaPlataformaDeFarmatodo() {
		setTheStage(ofStandardActors());
		theActorCalled("Yeudiel").can(with(android()));

	}

	@When("^Realizo el registro en la aplicación$")
	public void realizoElRegistroEnLaAplicación(List<Cliente> datosCliente) {
		Cliente.GuardarDatosDelCliente(datosCliente.get(0));
		theActorInTheSpotlight().attemptsTo(Registrarse.enFarmatodo());
	}

	@When("^Adiciono el producto (.*) al Carrito$")
	public void adicionoElProductoAlCarrito(String producto) {
		theActorInTheSpotlight().attemptsTo(AgregarAl.carritoEl(producto));
	}

	@Then("^Visualizo el producto seleccionado en el carrito$")
	public void visualizoElProductoSeleccionadoEnElCarrito() {

	}

	@Then("^El valor corresponde a la busqueda$")
	public void elValorCorrespondeALaBusqueda() {

	}

}
