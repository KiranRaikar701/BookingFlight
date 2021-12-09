package com.Pagesclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PassangerInformationandBooking

{
	private WebDriver driver;
	private By Airlinename=By.xpath("//p[contains(text(),'Airline: United')]");
	private By FlightNumber=By.xpath("//p[contains(text(),'Flight Number: UA954')]");
	private By price=By.xpath("//p[contains(text(),'Price: 400')]");
	private By ArbitaryPrice=By.xpath("//p[contains(text(),'Arbitrary Fees and Taxes: 514.76')]");
	private By FirstName=By.id("inputName");
	private By Address=By.id("address");
	private By City=By.id("city");
	private By State=By.id("state");
	private By Zipcode=By.id("zipCode");
	private By CardType=By.id("cardType");
	private By CardNum=By.id("creditCardMonth");
	private By CreditMonth=By.id("creditCardMonth");
	private By Credityear=By.id("creditCardYear");
	private By NameOnCard=By.id("nameOnCard");
	private By CheckBox=By.id("rememberMe");
	private By PurchaseButton=By.xpath("//input[@value='Purchase Flight']");
	private By ConfirmationText=By.xpath("//h1[contains(text(),'Thank you for your purchase today!')]");
	private By BookingID=By.xpath("//table/tbody/tr/td[2]");
	private By ChooseThisFlight=By.xpath("//tr[form[@name='VA43']]/td[3]/preceding-sibling::td[2]/input[@value='Choose This Flight']");
	private By DepartureCityDropdown=By.xpath("//select[@name='fromPort']");
	private By DestinationCityDropdown=By.xpath("//select[@name='toPort']");
	private By LoginButton=By.xpath("//input[@type='submit']");


			
	public PassangerInformationandBooking(WebDriver driver)
	
	{
		
		this.driver=driver;
		
		
	}
	
	public void cardText()
	{
		WebElement cardselect=driver.findElement(CardType);
		Select s=new Select(cardselect);
		List<WebElement>op=s.getOptions();
		int size=op.size();
		for(int i=0;i<size;i++)
		{
			String options=op.get(i).getText();
			System.out.println(options);
		}
	}
	
	public void chooseflight()
	{
		driver.findElement(ChooseThisFlight).click();
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
	
	public String gettitle()
	{
		return driver.getTitle();
	}
	
	public void LoginButton()
	
	{
		WebElement login=driver.findElement(LoginButton);
		login.click();
	}
	
	public void CardSelect()
	{
		WebElement cardselect=driver.findElement(CardType);
		Select s=new Select(cardselect);
		s.selectByVisibleText("American Express");
	}
	
	public String Airlinename()
	
	{
		return driver.findElement(Airlinename).getText();
		
	}
		public String FlightNumber()
		{
			return driver.findElement(FlightNumber).getText();
			
		}
		
		
		public String price()
		{
			return driver.findElement(price).getText();
			
		}
		
		public String ArbitaryPrice()
		{
			return driver.findElement(ArbitaryPrice).getText();
			
		}
		
		public void Firstname()
		{
			driver.findElement(FirstName).sendKeys("Kiran Raikar");
		}
		
		public void Address()
		{
			driver.findElement(Address).sendKeys("Bangalore");
		}
		
		public void City()
		{
			driver.findElement(City).sendKeys("Bangalore");
		}
		
		public void state()
		{
			driver.findElement(State).sendKeys("Karnataka");
		}
		
		public void zipcode()
		
		{
			driver.findElement(Zipcode).sendKeys("3232322");
		}
		
		public void CardNumber()
		{
			
			driver.findElement(CardNum).sendKeys("12333");
			
		}
		
		public void creditmonth()
		
		{
			driver.findElement(CreditMonth).sendKeys("02/01");
		}
		
		public void credityear()
		
		{
			driver.findElement(Credityear).sendKeys("2022");
		}
		
		public void NameOnCard()
		{
			driver.findElement(NameOnCard).sendKeys("KIRAN RAIKAR");
		}
		
		public void Checkbox()
		{
			driver.findElement(CheckBox).click();
		}
		public void purchasebutton()
		
		{
			driver.findElement(PurchaseButton).click();
			
		}
		
		public String ConfirmationText()
		{
			return driver.findElement(ConfirmationText).getText();
			
		}
		
		public  String BookingId()
		{
			return driver.findElement(BookingID).getText();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}






