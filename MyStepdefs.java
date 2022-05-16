import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.addBrand;
import pages.homePage;
import pages.inventoryPage;

public class MyStepdefs {
WebDriver driver;
addBrand addbrand;
inventoryPage inventorypage;
homePage homepage;


    @Before
    public void start(){
driver = testRunner.driver;
addbrand = new addBrand(driver);
inventorypage = new inventoryPage(driver);
homepage = new homePage(driver);
}
    @Given("^admin has a valid credentials$")
    public void adminHasAValidCredentials() {
        Assert.assertTrue(driver.findElement(By.name("username")).isDisplayed());
    }

    @When("^admin enter submit$")
    public void adminEnterSubmit() {
    homepage.adminLogin();
    }

    @Then("^Dashboard page is displayed$")
    public void dashboardPageIsDisplayed() {
    Assert.assertTrue(driver.findElement(By.className("sidebar-toggle")).isDisplayed());
    }

    @Given("admin is in add brand page")
    public void adminIsInAddBrandPage() {
        homepage.adminLogin();
        inventorypage.navigateToURL();

    }

    @When("he adds brand with fields {string}, {string}")
    public void heAddsBrandWithFields(String arg0, String arg1) {
    addbrand.createNewRecord();
    addbrand.addnewBrand();
    addbrand.clickSubmit();
    }



    @Then("the brand should be added")
    public void theBrandShouldBeAdded() {
        Assert.assertTrue(driver.findElement(By.xpath("//table[@id = 'grid-table62717b5398fad']")).isDisplayed());
    }

    @Then("Admin should Logout")
    public void adminShouldLogout() {
homepage.adminLogout();
    }


    @Then("adminuser should Logout")
    public void adminuserShouldLogout() {
        homepage.adminLogout();
    }

    @Given("admin is in brand list page")
    public void adminIsInBrandListPage() {
        inventorypage.navigateToURL();
    }

    @When("he clicks on Filter button")
    public void heClicksOnFilterButton() {
        inventorypage.clickOnFilter();
    }

    @And("selects only Id column")
    public void selectsOnlyIdColumn() {
        //inventorypage.clickSubmit();
    }

    @Then("the list with ID and Action column should be displayed")
    public void theListWithIDAndActionColumnShouldBeDisplayed() {
        inventorypage.pageDisplayed();
    }

    @Then("the user should Logout")
    public void theUserShouldLogout() {
        //homepage.adminLogout();
    }

}
