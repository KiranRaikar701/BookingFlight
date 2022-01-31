package com.Pagesclass;

import org.junit.Assert;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//Object Repository



public class AlmatarLandingDef 

{
	private WebDriver driver;
	private By ChooseFlight=By.xpath("//div[@class='col-lg-9 col-sm-12 search-results-container']/app-flight-card/div[1]/div[1]/div/div/div[2]/div/a");
	private By Price=By.xpath("//h4[span[contains(text(),'1737')]]");
	
	
	
	
	public AlmatarLandingDef(WebDriver driver)
	
	{
		
		this.driver=driver;
		
		
	}

	public String gettitle()
	{
		return driver.getTitle();
		
	}
	
	public Boolean price()
	
	{
		return driver.findElement(Price).isDisplayed();
		
	}
	
	public Boolean Button()
	{
		return driver.findElement(ChooseFlight).isDisplayed();
		
	}
	
	public void ClickChooseFlight()
	{
		driver.findElement(ChooseFlight).click();
	}
	
	
	
	
	
	
}
