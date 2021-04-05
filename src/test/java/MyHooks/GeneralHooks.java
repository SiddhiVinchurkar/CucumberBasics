package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class GeneralHooks {
	
	@Before(order = 1) 				  // 	@Before("@Smoke") -> can also be used
	public void setUp_browser()
	{
		System.out.println("Launch browser");
	}
	
	@Before(order = 2)
	public void setUp_app()
	{
		System.out.println("Launch amazon application");
	}
	
	@After(order = 1)
	public void tearDown_close()
	{
		System.out.println("Close the browser");
	}
	
	@After(order = 2)
	public void tearDown_logout()
	{
		System.out.println("Logout from amazon application");
	}
	
	@BeforeStep
	public void takesScreenshot()
	{
		System.out.println("Take the screenshot");
	}
	
	@AfterStep
	public void refreshPage()
	{
		System.out.println("Refresh the page");
	}

}
