package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeature/Search.feature"} ,
		glue =  {"stepDefinations" , "MyHooks"} ,
		plugin = {"pretty"}
		
		)
/*
 *  features will go to the given path and pick the featureFile to execute.
 *  glue will then detect the stepDefinations file and start executing them. 
 *  pretty plugin is used for a good format
 */
public class SearchTest {

}
