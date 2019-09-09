package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.TC02POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC02TEST extends TC01ATEST {
	private WebDriver driver;
	private String baseUrl;
	private TC02POM TC02POM;
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
		TC02POM = new TC02POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	
	  @AfterMethod public void tearDown() throws Exception { 
		  Thread.sleep(1000);
	  driver.quit(); 
	  }
	 
	@Test
	public void TestCase02() {
		TC02POM.NewLaunchhover();
		screenShot.captureScreenShot();
		TC02POM.prestigeclick();
		screenShot.captureScreenShot();
		TC02POM.prestigeoverview();
		screenShot.captureScreenShot();
		TC02POM.EnterSalesPrice("400000");
		TC02POM.entereDownPayment("20000");
		TC02POM.enteryear("20");
		TC02POM.enterinterest("7.25");
		screenShot.captureScreenShot();
		TC02POM.Calculateclick();
		screenShot.captureScreenShot();
		TC02POM.viewconf();
		TC02POM.confirmationvalidation();
		TC02POM.confirmationtext();
		screenShot.captureScreenShot();
		
		
	}
}
