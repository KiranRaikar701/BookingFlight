package com.TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "/Users/91810/eclipse-workspace/BookingFlight/src/test/resource/com/features", //the path of the feature files
			glue={"com.stepdefination","Hooks"}, //the path of the step definition files
			monochrome = true, //display the console output in a proper readable format
			strict = false, //it will check if any step is not defined in step definition file
			dryRun = false
			//to check the mapping is proper between feature file and step def file
			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}	
					/*plugin = {"pretty",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							"timeline:test-output-thread/"

							
					}*/
			)
	 

	 
		public class RunnerClass {
		
		}
	