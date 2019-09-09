package com.training.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC01APOM {
private WebDriver driver; 

	
	public TC01APOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'New Launch')]")
	private WebElement NewLaunch; 

	public void NewLaunchhover(){
		Actions act = new Actions(driver);
		act.moveToElement(NewLaunch).build().perform();
		//this.NewLaunch.click();
	}
	@FindBy(xpath="//a[contains(text(),'prestige')]")
	private WebElement prestige; 

	public void prestigeclick(){
	this.prestige.click();
}
	@FindBy(xpath="//h3[@class='desc-headline']")
	private WebElement prestigeov; 

	public void prestigeoverview(){
	this.prestigeov.isDisplayed();
}
	@FindBy(xpath="//input[@name='your-name']")
	private WebElement namefield; 

	public void entername(String name){
	this.namefield.clear();
	this.namefield.sendKeys(name);
}
	@FindBy(xpath="//input[@name='your-email']")
	private WebElement emailfield; 

	public void enteremail(String email){
	this.emailfield.clear();
	this.emailfield.sendKeys(email);
}
	@FindBy(xpath="//input[@name='your-subject']")
	private WebElement aptfield; 

	public void enterapt(String apt){
	this.aptfield.clear();
	this.aptfield.sendKeys(apt);
}
	@FindBy(xpath="//textarea[@name='your-message']")
	private WebElement messagefield; 

	public void entermessage(String message){
	this.messagefield.clear();
	this.messagefield.sendKeys(message);
}
	
	@FindBy(xpath="//input[@class='wpcf7-form-control wpcf7-submit']")
	private WebElement SendButton; 

	public void SendButtonclick(){
	this.SendButton.click();
}
	
	
	@FindBy(xpath="//div[@class='wpcf7-response-output wpcf7-display-none wpcf7-mail-sent-ng']")
	
	
	private WebElement confirmation; 

	public void confirmationvalidation(){
	String actual = this.confirmation.getText();
	System.out.println(actual);
	String exp  = "There was an error trying to send your message. Please try again later.";
	Assert.assertEquals(actual, exp);
	this.confirmation.isDisplayed();
}
	public void viewconf(){
		//JavascriptExecutor js = (JavascriptExecutor) driver; 
	//js.executeScript("arguments[0].scrollIntoView();",confirmation );
		
	Actions act = new Actions(driver);
	act.sendKeys(Keys.PAGE_DOWN).build().perform();
	
}
}
