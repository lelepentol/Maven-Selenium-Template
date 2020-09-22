package allFunc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import setup.BasePOM;

public class LoginBaruFunc extends BasePOM {

	MainFunc mainFunction = new MainFunc();
	
	@FindBy(name = "uid")
	private WebElement user99GuruName;
	
	@FindBy(name = "password")
	private WebElement password99Guru;
	
	@FindBy(className = "barone")
	private WebElement titleText;
	
	@FindBy(name = "btnLogin")
	private WebElement login;
	
	@FindBy(className = "heading3")
	private WebElement titleLogin;
	
	public LoginBaruFunc(WebDriver driver) {
		super(driver);
	}
	public void input_email(String val_email) {
//		mainFunction.input(el_email, val_email);
		mainFunction.input(user99GuruName, val_email);
	}
	public void input_password(String val_password) {
		mainFunction.input(password99Guru, val_password);
	}
	public void button_login() {
		mainFunction.click(login);
	}
	
	public void verify_login(String valText) {
		mainFunction.getassert(titleText, valText);
	}
	
	public void verify_loggedin(String valText) {
		mainFunction.getassert(titleLogin, valText);
	}

}
