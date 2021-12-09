package com.stepdefination;

import com.Factory.driver.DriverFactory;
import com.Pagesclass.BlazoHomepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class BlazoHomepageStep 

{
	private BlazoHomepage home=new BlazoHomepage(DriverFactory.getDriver());

	

	
	@Given("^user is on Blazedemo Home Page$")
	public void user_is_on_Blazedemo_Home_Page() throws Throwable 
	
	{
		
		DriverFactory.getDriver().get("https://blazedemo.com/");
		System.out.println("User is on Login page");
		
	}

	@When("^user gets the title$")
	public void user_gets_the_title() throws Throwable 
	
	{
		DriverFactory.getDriver().get("https://blazedemo.com/");
		String title=home.gethomepagetitile();
		System.out.println("Home page title is   " +title );

	}

	@Then("^page title should appears \"([^\"]*)\"$")
	public void page_title_should_appears(String Expected) throws Throwable 
	{
		DriverFactory.getDriver().get("https://blazedemo.com/");
		String title=home.gethomepagetitile();

		Assert.assertTrue(title.contains(Expected));

	}

	@Given("^User is on homepage$")
	public void user_is_on_homepage() throws Throwable 
	{
		
		System.out.println("User is on Login page");

	   
	}

	@When("^user gets the header and other text$")
	public void user_gets_the_header_and_other_text() throws Throwable 
	
	{
		DriverFactory.getDriver().get("https://blazedemo.com/");
		Assert.assertTrue(home.GetheaderText());
		
		
		
	   
	}

	@Then("^Page header should be \"([^\"]*)\"$")
	public void page_header_should_be(String HeaderTextExpectation) throws Throwable 
	{
		DriverFactory.getDriver().get("https://blazedemo.com/");
		Assert.assertTrue(home.GetheaderText());
	   
	}

	@Then("^Page should contain \"([^\"]*)\"$")
	public void page_should_contain(String DestCity) throws Throwable 
	{
		DriverFactory.getDriver().get("https://blazedemo.com/");
		Assert.assertTrue(home.Getdestinationtext());

	    
	}

	@Given("^User is on homepage screen$")
	public void user_is_on_homepage_screen() throws Throwable 
	{
		DriverFactory.getDriver().get("https://blazedemo.com/");
		System.out.println("User is on Login page");

	}

	@When("^user click on departure city dropdown$")
	public void user_click_on_departure_city_dropdown() throws Throwable 
	{
		DriverFactory.getDriver().get("https://blazedemo.com/");
		home.userclickDeparture();
		System.out.println("User clicks departure dropdown succesfully");
	}

	@Then("^User should see list of departure cities in the dropdown$")
	public void user_should_see_list_of_departure_cities_in_the_dropdown() throws Throwable 
	{
		DriverFactory.getDriver().get("https://blazedemo.com/");
		home.Departuredrop();
	}

	@Then("^User should be able to select departure city$")
	public void user_should_be_able_to_select_departure_city() throws Throwable 
	
	{
		DriverFactory.getDriver().get("https://blazedemo.com/");
		home.selectdeparture();
		System.out.println("Selected Departure Succesfully");
		

	}

	@Then("^user click on Destination city dropdown$")
	public void user_click_on_Destination_city_dropdown() throws Throwable 
	{
		DriverFactory.getDriver().get("https://blazedemo.com/");
	   home.userclickDestination();
	}

	@Then("^User should be able to select Destination City$")
	public void user_should_be_able_to_select_Destination_City() throws Throwable 
	{
		DriverFactory.getDriver().get("https://blazedemo.com/");
		home.selectdestination();
	  
	}

	@Given("^user selects destination and departure city$")
	public void user_selects_destination_and_departure_city() throws Throwable 
	
	{
		DriverFactory.getDriver().get("https://blazedemo.com/");
	  home.selectdestination();
		
	}
	
	@Then("^User able to login$")
	public void user_able_to_login() throws Throwable 
	
	{
		
		home.LoginButton();
	 
	}

	

	/*
	 * @Then("^user should be able to click Find Flight button$") public void
	 * user_should_be_able_to_click_Find_Flight_button() throws Throwable {
	 * DriverFactory.getDriver().get("https://blazedemo.com/"); home.LoginButton();
	 * 
	 * }
	 */



}
