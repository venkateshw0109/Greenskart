package com.runner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.baseclass.BaseClass;
import com.helper.File_Reader_Manager;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\mages\\eclipse-workspace\\Cucumber_GreenKart_Project\\src\\test\\java\\com\\feature\\greenkart.feature", glue = "com.stepdefinition", plugin = {
		"pretty", "html:target/Cucumber.html", "json:target/Cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, monochrome = true, dryRun = false)
public class TestNgRunner extends AbstractTestNGCucumberTests {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws IOException {
		String browser = File_Reader_Manager.getInstanceCr().getBrowser();
		driver = BaseClass.browser(browser);
	}
}
