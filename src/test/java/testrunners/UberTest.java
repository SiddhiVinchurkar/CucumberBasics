package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeature/Uber.feature"} ,
		glue =  {"stepDefinations", "MyHooks"} ,
//		tags = "All" ,           	 // to run tag specific tests. Write "not @TagName" to exclude the tests	
		plugin = {"pretty" , 
				    "json:target/MyReports/report.json" ,   // For report generation
				     "junit:target/MyReports/report.xml"    // For report generation
				  } 
	//,	publish = true	// To generate report on cucumber cloud 
	//, dryRun = true   // to check which steps do not have any associated stepDefination 
		
		)

public class UberTest {

}
