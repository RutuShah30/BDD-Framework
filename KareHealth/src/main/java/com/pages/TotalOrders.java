package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TotalOrders {
private WebDriver driver;
	
	//Locators, constructors and Page Action
	
	//private By username1 =By.xpath("//input[@name = 'username']");
	private By TotalOrderClick = By.xpath("//a[@href ='/admin/orders']");
	
	public TotalOrders(WebDriver driver) {
		this.driver = driver;
	}
	
		public void ClickOnTotalOrders() {
		driver.findElement(TotalOrderClick).click();
		//driver.wait(5000);
	}

}
