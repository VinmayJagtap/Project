package com.training.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TC03POM {
private WebDriver driver; 

	
	public TC03POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'New Launch')]")
	private WebElement NewLaunch; 

	public void NewLaunchClick(){
		
		this.NewLaunch.click();
	}
	@FindBy(xpath="//input[@id='keyword_search']")
	private WebElement Address;
	
	public void enteraddress(String add) throws InterruptedException {
		Actions act = new Actions(driver);
		this.Address.sendKeys(add);
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
	}
	
	@FindBy(xpath="//div[@id='_property_type_chosen']//a[@class='chosen-single chosen-default']")
	private WebElement propertytype;
	
	
	public void ClickPropertytype() {
		this.propertytype.click();
	}
	
	
	@FindBy(xpath="//Select[@name='_property_type']")
	private WebElement list;
	
	public void selectpropertytype() throws InterruptedException {
	        Actions act = new Actions(driver);
	        //act.moveToElement(list).click().build().perform();
	        act.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
	        Thread.sleep(3000);
	        act.sendKeys(Keys.ENTER).build().perform();

		
		Select dropdown = new Select(list);
		dropdown.selectByIndex(3);
	}
	
	
	
	@FindBy(xpath="//li[contains(text(),'Plots')]")
	private WebElement SelectPlots;
	
	public void SelectPlotsfromlist() {
		this.SelectPlots.click();
	}
	
	@FindBy(xpath="//li[contains(text(),'Property type')]/following-sibling::li[contains(text(),'Apartments')]")
	private WebElement apartment;
	
	public void validateapt() {
		this.apartment.isDisplayed();
	}
	
	@FindBy(xpath="//li[contains(text(),'Property type')]/following-sibling::li[contains(text(),'Villas')]")
	private WebElement Villas;
	
	public void validatevilla() {
		this.Villas.isDisplayed();
	}
	@FindBy(xpath="//li[contains(text(),'Property type')]/following-sibling::li[contains(text(),'Plots')]")
	private WebElement Plots;
	
	public void validatePlots() {
		this.Plots.isDisplayed();
	}
	@FindBy(xpath="//li[contains(text(),'Property type')]/following-sibling::li[contains(text(),'Commercial')]")
	private WebElement Commercial;
	
	public void validateCommercial() {
		this.Commercial.isDisplayed();
	}
	
	@FindBy(xpath="//option[contains(text(),'Any Regions')]/following-sibling::option[contains(text(),'East Bangalore')][1]")
	private WebElement EastBangalore;
	
	public void validateEastBangalore() {
		this.EastBangalore.isDisplayed();
	}
	@FindBy(xpath="//li[contains(text(),'Central Bangalore')][2]")
	private WebElement CentralBangalore;
	
	public void validateCentralBangalore() {
		this.CentralBangalore.isDisplayed();
	}
	
	public void SelectCB() {
		this.CentralBangalore.click();
	}
	
	@FindBy(xpath="//div[@class='chosen-container chosen-container-single']//a[@class='chosen-single chosen-default']")
	private WebElement regiondropdown;
	
	public void Clickregiondropdown() {
		this.regiondropdown.click();
	}
	
	
	@FindBy(xpath="//select[@name='tax-region']//option[2]")
	private WebElement area;
	
	public void Selectarea(String name) {
		Select list = new Select(area);
		list.selectByVisibleText(name);
	}
	@FindBy(xpath="//button[@class='button fullwidth']")
	private WebElement Search;
	
	public void clickSearch() {
		this.Search.click();
	}
	
	@FindBy(xpath="//h1[contains(text(),'Nothing Found')]")
	private WebElement searchresult;
	
	public void Validatesearchresult() {
		this.searchresult.isDisplayed();
	}
	
	public void Validatesearchresult1() {
		String act= this.searchresult.getText();
		System.out.println(act);
		assertEquals(act, "Nothing Found");
		
	}
}
