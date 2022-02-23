package com.driver.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public WebDriver driver;

	public static ThreadLocal <WebDriver> tldriver = new ThreadLocal<>();
	//ThreadLocal used for parallel execution
	public WebDriver init_driver(String browser) {
		System.out.println("browser value is " + browser);
		
		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			tldriver.set(new ChromeDriver());
		}
		else
			System.out.println("Please pass the correct browser value" + browser);
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
		
	}

	public static synchronized WebDriver getDriver() {
		return tldriver.get();
	}

}
