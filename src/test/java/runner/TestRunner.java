package runner;

import io.cucumber.java.nl.Stel;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
		features = "src/main/resources/homepage.feature",
		glue ={"utility", "StepDefs"},
		plugin = {"pretty", "html:target/cucumber-html-report", "json:cucumber.json"}
)
public class TestRunner {
}
