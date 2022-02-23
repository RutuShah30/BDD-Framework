package StepDefinition;

import com.driver.factory.DriverFactory;
import com.pages.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TotalOrdersSD {
	private static String title;
	private LoginPage login = new LoginPage(DriverFactory.getDriver());
	private TotalOrders totalorder = new TotalOrders(DriverFactory.getDriver());

	@Given ("user is logged in")
	
	public void user_is_logged_in () {
		DriverFactory.getDriver().get("http://karehealth.menpaniproducts.com/admin/auth/login");
		login.EnterUserName("admin");
		login.EnterPassword("admin")
	}
	
	@And ("user is on Dashboard screen")

	public void user_is_on_Dashboard_screen() {
		login.ClickOnLogin();
	}
	
	@When ("user clicks on TotalOrders")
	public void user_clicks_on_TotalOrders () {
		totalorder.ClickOnTotalOrders();
	}

    @Then ("Orders List is displayed")

	public  void orders_list_is_displayed() {
		title = login.getLoginPageTitle();
		System.out.println("Page title is: " + title);
	}

}
