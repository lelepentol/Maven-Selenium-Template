package stepDef;

import setup.DevSetup;
import allFunc.LoginBaruFunc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginCase extends DevSetup {
	
	LoginBaruFunc loginF = new LoginBaruFunc(driver);

	@Given("I Want Access Guru99")
	public void i_Want_Access_Guru99() {
		System.out.println("login page");
	}

	@When("I open the Web")
	public void i_open_the_Web() {
		loginF.verify_login("Guru99 Bank");
		System.out.println("Verify Guru99 Bank");
	}

	@When("input the email {string} and password {string}")
	public void input_the_email_and_password(String v_email, String v_password) {
		loginF.input_email(v_email);
		loginF.input_password(v_password);
	}

	@Then("I go to homepage")
	public void i_go_to_homepage() {
		loginF.button_login();
		loginF.verify_loggedin("Welcome To Manager's Page of Guru99 Bank");
	}
	
}
