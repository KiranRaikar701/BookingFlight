package Hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Factory.driver.DriverFactory;
import com.Utility.ConfigReader;

import io.cucumber.java.Before;



public class ApplicationHook 

{
	
	private DriverFactory driverfactory;
	private WebDriver driver;
	private ConfigReader config;
	Properties propert;
	
	@Before(order=0)
	
	public void GetProperty()
	
	{
		config=new ConfigReader();
		propert=config.init_prop();
	}
	
	
	@Before(order=1)
	
	
	public void LaunchBrowser()
	
	{
		
		String browsername=propert.getProperty("browser");
		driverfactory=new  DriverFactory();
		driver=driverfactory.init_driver(browsername);
		
	}
	

	
	}

