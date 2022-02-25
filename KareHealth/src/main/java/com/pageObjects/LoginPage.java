package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
public class LoginPage {
private WebDriver driver;
	
	//Locators, constructors and Page Action
	
	private By username1 =By.xpath("//input[@name = 'username']");
	private By password =By.xpath("//input[@name = 'password']");
	private By signInButton =By.xpath("//button[@type = 'submit']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public void EnterUserName(String username) {
		driver.findElement(username1).sendKeys("admin");
		//driver.wait(50000);
		//driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);

	}
	public void EnterPassword(String pwd) {
		driver.findElement(password).sendKeys("admin");
		//driver.wait(5000);
		
	}
	public void ClickOnLogin() {
		driver.findElement(signInButton).click();
		//driver.wait(5000);
	}

}
