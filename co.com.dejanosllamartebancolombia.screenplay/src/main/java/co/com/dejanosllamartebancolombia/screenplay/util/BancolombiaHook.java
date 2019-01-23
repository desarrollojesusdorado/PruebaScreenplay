package co.com.dejanosllamartebancolombia.screenplay.util;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class BancolombiaHook {

	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
	}
}
