package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeature/Registration.feature"} ,
		glue =  {"stepDefinations" , "MyHooks"} ,
		plugin = {"pretty"}
		
		)
public class userRegTest {

}
