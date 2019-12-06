package co.com.choucairtesting.certification.reto2;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/reto2Empleo.feature",
        tags = "@EncuentraEmpleo",
        snippets = SnippetType.CAMELCASE )
public class RunnerTags {
}
