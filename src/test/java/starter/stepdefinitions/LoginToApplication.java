package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import pages.DashboardPage;
import pages.HomePage;

public class LoginToApplication {
	
	@Steps
	HomePage homePage;
	
	@Steps
	DashboardPage dashboardPage;
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
    
    homePage.openApplication();
	}

	@When("user enter admin as username")
	public void user_enter_admin_as_username() {
   
    homePage.enterUsername();	
	}

	@When("user enter admin{int} as password")
	public void user_enter_admin123_as_password(Integer int1) {
    
		homePage.enterPassword();
		homePage.clickOnLoginButton();
	}

	@Then("user should be able to login")
	public void user_should_able_to_login() {
		dashboardPage.verifyLogin();
	}
	
	@Then("user should able to logout")
	public void user_should_able_to_logout() {
		dashboardPage.verifyLogout();
	}
	
}