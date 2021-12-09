package com.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Factory.driver.DriverFactory;
import com.Pagesclass.BlazoHomepage;
import com.Pagesclass.BookingPageclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookingPage 

{
	
	
	
	private BookingPageclass book=new BookingPageclass(DriverFactory.getDriver());
		
	
	@When("^User selects paris$")
	public void user_selects_paris() throws Throwable 
	
	{
		DriverFactory.getDriver().get("https://blazedemo.com/");
		book. selectdeparture();
		
	}

	@Then("^User Select london as arrival place$")
	public void user_Select_london_as_arrival_place() throws Throwable 
	{
	   
	   book.selectdestination();
	}

	@Then("^User click on login button$")
	public void user_click_on_login_button() throws Throwable 
	
	{
		
		book.LoginButton();
	   
	}

		
		@Given("^user is on Booking page$")
		public void user_is_on_Booking_page() throws Throwable 
		{
			System.out.println("User is on booking page");
		    
		}

		@Then("^User should be able to see the text \"([^\"]*)\"$")
		public void user_should_be_able_to_see_the_text(String Header) throws Throwable 
		
		{
			
		  
			String text=book.HeaderText();
		   Assert.assertEquals(Header, text);
		  
		}
	
		@Then("^User should be able to see Flight number '(\\d+)'$")
		public void user_should_be_able_to_see_Flight_number(int FlightNum) throws Throwable 
		
		{
			
		               Assert.assertTrue(book.FlightNumber());
		}

		@Then("^User should be able to see Airline \"([^\"]*)\"$")
		public void user_should_be_able_to_see_Airline(String arg1) throws Throwable 
		
		{
			
			Assert.assertTrue(book.FlightName());
		   
		    
		}

		@Then("^User should be able to see Depart Time '(\\d+):(\\d+) AM'$")
		public void user_should_be_able_to_see_Depart_Time_AM(int arg1, int arg2) throws Throwable 
		
		{
			
			Assert.assertTrue(book.DepartureTime());
		   
		}

		@Then("^User should be able to see Arrive Time '(\\d+):(\\d+) PM'$")
		public void user_should_be_able_to_see_Arrive_Time_PM(int arg1, int arg2) throws Throwable {
			
		    
			Assert.assertTrue(book.ArrivalTime());
		
		}

		@Then("^user should be able to see Price '\\$(\\d+)\\.(\\d+)'$")
		public void user_should_be_able_to_see_Price_$(int arg1, int arg2) throws Throwable 
		{
			
		
			Assert.assertTrue(book.price());
		   
		}


		@Then("^User should be able to click on Choose This Flight Button$")
		public void user_should_be_able_to_click_on_Choose_This_Flight_Button() throws Throwable 
		{
			Thread.sleep(2000);
		  book.chooseflightbutton();
		  
		}
		



}
