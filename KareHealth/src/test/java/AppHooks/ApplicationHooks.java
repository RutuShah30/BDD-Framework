package AppHooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.driver.factory.DriverFactory;
import com.qa.utilites.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	private DriverFactory driverfactory;
	private WebDriver driver;
	private ConfigReader configreader;
	Properties prop;
	
	@Before(order = 0)
	public void getproperty() {
		configreader = new ConfigReader();
		prop = configreader.init_prop();
	}
	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverfactory = new DriverFactory();
		driver= driverfactory.init_driver(browserName);
	}
	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
		
	}
	@After(order =1)
	public void teardown(Scenario scenario) {
		if (scenario.isFailed()) {
			String screenshotName=scenario.getName().replaceAll(" "," ");
		}
	}
	


}
