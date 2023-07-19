package com.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.helper.File_Reader_Manager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\mages\\eclipse-workspace\\Cucumber_GreenKart_Project\\src\\test\\java\\com\\feature\\greenkart.feature", glue = "com.stepdefinition", 
   plugin = {
		"pretty",
		"html:target/Cucumber.html",
		"json:target/Cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
       monochrome = true, 
       dryRun = false)
public class Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws IOException {
		String browser = File_Reader_Manager.getInstanceCr().getBrowser();
		driver = BaseClass.browser(browser);
	}

}
