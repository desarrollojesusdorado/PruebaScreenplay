package co.com.dejanosllamartebancolombia.screenplay.questions;

import co.com.dejanosllamartebancolombia.screenplay.userinterface.PaginaBancolombiaDejanosLlamarte;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

@Subject("")
public class Mensaje implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		
		return Text.of(PaginaBancolombiaDejanosLlamarte.MENSAJE_ESPERADO).viewedBy(actor).asString();
		
		//return PaginaBancolombiaDejanosLlamarte.MENSAJE_ESPERADO.resolveFor(actor).getText();	
			
	}

	public static Mensaje es() {
		
		return new Mensaje();
	}

}
