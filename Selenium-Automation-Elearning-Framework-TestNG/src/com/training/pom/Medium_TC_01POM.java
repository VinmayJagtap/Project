package com.training.pom;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Medium_TC_01POM {
private WebDriver driver; 

	
	public Medium_TC_01POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);}
	
	
	
	@FindBy(xpath="//a[@class='sign-in']")
	private WebElement Signin;
	
	public void ClickSignin() {
		this.Signin.click();
	}
		
	@FindBy(xpath="//input[@id='user_login']")
	private WebElement Username;
	
	public void EnterUsername(String username) {
		this.Username.sendKeys(username);
	}
	
	@FindBy(xpath="//input[@id='user_pass']")
	private WebElement Password;
	
	public void EnterPassword(String password) {
		this.Password.sendKeys(password);
	}
	
	@FindBy(xpath="//input[@name='login']")
	private WebElement login;
	
	public void ClickLogin() {
		this.login.click();
	}
	
	@FindBy(xpath="//li[@id='menu-item-570']//a[contains(text(),'Plots')]")
	private WebElement Plots;
	
	public void ClickPlots() {
		this.Plots.click();
	}
	
	@FindBy(xpath="//h1[contains(text(),'Region: Plots')]")
	private WebElement PlotsOV;
	
	public void ValidatePlots() {
		this.PlotsOV.isDisplayed();
		String act=this.PlotsOV.getText();
		assertEquals(act, "Region: Plots");
	}
		
	@FindBy(xpath="//div[@id='ajaxsearchlite1']//input[@placeholder='Search here for Properties..']")
	private WebElement SearchBox;
	
	public void SearchBoxEnter(String Plots) {
		this.SearchBox.sendKeys(Plots);
	}
	
	@FindBy(xpath="//span[@class='overlap']")
	private WebElement PlotResult;
	
	public void ClickPlotResult() {
		this.PlotResult.click();
	}
	//@FindBy(xpath="//span[@class='overlap']")
	//private WebElement PlotResult;
	
	public void SwitchWindow1() throws InterruptedException {

		Set<String> handles = driver.getWindowHandles();
		for (String handle: handles) {
			if(!handle.equals(handles)) {
				driver.switchTo().window(handle);
				Thread.sleep(3000);
				System.out.println(driver.getTitle());
			}
			
		}
	}
	
	
	@FindBy(xpath="//h2[contains(text(),'Blog')]")
	private WebElement Blog;
	
	public void ValidateBlog() {
		this.Blog.isDisplayed();
		
	}
	
	@FindBy(xpath="//a[@class='button fullwidth margin-top-20']")
	private WebElement DropALine;
	
	public void ClickDropALine() {
		this.DropALine.click();
	}
	
	@FindBy(xpath="//h4[contains(text(),'Contact Form')]")
	private WebElement ContcatForm;
	
	public void ValidateContcatForm() {
		this.ContcatForm.isDisplayed();
	}
	
	
	
	@FindBy(xpath="//input[contains(@placeholder,'Your Name')]")
	private WebElement Name;
	
	public void EnterName(String Name) {
		this.Name.sendKeys(Name);
	}
	
	@FindBy(xpath="//input[contains(@placeholder,'Email Address')]")
	private WebElement EmailAddress;
	
	public void EnterEmailAddress(String EmailAddress) {
		this.EmailAddress.sendKeys(EmailAddress);
	}
	
	
	@FindBy(xpath="//input[contains(@placeholder,'Subject')]")
	private WebElement Subject;
	
	public void EnterSubject(String Subject) {
		this.Subject.sendKeys(Subject);
	}
	@FindBy(xpath="//textarea[contains(@placeholder,'Message')]")
	private WebElement Message;
	
	public void EnterMessage(String Message) {
		this.Message.sendKeys(Message);
	}
	
	
	
	@FindBy(xpath="//input[contains(@class,'wpcf7-form-control wpcf7-submit')]")
	private WebElement Send;
	
	public void ClickSend() {
		this.Send.click();
	}
	
	@FindBy(xpath="//div[contains(@class,'wpcf7-response-output wpcf7-display-none wpcf7-mail-sent-ng')]")
	private WebElement Confirmation;
	
	public void ValidateConfirmation() {
		this.Confirmation.isDisplayed();
	}
	
	
}
