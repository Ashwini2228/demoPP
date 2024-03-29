package TestRunnerCloth;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//FeatureCloth/Login.feature",
		glue = "StepDefinitionCloth",
		dryRun =false,
		monochrome=true,
		plugin = {"pretty","html:test-output"}
		
		)
public class MyRunner {
}
