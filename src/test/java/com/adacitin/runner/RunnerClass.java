package com.adacitin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.adacitin.baseclass.AdacitinBaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
import iptdec22.org.BaseClass;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\KEERTHI\\eclipse-workspace\\AdacitinCucumber\\src\\test\\java\\com\\adacitin\\feature\\Adacitin.feature",
glue="com.adacitin.stepdefinition",monochrome=true,dryRun = false,strict = true,
plugin = {"html:Reports/Html_Report","pretty",
		"json:Reports/Json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"
})


public class RunnerClass  extends AdacitinBaseClass{
	public static WebDriver driver;


public static void main(String[] args) {
	

    	browserLaunch("chrome");
    	getUrl("https://adactinhotelapp.com/");
     	
    	
	
}	
    	
    	
}

