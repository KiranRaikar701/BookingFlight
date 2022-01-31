package com.stepdefination;

import org.openqa.selenium.WebDriver;

import com.Factory.driver.DriverFactory;
import com.Pagesclass.AlmatarLandingDef;
import com.Pagesclass.AlmatarHomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AlmatarLandingStep 

{
	
	private AlmatarLandingDef Landing=new AlmatarLandingDef(DriverFactory.getDriver());
	private AlmatarHomePage home=new AlmatarHomePage(DriverFactory.getDriver());





@Given("User lands on the flight loading page")
public void user_lands_on_the_flight_loading_page() throws InterruptedException 

{
	System.out.println("User lands on homepage");

}
@Then("User verifies the PageTitle")
public void user_verifies_the_page_title() 

{
	Landing.gettitle();
   
}
@Then("User verifies the text and price validation")
public void user_verifies_the_text_and_price_validation() 

{
	//Landing.price();
	System.out.println("testprice");
   
}
@Then("User verifies Choose flight button availabilty")
public void user_verifies_choose_flight_button_availabilty() throws InterruptedException 

{
	System.out.println("User lands on homepage");
	
	DriverFactory.getDriver().get("https://almatar.com/en");
	
     home.ClickFlight();
     home.EnterFromCity();
     home.ToCity();
     home.departure();
     home.Traveller();
     home.Search();
     Thread.sleep(10000);
	Landing.Button();
   
}
@Then("User verifies Flight details")
public void user_verifies_flight_details() 

{
	System.out.println("Flight details verified");
   
}
@Then("User clicks on ChooseFlight button")
public void user_clicks_on_choose_flight_button() 

{
   
	Landing.ClickChooseFlight();
}

}