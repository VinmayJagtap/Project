package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Medium_TC_01 {

	public class TC01ATEST {
		private WebDriver driver;
		private String baseUrl;
		private com.training.pom.Medium_TC_01POM Medium_TC_01POM;
		private Properties properties;
		private ScreenShot screenShot;

		@BeforeClass
		public void setUpBeforeClass() throws IOException {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
		}
		
		@BeforeMethod
		public void setUp() throws Exception {
			driver = DriverFactory.getDriver(DriverNames.CHROME);
			Medium_TC_01POM = new com.training.pom.Medium_TC_01POM(driver); 
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
		public void TestCase01() throws InterruptedException {
			Medium_TC_01POM.ClickSignin();
			Medium_TC_01POM.EnterUsername("vinmay");
			Medium_TC_01POM.EnterPassword("vinmay");
			Medium_TC_01POM.ClickLogin();
			Medium_TC_01POM.ClickPlots();
			Medium_TC_01POM.ValidatePlots();
			Medium_TC_01POM.SearchBoxEnter("Nullam");
			Medium_TC_01POM.ClickPlotResult();
			Thread.sleep(10000);
			Medium_TC_01POM.SwitchWindow1();
			Medium_TC_01POM.ValidateBlog();
			Medium_TC_01POM.ClickDropALine();
			Medium_TC_01POM.ValidateContcatForm();
			Medium_TC_01POM.EnterName("ABCD");
			Medium_TC_01POM.EnterEmailAddress("abcd@yopmail.com");
			Medium_TC_01POM.EnterSubject("any");
			Medium_TC_01POM.EnterMessage("Plots");
			Medium_TC_01POM.ClickSend();
			Medium_TC_01POM.ValidateConfirmation();
			
			
	}
}
}
