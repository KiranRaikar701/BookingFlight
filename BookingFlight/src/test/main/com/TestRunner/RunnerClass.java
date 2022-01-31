package com.TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;





	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "./src/test/resource/com/features", //the path of the feature files
			glue={"com.stepdefination","Hooks"}, //the path of the step definition files
			monochrome = true, //display the console output in a proper readable format
			 //it will check if any step is not defined in step definition file
			dryRun =false,
		   publish = true
			//to check the mapping is proper between feature file and step def file
			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}	
					/*plugin = {"pretty",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							"timeline:test-output-thread/"

							
					}*/
			)
	 

	 
		public class RunnerClass {
		
		}
	