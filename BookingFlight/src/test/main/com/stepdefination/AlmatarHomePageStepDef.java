package com.stepdefination;

import com.Factory.driver.DriverFactory;

import com.Pagesclass.AlmatarHomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AlmatarHomePageStepDef 

{
	private AlmatarHomePage home=new AlmatarHomePage(DriverFactory.getDriver());

	
	@Given("User is on AlmatarHomePage.")
	public void user_is_on_almatar_home_page() 
	
	{
		DriverFactory.getDriver().get("https://almatar.com/en");
		System.out.println("UserLandsHomePage");
	}
	@Then("User Verifies Title of the page.")
	public void user_verifies_title_of_the_page() throws InterruptedException 
	
	{
		DriverFactory.getDriver().get("https://almatar.com/en");
	    home.gethomepagetitile();
	  
	}
	@Then("User should see header text {string}")
	public void user_should_see_header_text(String Expected) 
	
	{
		DriverFactory.getDriver().get("https://almatar.com/en");
		
	   String Error1=home.GetheaderText();
	   Assert.assertEquals(Expected, Error1);
	}
	@Then("User clicks on Flights Tab.")
	public void user_clicks_on_flights_tab() 
	
	{
		DriverFactory.getDriver().get("https://almatar.com/en");
		home.ClickFlight();
	   
	}
	@Then("User verifies messages {string} and {string} in From textbox when user doesnt enter origin")
	public void user_verifies_messages_and_in_from_textbox_when_user_doesnt_enter_origin(String Expected1, String Expected2) throws InterruptedException 
	
	{
		DriverFactory.getDriver().get("https://almatar.com/en");
		home.ClickFlight();
		Thread.sleep(5000);
		home.Search();
		Thread.sleep(5000);
	   String str1=home.ValidatationErrorFrom1();
	   Assert.assertEquals(Expected1, str1);
	   
	   String str2=home.ValidatationErrorFrom2();
	   Assert.assertEquals(Expected2, str2);
	}
	@Then("User verifies messages {string} and {string} in From textbox when user doesnt enter destination")
	public void user_verifies_messages_and_in_from_textbox_when_user_doesnt_enter_destination(String Expected1, String Expected2) throws InterruptedException 
	
	{
		DriverFactory.getDriver().get("https://almatar.com/en");
		home.ClickFlight();
		Thread.sleep(5000);
		home.Search();
		Thread.sleep(5000);
		String str1=home.ValidateErrorTo1();
		Assert.assertEquals(Expected1, str1);
		
		String str2=home.ValidateErrorTo2();
		Assert.assertEquals(Expected2, str2);
	  
	}
	@Then("User clicks on search button.")
	public void user_clicks_on_search_button() 
	
	{
	System.out.println("User clicks on search Button");
	}
	
	@Given("User is on Homepage")
	public void user_is_on_homepage() 
	{
		DriverFactory.getDriver().get("https://almatar.com/en");
	}
	@Then("User enters TO city and User enters FROM city")
	public void user_enters_to_city_and_user_enters_from_city() throws InterruptedException 
	
	{
		DriverFactory.getDriver().get("https://almatar.com/en");
		Thread.sleep(2000);
		home.ClickFlight();
		Thread.sleep(2000);
		home.EnterFromCity();
		Thread.sleep(2000);
		home.ToCity();
		home.departure();
	    
	}
	@Then("User enters departure date")
	public void user_enters_departure_date() throws InterruptedException 
	{
	
	  home.departure();
	   
	}
	@Then("User enters number of Travellers")
	public void user_enters_number_of_travellers() throws InterruptedException 
	
	{
		home.Traveller();
	   
	}
	@Then("User click on search icon")
	public void user_click_on_search_icon() throws InterruptedException 
	{
		home.Search();
		Thread.sleep(10000);
	    
	}





	
	

}
