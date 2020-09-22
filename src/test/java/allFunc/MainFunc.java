package allFunc;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.MobileBy.ByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import setup.DevSetup;
public class MainFunc extends DevSetup {
		
	public void input(WebElement element,String value) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		(element).sendKeys(value);
	}
	
	public void click(WebElement button) {
		(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOf(button));
		(button).click();
	}
	
	public void getassert(WebElement element,String text) {
		(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOf(element));
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Assert.assertTrue((element).getText().contains(text));
		}catch (NoSuchElementException e) {
			Assert.fail("Element "+(element)+" is not found");
		}
	}
}
