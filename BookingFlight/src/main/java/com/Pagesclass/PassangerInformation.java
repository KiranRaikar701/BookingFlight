package com.Pagesclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PassangerInformation 
{
	WebDriver driver;
	
	
	private By FirstName=By.xpath("//input[@placeholder='First name']");
	private By LastName=By.xpath("//input[@placeholder='Last name']");
	private By Email=By.xpath("//input[@name='passengerEmail']");
	
	
	private By DayDrop=By.xpath("//div[div[label[contains(text(),'date of birth ')]]]/div[2]/app-almatar-datepicker/div/div[1]/ng-select");
	private By MonthDrop=By.xpath("//div[div[label[contains(text(),'date of birth ')]]]/div[2]/app-almatar-datepicker/div/div[2]/ng-select");
	private By YearDrop=By.xpath("//div[div[label[contains(text(),'date of birth ')]]]/div[2]/app-almatar-datepicker/div/div[3]/ng-select");
	private By DropNationality=By.xpath("//div[div[label[contains(text(),'Nationality')]]]/div[2]");
	private By DropList=By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']");
	private By IssueingCountry=By.xpath("//div[div[label[contains(text(),' Issuing country ')]]]/div[2]");
	private By IssueingDrop=By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']");
	private By PassportNum=By.xpath("//input[@placeholder='Passport number']");
	private By PassDay=By.xpath("//div[div[label[contains(text(),'Passport issuing date')]]]/div[2]/app-almatar-datepicker/div[1]/div");
	private By PassMonth=By.xpath("//div[div[label[contains(text(),'Passport issuing date')]]]/div[2]/app-almatar-datepicker/div/div[2]/ng-select");
	private By PassYear=By.xpath("//div[div[label[contains(text(),'Passport issuing date')]]]/div[2]/app-almatar-datepicker/div/div[3]/ng-select");
	private By PasExListDay=By.xpath("//div[div[label[contains(text(),'Passport expiry date')]]]/div[2]/app-almatar-datepicker/div[1]/div[1]");
	private By PassExListMonth=By.xpath("//div[div[label[contains(text(),'Passport expiry date')]]]/div[2]/app-almatar-datepicker/div[1]/div[2]");
	private By PassExListYear=By.xpath("//div[div[label[contains(text(),'Passport expiry date')]]]/div[2]/app-almatar-datepicker/div[1]/div[3]");
	private By PhoneNumber=By.xpath("//input[@placeholder='Phone Number *']");
	
	/* List of elements in Nationality and Issuing Country and Date Of birth */
	
	private By DateOfBirthDay=By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']/div[2]");
	private By DateOfBirthMonth=By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']/div[2]");
	private By DateOfBirthYear=By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']/div[2]");
	private By NationalityList=By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']/div[2]");
	private By IssuingCountryList=By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']/div[2]");
	private By PassIsListDay=By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']/div[2]");
	private By PassIsListMon=By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']/div[2]");
	private By PassIsListYear=By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']/div[2]");
	private By ExpListDay=By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']/div[2]");
	private By ExpListMonth=By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']/div[2]");
	private By ExpListYear=By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']/div[2]");
	private By ProceedPaymentButton=By.xpath("//button[contains(text(),' Proceed to Payment ')]");
	
	public PassangerInformation(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	
	public void FirstName(String Argue1)
	
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,600)");
		driver.findElement(FirstName).sendKeys(Argue1);
		
		
	}
	
	public void LastName(String Argue2)
	{
	driver.findElement(LastName).sendKeys(Argue2);
	}
	public void Email() throws InterruptedException
	{
		driver.findElement(Email).sendKeys("Test@gmail.com");
		Thread.sleep(5000);
    }
	
	public void Day() throws InterruptedException
	
	{
	
		driver.findElement(DayDrop).click();
		Thread.sleep(4000);
		List<WebElement>Op=driver.findElements(DateOfBirthDay);
		for(WebElement ele:Op)
		{
			String ele1=ele.getText();
			System.out.println(ele1);
			Thread.sleep(5000);
			if(ele1.equalsIgnoreCase("13"));
			ele.click();
			break;
		}
	}
		
		
		
		
	
	
	public void Month() throws InterruptedException
	
	{
		driver.findElement(MonthDrop).click();
		Thread.sleep(4000);
		List<WebElement>Op=driver.findElements(DateOfBirthMonth);
		for(WebElement ele:Op)
		{
			String ele1=ele.getText();
			System.out.println(ele1);
			Thread.sleep(5000);
			if(ele1.equalsIgnoreCase("August"));
			ele.click();
			break;
	}
		
	}
		public void year() throws InterruptedException
		
		{
			
			driver.findElement(YearDrop).click();
			Thread.sleep(4000);
			List<WebElement>Op=driver.findElements(DateOfBirthYear);
			for(WebElement ele:Op)
			{
				String ele1=ele.getText();
				System.out.println(ele1);
				Thread.sleep(5000);
				if(ele1.equalsIgnoreCase("2005"));
				ele.click();
				break;
		}
}
		
		public void Nationality() throws InterruptedException
		
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			 js.executeScript("window.scrollBy(0,300)");
			driver.findElement(DropNationality).click();
			Thread.sleep(10000);
			List<WebElement>op=driver.findElements(NationalityList);
			for(WebElement ele:op)
				
			{
				String ele1=ele.getText();
				if(ele1.equalsIgnoreCase("Indian"));
				ele.click();
				break;
			}
		}
		
		public void IssueCountry() throws InterruptedException
		{
			driver.findElement(PassMonth).click();
			Thread.sleep(2000);
			List<WebElement>op=driver.findElements(PassIsListMon);
			for(WebElement ele:op)
				
			{
				String ele1=ele.getText();
				if(ele1.equalsIgnoreCase("June"));
				Thread.sleep(2000);
				ele.click();
				break;
			}
			
			driver.findElement(PassDay).click();
			List<WebElement>op1=driver.findElements(PassIsListDay);
			for(WebElement ele:op1)
				
			{
				String ele1=ele.getText();
				if(ele1.equalsIgnoreCase("20"));
				Thread.sleep(2000);
				ele.click();
				break;
			}
			
			driver.findElement(PassYear).click();
			List<WebElement>op2=driver.findElements(PassIsListYear);
			for(WebElement ele2:op2)
				
			{
				String ele1=ele2.getText();
				if(ele1.equalsIgnoreCase("2011"));
				Thread.sleep(2000);
				ele2.click();
				break;
			}
			
			
			
			
			
		}
		
		
		public void PassportNumber1()
		{
			driver.findElement(PassportNum).sendKeys("00000");
		}


		public void ExpirePassport() throws InterruptedException
		
		{
			
			driver.findElement(PasExListDay).click();
			Thread.sleep(2000);
			List<WebElement>op=driver.findElements(ExpListDay);
			for(WebElement ele:op)
				
			{
				String ele1=ele.getText();
				if(ele1.equalsIgnoreCase("12"));
				Thread.sleep(2000);
				ele.click();
				break;
			}
			
			driver.findElement(PassExListMonth).click();
			List<WebElement>op1=driver.findElements(ExpListMonth);
			for(WebElement ele:op1)
				
			{
				String ele1=ele.getText();
				if(ele1.equalsIgnoreCase("July"));
				Thread.sleep(2000);
				ele.click();
				break;
			}
			
			driver.findElement(PassExListYear).click();
			List<WebElement>op2=driver.findElements(ExpListYear);
			for(WebElement ele2:op2)
				
			{
				String ele1=ele2.getText();
				if(ele1.equalsIgnoreCase("2011"));
				Thread.sleep(2000);
				ele2.click();
				break;
			}
			
		
			
			
			
			
			
			
		}
		
		
		public void PhoneNumber(String arg)
		
		{
			driver.findElement(PhoneNumber).sendKeys(arg);
		}
		
		public void ProceedPayment()
		{
			driver.findElement(ProceedPaymentButton).click();
		}
		
		
		
}
