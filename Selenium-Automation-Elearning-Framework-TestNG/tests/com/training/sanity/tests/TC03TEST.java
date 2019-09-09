package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC03TEST extends TC02TEST  {
	private WebDriver driver;
	private String baseUrl;
	private com.training.pom.TC03POM TC03POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		TC03POM = new com.training.pom.TC03POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	
	  @AfterMethod public void tearDown() throws Exception { 
		  Thread.sleep(1000);
	  driver.quit(); }
	 
	@Test
	public void TestCase03() throws InterruptedException {
		
		TC03POM.NewLaunchClick();
		TC03POM.enteraddress("Electronic City");
		screenShot.captureScreenShot();
		Thread.sleep(3000);
		//TC03POM.selectpropertytype();
		TC03POM.ClickPropertytype();
		TC03POM.validateapt();
		TC03POM.validatevilla();		
		TC03POM.validatePlots();
		TC03POM.selectpropertytype();
		TC03POM.validateCommercial();
		screenShot.captureScreenShot();
		//TC03POM.SelectPlotsfromlist();
		screenShot.captureScreenShot();
		TC03POM.Clickregiondropdown();
		TC03POM.validateCentralBangalore();
		TC03POM.validateEastBangalore();
		//TC03POM.Selectarea("Central Bangalore");
		screenShot.captureScreenShot();
		TC03POM.SelectCB();
		screenShot.captureScreenShot();
		TC03POM.clickSearch();
		
		Thread.sleep(3000);
		TC03POM.Validatesearchresult1();
		screenShot.captureScreenShot();
		
		
	}
	
	
	}

