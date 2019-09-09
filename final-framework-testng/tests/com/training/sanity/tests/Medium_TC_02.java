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
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Medium_TC_02 {
	public class TC01ATEST {
		private WebDriver driver;
		private String baseUrl;
		private com.training.pom.Medium_TC_02POM Medium_TC_02POM;
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
			Medium_TC_02POM = new com.training.pom.Medium_TC_02POM(driver); 
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
				Medium_TC_02POM.ClickSignin();
				Medium_TC_02POM.EnterUsername("vinmay");
				Medium_TC_02POM.EnterPassword("vinmay");
				Medium_TC_02POM.ClickLogin();
				Medium_TC_02POM.ClickBlog();
				Medium_TC_02POM.ValidateBlogs();
				Medium_TC_02POM.SearchBoxEnter("Nullam");
				Medium_TC_02POM.ClickPlotResult();
				Thread.sleep(10000);
				Medium_TC_02POM.SwitchWindow1();
				Medium_TC_02POM.ValidateBlog();
				Medium_TC_02POM.ClickDropALine();
				Medium_TC_02POM.ValidateContcatForm();
				Medium_TC_02POM.EnterName("ABCD");
				Medium_TC_02POM.EnterEmailAddress("abcd@yopmail.com");
				Medium_TC_02POM.EnterSubject("any");
				Medium_TC_02POM.EnterMessage("Plots");
				Medium_TC_02POM.ClickSend();
				Medium_TC_02POM.ValidateConfirmation();
				
				
		}
}
}