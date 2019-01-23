package co.com.dejanosllamartebancolombia.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.grupobancolombia.com/wps/portal/personas/dejanos-llamarte")
public class PaginaBancolombiaDejanosLlamarte extends PageObject {
	
	public static final Target INGRESA_NOMBRE_COMPLETO = Target.the("").located(By.id("nombre"));
	public static final Target CLICK_PARA_SELECCION_CEDULA = Target.the("").located(By.id("tipo"));
	public static final Target INGRESA_NUMERO_DOCUMENTO = Target.the("").located(By.id("documento"));
	public static final Target INGRESA_CORREO_ELECTRONICO = Target.the("").located(By.id("correo"));
	public static final Target CONFIRMA_CORREO_ELECTRONICO = Target.the("").located(By.id("confirmar"));
	public static final Target CLICK_SELECCIONA_PAIS = Target.the("").located(By.id("pais"));
	public static final Target INGRESA_NOMBRE_CIUDAD = Target.the("").located(By.id("ciudad"));
	public static final Target INGRESA_NUMERO_TELEFONO = Target.the("").located(By.id("telefono"));
	public static final Target INGRESA_ASUNTO = Target.the("").located(By.id("asunto"));
	public static final Target CLICK_SELECCION_TIEMPO_CONTACTO = Target.the("").located(By.id("tiempo"));
	public static final Target CHEKEA_HE_LEIDO_Y_ACEPTO = Target.the("").located(By.className("lab_pol"));	
	public static final Target CLICK_TERMINOS_POLITICA = Target.the("").located(By.className("terminos"));
	public static final Target MENSAJE_ESPERADO = Target.the("").located(By.id("mtexto"));
	public static final Target CLICK_BOTON_SALIR = Target.the("").located(By.id("bsalir"));
	public static final Target ELEMENTO_ESPERADO = Target.the("").located(By.id("terminoBusqueda"));
	
	
}
