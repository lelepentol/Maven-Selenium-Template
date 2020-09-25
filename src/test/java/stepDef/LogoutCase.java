package stepDef;

import allFunc.LogoutFunc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import setup.DevSetup;

public class LogoutCase extends DevSetup{
	
	LogoutFunc logoutF = new LogoutFunc(driver);
	
	@Given("I have logged in and want to Logout from web")
	public void i_have_logged_in_and_want_to_Logout_from_web() {
	    // Write code here that turns the phrase above into concrete actions
		logoutF.GotoLoginPage();
		logoutF.InputUsername_Password("customer@test.com", "Mitrais@1");
		logoutF.checkLoggedIn();
	}

	@When("I logged in and click logout button")
	public void i_logged_in_and_click_logout_button() {
	    // Write code here that turns the phrase above into concrete actions
		logoutF.Logout();
	}

	@Then("I logged out")
	public void i_logged_out() {
		logoutF.CheckLogouter();
	    // Write code here that turns the phrase above into concrete actions
	}

}
