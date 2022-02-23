package TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		
		features = {"KareHealth/src/test/resources/Login.feature"},
		glue = {"StepDefinition", "AppHooks"},
		monochrome=true,
		plugin = {"pretty","html:target/reports",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"
		
		}
		)
public class MyTestRunner {

}
