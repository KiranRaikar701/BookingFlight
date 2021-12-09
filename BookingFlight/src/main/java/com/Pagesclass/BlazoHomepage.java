package com.Pagesclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BlazoHomepage 

{
	
	
	private WebDriver driver;
	//Object Repository
	private By HeaderText=By.xpath("//h1[contains(text(),'Welcome to the Simple Travel Agency!')]");
	private By DepartureCityText=By.xpath("h2[contains(text(),'Choose your departure city:')]");
	private By DestinationCity=By.xpath("//h2[contains(text(),'Choose your destination city:')]");
	private By DepartureCityDropdown=By.xpath("//select[@name='fromPort']");
	private By DestinationCityDropdown=By.xpath("//select[@name='toPort']");
	private By LoginButton=By.xpath("//input[@type='submit']");
	
	public BlazoHomepage(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	public String gethomepagetitile()
	
	{
		return driver.getTitle();
		
	}
	
	public boolean GetheaderText()
	{
		return driver.findElement(HeaderText).isDisplayed();
		
	}
	
	public boolean Getdeparturetext()
	{
		return driver.findElement(DepartureCityText).isDisplayed();
		
	}
	
	public boolean Getdestinationtext()
	{
		return driver.findElement(DestinationCity).isDisplayed();
		
	}
	
	public void Departuredrop()
	
	{
		WebElement ele=driver.findElement(DepartureCityDropdown);
		Select s=new Select(ele);
		List<WebElement>op=s.getOptions();
		int size=op.size();
		for(int i=0;i<size;i++)
		{
			String options=op.get(i).getText();
			System.out.println(options);
		}
		
		
		
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
	
	public void userclickDeparture()
	{
		driver.findElement(DepartureCityDropdown);
	}
	
	public void userclickDestination()
	{
		driver.findElement(DestinationCityDropdown);
	}

	public void LoginText()
	{
		
	}
}
