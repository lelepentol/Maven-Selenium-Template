package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DevSetup {
	public static WebDriver driver;

	public void set_up()    {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver\\geckodriver.exe"); //disesuaikan dengan browser driver yang dipakai
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://cdcteam12hcm-dev.azurewebsites.net/");
	}

    public void tearDown(){
        driver.quit();
    }
}
