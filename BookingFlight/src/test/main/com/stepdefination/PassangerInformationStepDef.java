package com.stepdefination;

import com.Factory.driver.DriverFactory;
import com.Pagesclass.AlmatarLandingDef;
import com.Pagesclass.AlmatarHomePage;
import com.Pagesclass.PassangerInformation;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PassangerInformationStepDef

{
	
	private AlmatarLandingDef Landing=new AlmatarLandingDef(DriverFactory.getDriver());
	private AlmatarHomePage home=new AlmatarHomePage(DriverFactory.getDriver());
	private PassangerInformation Info=new PassangerInformation(DriverFactory.getDriver());
	@When("User is on home page")
	public void user_is_on_home_page() throws InterruptedException 
	
	{
		DriverFactory.getDriver().get("https://almatar.com/en");
		
	     home.ClickFlight();
	    
	 
	}
	@Then("User Selects from and to city and enter departure time and Enter traveller count and hit search icon")
	public void user_selects_from_and_to_city_and_enter_departure_time_and_enter_traveller_count_and_hit_search_icon() throws InterruptedException 
	
	{
		 home.EnterFromCity();
	     home.ToCity();
	     home.Traveller();
	     home.Search();
	     Thread.sleep(10000);
		Landing.Button();
	}
	@Then("User Clicks on Choose button")
	public void user_clicks_on_choose_button() throws InterruptedException 
	
	{
		Landing.ClickChooseFlight();
		Thread.sleep(5000);
	   
	}
	@Then("User enters {string} and {string}")
	public void user_enters_and(String Argue1, String Argue2) 
	
	{
		
		Info.FirstName(Argue1);
		Info.LastName(Argue2);
	}
	@Then("user passes {string}")
	public void user_passes(String string) throws InterruptedException 
	
	{
	   Info.Email();
	}
	@Then("User selects Date of Birth")
	public void user_selects_date_of_birth() throws InterruptedException 
	
	{
	   Info.Day();
	   Info.Month();
	   Info.year();
	}
	@Then("User selects Gender")
	public void user_selects_gender() 
	
	{
	   System.out.println("Test");
	}
	@Then("User selects Doccument Type")
	public void user_selects_doccument_type() 
	
	{
		  System.out.println("Test");
	}
	@Then("User selects Nationality")
	public void user_selects_nationality() throws InterruptedException 
	
	{
	  Info.Nationality();
	}
	@Then("User selects Issuing Country")
	public void user_selects_issuing_country() throws InterruptedException 
	
	{
		Info.IssueCountry();
	}
	@Then("User Enters the passport details")
	public void user_enters_the_passport_details() 
	
	{
	  Info.PassportNumber1();
	}
	@Then("User selects passport issuing country")
	public void user_selects_passport_issuing_country() throws InterruptedException 
	
	{
		Info.IssueCountry();
	   
	}
	@Then("User selects Passport expiry date")
	public void user_selects_passport_expiry_date() throws InterruptedException 
	
	{
	    Info.ExpirePassport();
	}
	@Then("User Selects {string}")
	public void user_selects(String argue) 
	
	{
		Info.PhoneNumber(argue);
	   
	}
	
	@Then("User clicks on Submit button")
	public void user_clicks_on_submit_button() 
	{
		Info.ProceedPayment();
	   
	}


 
}
