package com.stepdefination;

import com.Factory.driver.DriverFactory;
import com.Pagesclass.BookingPageclass;
import com.Pagesclass.PassangerInformationandBooking;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class PersonnelInfoPageandConfirmation 


{
	

	private  PassangerInformationandBooking book=new  PassangerInformationandBooking(DriverFactory.getDriver());
	





@Then("^Airline name should be \"([^\"]*)\"$")
public void airline_name_should_be(String arg1) throws Throwable 

{
	book.Airlinename();
   
}

@Then("^Flight Number should be \"([^\"]*)\"$")
public void flight_Number_should_be(String arg1) throws Throwable 
{
	book.FlightNumber();
    
}

@When("^User selects paris as a Departure$")
public void user_selects_paris_as_a_Departure() throws Throwable 
{
	DriverFactory.getDriver().get("https://blazedemo.com/");
	book.selectdeparture();
   
}

@Then("^User Select london as a arrival place$")
public void user_Select_london_as_a_arrival_place() throws Throwable 
{
    book.selectdestination();
}

@Then("^User click on login button to book the flight$")
public void user_click_on_login_button_to_book_the_flight() throws Throwable
{
	book.LoginButton();
  }

@Then("^User click on chooseflight button to continue$")
public void user_click_on_chooseflight_button_to_continue() throws Throwable

{
	book.chooseflight();
 
}


@Then("^Price should be \"([^\"]*)\"$")
public void price_should_be(String price) throws Throwable 

{
	String pricetext=book.price();
	Assert.assertEquals(price, pricetext);
    
}

@Then("^Arbitrary Fees and Taxes should be \"([^\"]*)\"$")
public void arbitrary_Fees_and_Taxes_should_be(String Arbitary) throws Throwable {
   
	String Arbitaryprice=book.ArbitaryPrice();
	Assert.assertEquals(Arbitary, Arbitaryprice);
}

@Given("^Customer is on customer information page$")
public void customer_is_on_customer_information_page() throws Throwable 
{
	
	String titleword=book.gettitle();
	System.out.println(titleword);
    
	
}

@Then("^Customer enters Firstname$")
public void customer_enters_Firstname() throws Throwable {
	book.Firstname();
}

@Then("^Customer enters Address$")
public void customer_enters_Address() throws Throwable {
   
	book.Address();
}

@Then("^Customer enters City$")
public void customer_enters_City() throws Throwable {
    
	book.City();
}

@Then("^Customer enters State$")
public void customer_enters_State() throws Throwable {
    book.state();
}

@Then("^Customer enters Zipcode$")
public void customer_enters_Zipcode() throws Throwable {
    book.zipcode();
}

@When("^user selects card type$")
public void user_selects_card_type() throws Throwable {
    book.cardText();
	book.CardSelect();
}

@When("^User selects Card Number$")
public void user_selects_Card_Number() throws Throwable 

{
	
	book.CardNumber();
    
}

@When("^User select month$")
public void user_select_month() throws Throwable 
{
   book.creditmonth();
}

@Then("^user select year$")
public void user_select_year() throws Throwable {
    book.credityear();
}

@Then("^user select Name on Card$")
public void user_select_Name_on_Card() throws Throwable {
    book.NameOnCard();
}

@Then("^User click on Purchase Flight$")
public void user_click_on_Purchase_Flight() throws Throwable 

{
   book.purchasebutton();
}

@Then("^user should be able to see text \"([^\"]*)\"$")
public void user_should_be_able_to_see_text(String textconfirm) throws Throwable 
{
  String confirm=book.ConfirmationText();
  System.out.println(confirm);
  
 Assert.assertEquals(textconfirm, confirm);
}

@Then("^User click on Choose this flight$")
public void user_click_on_Choose_this_flight() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    book.purchasebutton();
}

@Then("^user should be able to see customer id$")
public void user_should_be_able_to_see_customer_id() throws Throwable {
   book.BookingId();
}



}
