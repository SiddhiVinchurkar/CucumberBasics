package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationUberBooking {
	
	@Given("User wants to select a car type {string} from uber app")  // {string} -> cucumber expressions
	public void user_wants_to_select_a_car_type_from_uber_app(String carType) 
	{
		System.out.println("Step 1 "+carType);
	}

	@When("User selects car {string} and pick up point {string} and drop location {string}")
	public void user_selects_car_and_pick_up_point_and_drop_location(String carType, String pickUpLocation, String dropLocation)
	{
		System.out.println("Step 2 "+carType+" "+pickUpLocation+" "+dropLocation);
	}

	@Then("Driver satrts the journey")
	public void driver_satrts_the_journey() 
	{
		System.out.println("Step 3 ");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() 
	{
		System.out.println("Step 4 ");
	}

	@Then("^User pays ([0-9]*) USD$")     		// ([0-9]*) -> regular expression foe 0-9 any length
	public void user_pays_usd(Integer price) 
	{
		System.out.println("Step 5 : "+price);
	}
	
// Cucumber and regular expressions both cannot be used in a single line
// If you use regular expressions in a function, it should start with ^ and end with $ otherwise exception is thrown	

}
