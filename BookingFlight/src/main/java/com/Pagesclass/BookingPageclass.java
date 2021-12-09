package com.Pagesclass;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BookingPageclass

{
	private WebDriver driver;
	private By HeaderTextBooking =By.xpath("//h3[contains(text(),'Flights from Paris to London:')]");
	private By FlightNumber=By.xpath("//table[@class='table']/tbody/tr/td[contains(text(),'43')]");
	private By FlightName=By.xpath("//tr[form[@name='VA43']]/td[3]");
	private By DepartureTime=By.xpath("//td[contains(text(),'1:43 AM')]");
	private By ArrivalTime=By.xpath("//td[contains(text(),'9:45 PM')]");
	private By Price=By.xpath("//td[contains(text(),'$472.56')]");
	private By ChooseThisFlight=By.xpath("//tr[form[@name='VA43']]/td[3]/preceding-sibling::td[2]/input[@value='Choose This Flight']");
	private By DepartureCityDropdown=By.xpath("//select[@name='fromPort']");
	private By DestinationCityDropdown=By.xpath("//select[@name='toPort']");
	private By LoginButton=By.xpath("//input[@type='submit']");
	
	
	public BookingPageclass(WebDriver driver)
	
	{
		
		this.driver=driver;
		
		
	}

	public void selectdeparture()
	{
		
		WebElement dep=driver.findElement(DepartureCityDropdown);
		Select s=new Select(dep);
		s.selectByVisibleText("Paris");
		
		
	}
	
	public void selectdestination()
	{
		
		WebElement dest=driver.findElement(DestinationCityDropdown);
		Select s=new Select(dest);
		s.selectByVisibleText("London");
		
		
	}
	
	public void LoginButton()
	
	{
		WebElement login=driver.findElement(LoginButton);
		login.click();
	}
	
	
	public String HeaderText()
	
	{
		return driver.findElement(HeaderTextBooking).getText();
		
	}
	
	public boolean ChooseFlightButton()
	
	{
		return driver.findElement(ChooseThisFlight).isEnabled();
		
	}
	
	public boolean  FlightNumber()
	
	{
	
		return driver.findElement(FlightNumber).isDisplayed();
		
	}
	
	public boolean FlightName()
	
	{
		return driver.findElement(FlightName).isDisplayed();
		
	}
	
	public boolean DepartureTime() 
	{
		return driver.findElement(DepartureTime).isDisplayed();
		
	}
	
	public boolean ArrivalTime()
	{
		return driver.findElement(Price).isDisplayed();
		
	}
	
	public boolean price()
	{
		return driver.findElement(Price).isDisplayed();
		
	}
	
	public void chooseflightbutton()
	
	{
		driver.findElement(ChooseThisFlight).click();
	}
	
	public String title()
	{
		return driver.getTitle();		
	}
	
	
	
}
