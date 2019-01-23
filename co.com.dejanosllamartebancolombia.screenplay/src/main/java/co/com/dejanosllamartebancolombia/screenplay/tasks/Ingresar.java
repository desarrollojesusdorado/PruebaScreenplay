package co.com.dejanosllamartebancolombia.screenplay.tasks;

import co.com.dejanosllamartebancolombia.screenplay.userinterface.PaginaBancolombiaDejanosLlamarte;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Ingresar implements Task {
	
	private PaginaBancolombiaDejanosLlamarte paginaBancolombiaDejanosLlamarte;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Open.browserOn(paginaBancolombiaDejanosLlamarte));
		
	}

	public static Ingresar aLaPaginaBancolombia() {
		
		return Tasks.instrumented(Ingresar.class);
	}

}
