package stepDefinations;

import Implementation.Product;
import Implementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class SearchSteps {
	
	Product product;
	Search search;
	
	@Given("I have a search field on Amazon Page")
	public void i_have_a_search_field_in_amazon_page()
	{
		   System.out.println("Step 1 : I am on Search page");
	}
	
	@When("^I search for a product with name \"([^\"]+)\" and price (\\d+)$") 	   // "([^"]+)" -> any char other than " , escape character have been added before " and (\\d+) -> any digit [one or more]    	
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price)
	{
		 System.out.println("Step 2 : Search for product with name :"+productName+" price : "+price);
		
		 product = new Product(productName, price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName)
	{
	    System.out.println("Step 3 : Product "+productName+" is displayed");
	    
	    search=new Search();
	    String name = search.displayProduct(product);
	    
	    System.out.println("Searched product is :"+name);
	    Assert.assertEquals(product.getProductName(), name);
	}


}
