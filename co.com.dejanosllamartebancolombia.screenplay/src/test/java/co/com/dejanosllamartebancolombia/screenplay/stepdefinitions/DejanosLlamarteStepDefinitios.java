package co.com.dejanosllamartebancolombia.screenplay.stepdefinitions;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.apache.tools.ant.filters.LineContains.Contains;
import org.apache.tools.ant.filters.TokenFilter.ContainsString;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import co.com.dejanosllamartebancolombia.screenplay.model.DatosUsuario;
import co.com.dejanosllamartebancolombia.screenplay.questions.Mensaje;
import co.com.dejanosllamartebancolombia.screenplay.tasks.Diligenciar;
import co.com.dejanosllamartebancolombia.screenplay.tasks.Ingresar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class DejanosLlamarteStepDefinitios {

	
	@Dado("^que (.*) quiere usar la pagin bancolombia$")
	public void queJesusQuiereUsarLaPaginBancolombia(String jesus)  {
		OnStage.theActorCalled(jesus).wasAbleTo(Ingresar.aLaPaginaBancolombia());
	}


	@Cuando("^el diligencia el formulario de dejanos llamarte$")
	public void elDiligenciaElFormularioDeDejanosLlamarte(List<DatosUsuario> datos)  {
		OnStage.theActorInTheSpotlight().attemptsTo(Diligenciar.elFormulario(datos));
	}

	@Entonces("^el deberia ver el mensaje (.*)$")
	public void elDeberiaVerElMensajeAlAceptarLasPoliticasDeTratamientoDeDatos(String texto)  {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Mensaje.es(), Matchers.equalTo(texto)));
		
		
	}
	
}
