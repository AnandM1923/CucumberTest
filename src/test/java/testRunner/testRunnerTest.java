package testRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = {"C:\\Users\\margo\\eclipse-workspace1\\CuCuBDD\\Features\\Login.feature"},
			glue = "stepDefination",
			dryRun = false,
			plugin = {"pretty", "html:test-output"}
			
			)
	
		
	public class testRunnerTest {
	
}
