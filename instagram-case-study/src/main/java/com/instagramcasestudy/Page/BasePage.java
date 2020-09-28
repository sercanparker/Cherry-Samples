package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class BasePage 
{
	
	public AndroidDriver driver;
	public WebDriverWait wait;
	
	public BasePage(AndroidDriver driver,WebDriverWait wait)
	{
		this.driver = driver;
		this.wait = wait;
	}
	
	protected void click(String identifier)
	{
		driver.findElement(By.id(identifier)).click();
	}
	
	protected void setText(String identifier, String text)
	{
		driver.findElement(By.id(identifier)).clear();
		driver.findElement(By.id(identifier)).sendKeys(text);
	}
	
	protected String getText(String identifier)
	{
		return driver.findElement(By.id(identifier)).getText();
	}
	
	protected boolean isEnable(String identifier){
		return driver.findElement(By.id(identifier)).isEnabled();
	}
	
	public boolean isShown(String identifier){
		return driver.findElement(By.id(identifier)).isDisplayed();
	}
	
	public AndroidDriver getDriver() {
		return driver;
	}
	
	public WebDriverWait getWait() {
		return wait;
	}
}

