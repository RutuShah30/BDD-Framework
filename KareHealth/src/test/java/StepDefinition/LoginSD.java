package StepDefinition;


import com.driver.factory.DriverFactory;
import com.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSD {
	private static String title;
	private LoginPage login = new LoginPage(DriverFactory.getDriver());

	@Given ("user is on login page")
	public void user_is_on_login_page () {
		DriverFactory.getDriver().get("http://karehealth.menpaniproducts.com/admin/auth/login");
		
	}
	
	@When ("user enters username {string}")
	public void user_enters_username (String username1) {
		login.EnterUserName(username1);
	}

	@When ("user enters password {string}")
	public void user_enters_password(String password){
		login.EnterPassword(password);
	}

	@And ("user clicks on login button")
	public void user_clicks_login_button() {
		login.ClickOnLogin();
	}
	
	@Then("user gets the title of the home page")
	public void user_gets_the_title_of_the_home_page() {
		title = login.getLoginPageTitle();
		System.out.println("Page title is: " + title);
	}

}
