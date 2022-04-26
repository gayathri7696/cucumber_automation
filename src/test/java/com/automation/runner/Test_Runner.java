package com.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.Base_class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Gayathri\\eclipse-workspace\\Cucumber_Automation\\src\\test\\java\\com\\automation\\feature\\Automation.feature",
		glue = "com.stepdef",
		monochrome = true,
		publish = true,
		
		
		plugin = {
				
				"html:Cucumber_Report/Report.html",
				"json:Cucumber_Report/Report1.json",
				"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				
		}
		
		
		
		
		)
public class Test_Runner {
	public static WebDriver driver;
	@BeforeClass
	public static void set_Up() {
		 driver=Base_class.browser_configuration("chrome");
	}
	@AfterClass
	public static void tear_Down() {
		
		driver.quit();
	}
	


}
