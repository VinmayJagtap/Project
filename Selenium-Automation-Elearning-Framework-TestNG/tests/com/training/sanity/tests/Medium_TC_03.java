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

public class Medium_TC_03 {
	
	public class TC01ATEST {
		private WebDriver driver;
		private String baseUrl;
		private com.training.pom.Medium_TC_03POM Medium_TC_03POM;
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
			Medium_TC_03POM = new com.training.pom.Medium_TC_03POM(driver); 
			baseUrl = properties.getProperty("baseURL");
			screenShot = new ScreenShot(driver); 
			// open the browser 
			driver.get(baseUrl);
		}

		
		  @AfterMethod public void tearDown() throws Exception { 
			  Thread.sleep(1000);
		  //driver.quit();
		  }
		 
		@Test
		public void TestCase01() throws InterruptedException  {
			Medium_TC_03POM.ClickSignin();
			Medium_TC_03POM.EnterUsername("admin");
			Medium_TC_03POM.EnterPassword("adminuser@12345");
			Medium_TC_03POM.ClickLogin();
			Medium_TC_03POM.HoverPosts();
			Medium_TC_03POM.ValidateAllPosts();
			Medium_TC_03POM.ValidateAddPost();
			Medium_TC_03POM.ValidateCategories();
			Medium_TC_03POM.ValidateTags();
			Medium_TC_03POM.ClickCategories();
			Medium_TC_03POM.ValidateAddNewCategories();
			Medium_TC_03POM.EnterName("abcd");
			Medium_TC_03POM.EnterSlug("abcd");
			Medium_TC_03POM.Enterdescription("abcd");
			Medium_TC_03POM.ClickAddNewCategories();
			driver.navigate().refresh();
			Medium_TC_03POM.Validateuser();
			Medium_TC_03POM.HoverPosts1();
			Medium_TC_03POM.ClickAllPosts();
			Medium_TC_03POM.ClickAddNew();
			Medium_TC_03POM.randomClick();
			Medium_TC_03POM.EnterTitle("any");
			Medium_TC_03POM.EnterContent("any");
			Medium_TC_03POM.SelectCheckBox();
			Medium_TC_03POM.ClickPublish();
			Medium_TC_03POM.ValidatePostpublished();
	}
}

}
