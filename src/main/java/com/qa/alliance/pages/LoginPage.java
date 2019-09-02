package com.qa.alliance.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.alliance.base.BaseClass;



public class LoginPage extends BaseClass{
	
	@FindBy (id ="MainContent_txtUserName")
	WebElement username;
	
	@FindBy (id ="MainContent_txtPassword")
	WebElement password;
	
	@FindBy (name ="ctl00$MainContent$btnlogin")
	WebElement loginbtn;
	
	@FindBy (xpath ="//img[contains(@alt,'AFS Logo')]")
	WebElement Headerimg;
	
	@FindBy (xpath ="//img[contains(@class,'ackground-image')]")
	WebElement Backgroundimg;
	
	@FindBy (xpath="//span[contains(text(),'Invalid UserName or Password')]")
	WebElement Errorlable;
	
		
	public LoginPage(){
		PageFactory.initElements(driver, this);
		
	}
	
	public String ValidateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean ValidateHeadeImage(){
		return Headerimg.isDisplayed();
	}
	
	public boolean ValidateBackgroundImage(){
		return Backgroundimg.isDisplayed();
	}
	
	
	public HomePage login(String un, String pw){
		username.sendKeys(un);
		password.sendKeys(pw);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", loginbtn);	
		return new HomePage();
	}
		
	public boolean validateloginerror(String un, String pw){
		username.sendKeys(un);
		password.sendKeys(pw);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", loginbtn);	
		return Errorlable.isDisplayed();		
		
	}
	
	public boolean validateClearbutton(String un, String pw){
		username.sendKeys(un);
		password.sendKeys(pw);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", loginbtn);	
		return Errorlable.isDisplayed();		
		
	}
	
	

}
