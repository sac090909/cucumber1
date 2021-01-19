package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"./features"},
		glue= {"stepDefs"},
		monochrome=true,
		dryRun=false,
		plugin = {"pretty", "html:target/cucumber-reports/index.html", "json:target/cucumber-reports/cucumber.json"}
		
		
		)	

public class RunnerTest {
	


}
