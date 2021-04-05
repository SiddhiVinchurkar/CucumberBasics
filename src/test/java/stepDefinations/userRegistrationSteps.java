package stepDefinations;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class userRegistrationSteps {
	
	@Given("User is on registration page")
	public void user_is_on_registration_page() 
	{
		System.out.println("User navigates on registration page");
	}

	@When("User enters following details")
	public void user_enters_following_details(DataTable dataTable)
	{
		List<List<String>> userList=dataTable.asLists(String.class); // asLists is used to convert from Data table to List<List<String>>
		
		for(List<String> e:userList)
		{
			System.out.println(e);
		}
	}
	
	@When("User enters following details with columns")
	public void user_enters_following_details_with_columns(DataTable dataTable) 
	{
	   List<Map<String,String>> userList=dataTable.asMaps(String.class,String.class);  // asMaps will return a list of Maps
	  // Use asMaps when you want o/p in the form of key and value pair
		
			System.out.println(userList);
		//	System.out.println(userList.get(0).get("firstName"));
		
	}

	@Then("User registarion should be successful")
	public void user_registarion_should_be_successful() 
	{
		System.out.println("User registration is successful");
	}

}
