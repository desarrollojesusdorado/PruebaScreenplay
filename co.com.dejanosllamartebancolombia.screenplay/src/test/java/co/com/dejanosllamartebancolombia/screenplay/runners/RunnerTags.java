package co.com.dejanosllamartebancolombia.screenplay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/dejanos_llamarte_bancolombia.feature",
		tags= "@tag1",
		glue= {"co.com.dejanosllamartebancolombia.screenplay.stepdefinitions", "co.com.dejanosllamartebancolombia.screenplay.util" },
		snippets=SnippetType.CAMELCASE		)
public class RunnerTags {

}
