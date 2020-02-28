package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions
		(
		//Place to put feature file
				
				features=".//Features/signInSignOut.feature",
				glue="stepDefinitions"
			
				
		
		)

public class TestRun3 {

}
