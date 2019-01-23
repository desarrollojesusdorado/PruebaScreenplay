package co.com.dejanosllamartebancolombia.screenplay.tasks;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import org.openqa.selenium.remote.server.handler.SwitchToParentFrame;

import co.com.dejanosllamartebancolombia.screenplay.model.DatosUsuario;
import co.com.dejanosllamartebancolombia.screenplay.userinterface.PaginaBancolombiaDejanosLlamarte;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.findby.By;

public class Diligenciar implements Task {
	
	private static WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
	private List<DatosUsuario> datos;
	
	
	public Diligenciar(List<DatosUsuario> datos) {
		super();
		this.datos = datos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		//driver.switchTo().frame(0);
		driver.switchTo().parentFrame();		
		driver.switchTo().frame("Demos");
		actor.attemptsTo(Scroll.to(PaginaBancolombiaDejanosLlamarte.CONFIRMA_CORREO_ELECTRONICO));
     	actor.attemptsTo(Enter.theValue(datos.get(0).getNombre()).into(PaginaBancolombiaDejanosLlamarte.INGRESA_NOMBRE_COMPLETO));
		actor.attemptsTo(SelectFromOptions.byVisibleText(datos.get(0).getTipoDocumento()).from(PaginaBancolombiaDejanosLlamarte.CLICK_PARA_SELECCION_CEDULA));
		actor.attemptsTo(Enter.theValue(datos.get(0).getNumeroDocumento()).into(PaginaBancolombiaDejanosLlamarte.INGRESA_NUMERO_DOCUMENTO));
		actor.attemptsTo(Enter.theValue(datos.get(0).getCorreo()).into(PaginaBancolombiaDejanosLlamarte.INGRESA_CORREO_ELECTRONICO));
		actor.attemptsTo(Enter.theValue(datos.get(0).getCorreo()).into(PaginaBancolombiaDejanosLlamarte.CONFIRMA_CORREO_ELECTRONICO));
		actor.attemptsTo(SelectFromOptions.byVisibleText(datos.get(0).getPais()).from(PaginaBancolombiaDejanosLlamarte.CLICK_SELECCIONA_PAIS));
		actor.attemptsTo(Enter.theValue(datos.get(0).getCiudad()).into(PaginaBancolombiaDejanosLlamarte.INGRESA_NOMBRE_CIUDAD));
		actor.attemptsTo(Enter.theValue(datos.get(0).getNumeroTelefono()).into(PaginaBancolombiaDejanosLlamarte.INGRESA_NUMERO_TELEFONO));
		actor.attemptsTo(Enter.theValue(datos.get(0).getAsunto()).into(PaginaBancolombiaDejanosLlamarte.INGRESA_ASUNTO));
		actor.attemptsTo(SelectFromOptions.byVisibleText(datos.get(0).getTiempoParaContacto()).from(PaginaBancolombiaDejanosLlamarte.CLICK_SELECCION_TIEMPO_CONTACTO));
		actor.attemptsTo(Click.on(PaginaBancolombiaDejanosLlamarte.CHEKEA_HE_LEIDO_Y_ACEPTO));
		//actor.attemptsTo(Click.on(PaginaBancolombiaDejanosLlamarte.CLICK_TERMINOS_POLITICA));
		//actor.attemptsTo(Click.on(PaginaBancolombiaDejanosLlamarte.CLICK_BOTON_SALIR));
	}

	public static Performable elFormulario(List<DatosUsuario> datos) {
		
		return Tasks.instrumented(Diligenciar.class, datos);
	}

}
