package allFunc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import setup.BasePOM;

public class LogoutFunc extends BasePOM {
	MainFunc mainFunction = new MainFunc();
	
	@FindBy(xpath = "/html/body/div[1]/div/div[1]/header/div/div[2]/button[2]/span[1]")
	private WebElement loginMenuButton;
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	private WebElement loginField;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	private WebElement passwordField;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/div/form/button/span[1]")
	private WebElement loginButton;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[1]/header/div/div[3]/button")
	private WebElement logoutMenu;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/ul/li[3]")
	private WebElement logoutButton;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[1]/header/div/div[1]/h6")
	private WebElement headerText;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[1]/header/div/div[2]/span")
	private WebElement loginVerify;
	
	public LogoutFunc(WebDriver driver) {
		super(driver);
	}
	
	public void GotoLoginPage() {
		mainFunction.click(loginMenuButton);
	}
	
	public void InputUsername_Password(String v_username, String v_Password) {
		mainFunction.input(loginField, v_username);
		mainFunction.input(passwordField, v_Password);
		mainFunction.click(loginButton);
	}
	
	public void checkLoggedIn() {
		mainFunction.getassert(loginVerify, "customer");
	}
	
	public void Logout() {
		mainFunction.click(logoutMenu);
		mainFunction.click(logoutButton);
	}
	
	public void CheckLogouter() {
		mainFunction.getassert(headerText, "Home Construction");
	}
}
