package stepDefs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.LoginPage;

public class LoginStep {

	Context context;

	WebDriver driver;
	/*
	 * public void LoginStep(Context context) {
	 * 
	 * this.context=context; }
	 */

	LoginPage loginPage;

	@Given("URL {string} is provided")
	public void url_is_provided(String url) {

		driver = new Context().setUp();
		driver.get("http://techfios.com/test/billing/?ng=admin/");

	}

	@Given("for application login username {string} and password {string} is supplied")
	public void for_application_login_username_and_password_is_supplied(String username, String password) {

		loginPage = new LoginPage(driver);
		loginPage.getUsernamePassword(username, password);

	}

	@When("click on login button")
	public void click_on_login_button() {

		loginPage.clickOnLogin();
	}

	@Then("I enter the login page")
	public void i_enter_the_login_page() {

		// dashboardPage = new DashboardPage(driver);
		// Assert.assertTrue(dashboardPage.getDashboardPageHeader());

	}

}
