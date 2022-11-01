package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.Bass.Bass_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feauture\\AdactinRoomBook.feature", 
glue = "com.adactin.stepdefinition")
public class Adactin_Runner_Class {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		driver = Bass_Class.getBrowser("chrome");

	}

	@AfterClass
	public static void tearDown() {
		driver.close();

	}

}


