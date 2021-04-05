package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class billingSteps {

	double billingAmount;
	double taxAmount;
	double finalAmount;
	
	@Given("user is on billing page")
	public void user_is_on_billing_page() 
	{

	}

	@When("user enters billing amount {string}")
	public void user_enters_billing_amount(String billingAmount)   // this comes from feature file
	{
	  this.billingAmount=Integer.parseInt(billingAmount);
	}

	/*
	 * At run time we get io.cucumber.core.runner.AmbiguousStepDefinitionsException as it does not know which 
	 * method to call. This works fine in Cucumber 4 version.
	 * Solution can be to use String in feature file and then convert using Integer.parseInt() or Double.parseDouble()
	 * in stepDefination file
	 * Refer user_enters_billing_amount() method given above
	 */
	
	@When("user enters tax amount {int}")
	public void user_enters_tax_amount(Integer taxAmount) 
	{
	   this.taxAmount=taxAmount;
	}

	@When("user enters tax amount {double}")
	public void user_enters_tax_amount(Double taxAmount) 
	{
		this.taxAmount=taxAmount;
	}
	
	@When("user clicks on calculate button")
	public void user_clicks_on_calculate_button()
	{
	
	}

	@Then("it gives the final amount {int}")
	public void it_gives_the_final_amount(Integer finalAmount)
	{
		this.finalAmount = this.billingAmount + this.taxAmount;
		
		Assert.assertTrue(this.finalAmount == finalAmount);
	}



	@Then("it gives the final amount {double}")
	public void it_gives_the_final_amount(Double finalAmount) 
	{
		this.finalAmount = this.billingAmount + this.taxAmount;
		
		Assert.assertTrue(this.finalAmount == finalAmount);
	}


}
