package com.training.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Medium_TC_03POM {
private WebDriver driver; 

	
	public Medium_TC_03POM(WebDriver driver) {
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
	@FindBy(xpath="//a[@class='wp-has-submenu wp-not-current-submenu menu-top menu-icon-post open-if-no-js menu-top-first']//div[@class='wp-menu-image dashicons-before dashicons-admin-post']")
	private WebElement Posts;
	
	public void HoverPosts() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(Posts).build().perform();
		Thread.sleep(3000);
	}
	@FindBy(xpath="//li[@id='menu-posts']//ul[@class='wp-submenu wp-submenu-wrap']//li//a[contains(text(),'Categories')]")
	private WebElement Categories;
	
	public void ClickCategories() {
		this.Categories.click();
	}
	
	
	@FindBy(xpath="//input[@id='submit']")
	private WebElement AddNewCategories;
	
	public void ClickAddNewCategories() {
		this.AddNewCategories.click();
	}
	
	public void ValidateAddNewCategories() {
		this.AddNewCategories.isDisplayed();
	}
	
	
	
	@FindBy(xpath="//input[@id='tag-name']")
	private WebElement Name;
	
	public void EnterName(String name) {
		this.Name.sendKeys(name);
	}
	
	@FindBy(xpath="//input[@id='tag-slug']")
	private WebElement Slug;
	
	public void EnterSlug(String Slug) {
		this.Slug.sendKeys(Slug);
	}
	
	@FindBy(xpath="//textarea[@id='tag-description']")
	private WebElement description;
	
	public void Enterdescription(String description) {
		this.description.sendKeys(description);
	}
	
	@FindBy(xpath="//a[contains(text(),'abcd')]")
	private WebElement User;
	
	public void Validateuser() {
		this.User.isDisplayed();
	}
	
	@FindBy(xpath="//a[contains(text(),'All Posts')]")
	private WebElement AllPosts;
	
	public void ClickAllPosts() {
		this.AllPosts.click();
	}
	
	@FindBy(xpath="//a[@class='page-title-action']")
	private WebElement AddNew;
	
	public void ClickAddNew() {
		this.AddNew.click();
	}
	
	
	@FindBy(xpath="//input[@id='title']")
	private WebElement Title;
	
	public void EnterTitle(String title) throws InterruptedException {
		Thread.sleep(10000);
		this.Title.sendKeys(title);
		
		/*
		 * Actions act = new Actions(driver);
		 * act.moveToElement(Title).click().build().perform();
		 * act.sendKeys("any value");
		 */
		
	}
	
	@FindBy(xpath="//textarea[@id='content']")
	private WebElement Content;
	
	public void EnterContent(String Content) {
		this.Content.sendKeys(Content);
	}
	
	@FindBy(xpath="//input[@id='in-category-552']")
	private WebElement CheckBox;
	
	public void SelectCheckBox() {
		this.CheckBox.click();
	}
	@FindBy(xpath="//input[@id='publish']")
	private WebElement Publish;
	
	public void ClickPublish() {
		this.Publish.click();
	}
	
	@FindBy(xpath="//p[contains(text(),'Post published.')]")
	private WebElement Postpublished;
	
	public void ValidatePostpublished() {
		this.Postpublished.isDisplayed();
		
	}
	
	
	
	@FindBy(xpath="//li[@id='menu-posts']//ul[@class='wp-submenu wp-submenu-wrap']//li//a[contains(text(),'Add New')]")
	private WebElement AddPost;
	
	public void ValidateAddPost() {
		this.AddPost.isDisplayed();
	}
	public void ValidateCategories() {
		this.Categories.isDisplayed();
	}
	public void ValidateAllPosts() {
		this.AllPosts.isDisplayed();
	}
	@FindBy(xpath="//li[@id='menu-posts']//ul[@class='wp-submenu wp-submenu-wrap']//li//a[contains(text(),'Tags')]")
	private WebElement Tags;
	
	public void ValidateTags() {
		this.Tags.isDisplayed();
	}
	
	
	@FindBy(xpath="//a[@class='wp-has-submenu wp-has-current-submenu wp-menu-open menu-top menu-icon-post open-if-no-js menu-top-first']//div[@class='wp-menu-image dashicons-before dashicons-admin-post']")
	private WebElement Posts1;
	
	public void HoverPosts1() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(Posts1).build().perform();
		Thread.sleep(3000);
	}
	@FindBy(xpath="//h1[@class='wp-heading-inline']")
	private WebElement random;
	
	public void randomClick() {
		this.random.click();
	}
	
}
