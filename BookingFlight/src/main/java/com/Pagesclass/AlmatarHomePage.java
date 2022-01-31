package com.Pagesclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AlmatarHomePage 

{
	
	
	private WebDriver driver;
	//Object Repository
	private By HeaderText=By.xpath("//h1[contains(text(),'Welcome to the Simple Travel Agency!')]");
	private By HeaderTextPage=By.xpath("//h2[contains(text(),'Your new travel mate')]");
	private By Flights=By.xpath("//a[@id='flights']");
	private By SearchIcon=By.xpath("//i[@class='icon-search']");
	private By ErrorMessage=By.xpath("//span[contains(text(),'please search and select from drop down')]");
	private By SelectionCity=By.xpath("//span[contains(text(),'Heathrow (LHR)')]");
	private By FromCity=By.xpath("//input[@placeholder='Origin']");
	private By ErrorFrom1=By.xpath("//div[input[@placeholder='Origin']]/div/span[contains(text(),'please search and select from drop down')]");
	private By ErrorFrom2=By.xpath("//div[input[@placeholder='Origin']]/div/span[contains(text(),'please select different location')]");
	private By ErrorDestin1=By.xpath("//div[input[@placeholder='Destination']]/div/span[contains(text(),'please search and select from drop down')]");
	private By ErrorDestin2=By.xpath("//div[input[@placeholder='Destination']]/div/span[contains(text(),'please select different location')]");
	private By SeacrhClick=By.xpath("//button[@type='submit']");
	private By ToCity=By.xpath("//input[@placeholder='Destination']");
	private By ToCityName=By.xpath("//span[contains(text(),'Delhi Indira Gandhi Intl (DEL)')]");
	private By Departure=By.xpath("//input[@placeholder='departure']");
	private By Travellers=By.xpath("//span[contains(text(),'travellers')]");
	private By Apply=By.xpath("//button[contains(text(),'Apply')]");
	private By DataPicker=By.xpath("//table[thead[tr[th[div[contains(text(),'february')]]]]]/tbody/tr[2]/td[5]");
	public AlmatarHomePage(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	public String gethomepagetitile()
	
	{
		return driver.getTitle();
		
	}
	
	public String GetheaderText()
	{
		return driver.findElement(HeaderTextPage).getText();
		
	}
	
	public void ClickFlight()
	{
		driver.findElement(Flights).click();
		
	}
	
	public String ValidatationErrorFrom1()
	{
		return driver.findElement(ErrorFrom1).getText();
		
		
	}
	
	public String ValidatationErrorFrom2()
	{
		return driver.findElement(ErrorFrom2).getText();
		
	}
	
	public String ValidateErrorTo1()
	{
		return driver.findElement(ErrorDestin1).getText();
		
		
	}
	
	public String ValidateErrorTo2()
	{
		return driver.findElement(ErrorDestin2).getText();
		
	}
	
	
	public void Search()
	{
		driver.findElement(SeacrhClick).click();
	}
	
	public void EnterFromCity() throws InterruptedException
	
	{
		driver.findElement(FromCity).sendKeys("London");
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(SelectionCity);
		Thread.sleep(5000);
		Actions action=new Actions(driver);
		action.moveToElement(ele1).click().perform();
		
		
		
		
	}
	

	public void ToCity() throws InterruptedException
	{
		driver.findElement(ToCity).sendKeys("Delhi");
		
		Thread.sleep(2000);
		WebElement ele2=driver.findElement(ToCityName);
		Thread.sleep(5000);
		Actions action=new Actions(driver);
		action.moveToElement(ele2).click().perform();
		
	
	}
	
	public void departure() throws InterruptedException
	
	{
		driver.findElement(Departure).click();
		Thread.sleep(5000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,200)");
		List<WebElement>datePicker=driver.findElements(DataPicker);
		for(WebElement ele:datePicker)
		{
			String ele1=ele.getText();
			System.out.println(ele1);
			if(ele1.equalsIgnoreCase("10"));
			ele.click();
			break;
		}
	}
	
	public void Traveller() throws InterruptedException
	{
		driver.findElement(Travellers).click();
		Thread.sleep(5000);
	
		 driver.findElement(Apply).click();
		 
	}
	
	
	
}
