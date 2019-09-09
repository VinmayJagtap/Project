package com.training.pom;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC02POM {
private WebDriver driver; 

	
	public TC02POM(WebDriver driver) {
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
	@FindBy(id="amount")
	private WebElement SalesPrice; 

	public void EnterSalesPrice(String Amount1){
	this.SalesPrice.clear();
	this.SalesPrice.sendKeys(Amount1);
}
	@FindBy(xpath="//input[@id='downpayment']")
	private WebElement DownPayment; 

	public void entereDownPayment(String Amount2){
	this.DownPayment.clear();
	this.DownPayment.sendKeys(Amount2);
}
	@FindBy(xpath="//input[@id='years']")
	private WebElement Term; 

	public void enteryear(String yearcount){
	this.Term.clear();
	this.Term.sendKeys(yearcount);
}
	@FindBy(xpath="//input[@id='interest']")
	private WebElement interest; 

	public void enterinterest(String rate){
	this.interest.clear();
	this.interest.sendKeys(rate);
}
	
	@FindBy(xpath="//button[@class='button calc-button']")
	private WebElement Calculate; 

	public void Calculateclick(){
	this.Calculate.click();
}
	
	
	@FindBy(xpath="//div[@class='notification success']")
	private WebElement confirmation; 

	public void confirmationvalidation(){
	this.confirmation.isDisplayed();
}
	public void viewconf(){
		//JavascriptExecutor js = (JavascriptExecutor) driver; 
	//js.executeScript("arguments[0].scrollIntoView();",confirmation );
		
	Actions act = new Actions(driver);
	act.sendKeys(Keys.PAGE_DOWN).build().perform();
	
}
	@FindBy(xpath="//*[contains(text(),'Monthly Payment:')]")
	private WebElement conftext;
	
	public void confirmationtext() {
		this.conftext.isDisplayed();
		String actual= this.conftext.getText();
		System.out.println(actual);
		String exp = "Monthly Payment:";
		assertTrue(actual.contains(exp),"Text is not correct");
		//assertEquals(actual,exp );
	}
}
