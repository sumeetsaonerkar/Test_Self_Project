package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/All_FeatureFiles",
		glue = {"stepDefinitions"},
		monochrome = true,
		dryRun = false,
		plugin = {"pretty", "html:target/HtmlReports"}
		
		)
public class TestRunner {

}
