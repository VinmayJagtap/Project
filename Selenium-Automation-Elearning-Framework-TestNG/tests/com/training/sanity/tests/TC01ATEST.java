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
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC01ATEST {
	private WebDriver driver;
	private String baseUrl;
	private com.training.pom.TC01APOM TC01APOM;
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
		TC01APOM = new com.training.pom.TC01APOM(driver); 
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
	public void TestCase01() {
		TC01APOM.NewLaunchhover();
		screenShot.captureScreenShot();
		TC01APOM.prestigeclick();
		screenShot.captureScreenShot();
		TC01APOM.prestigeoverview();
		TC01APOM.entername("Manzoor");
		TC01APOM.enteremail("manzoor@yopmail.com");
		TC01APOM.enterapt("apartment");
		TC01APOM.entermessage("looking for an apartments");
		screenShot.captureScreenShot();
		TC01APOM.SendButtonclick();
		screenShot.captureScreenShot();
		TC01APOM.confirmationvalidation();
		TC01APOM.viewconf();
		screenShot.captureScreenShot();
}
}