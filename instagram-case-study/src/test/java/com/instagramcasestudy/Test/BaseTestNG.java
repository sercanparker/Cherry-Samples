package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTestNG {

	public AndroidDriver driver;
	public WebDriverWait wait;

	//these properties are changed when any configuration setting is changed.
	private static String DEVICE_UDID = "";
	private static String DEVICE_NAME = "";		
	private static String APPLICATION_PACKAGE_NAME = "";
	private static String BROWSER_NAME = "";
	private static String APPLICATION_ACTIVITY_NAME = "";
	private static String APPIUM_SERVER_HOST = "";
	
	@BeforeClass
	public void setup() throws InterruptedException
	{
		//Appium driver configurations here.

		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, org.openqa.selenium.Platform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.UDID, DEVICE_UDID);
		capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, APPLICATION_PACKAGE_NAME);
        capabilities.setCapability(AndroidMobileCapabilityType.BROWSER_NAME, BROWSER_NAME);
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APPLICATION_ACTIVITY_NAME);
		capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,"true");

		try {
			this.driver = new AndroidDriver(new URL(APPIUM_SERVER_HOST),capabilities);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			this.wait = new WebDriverWait(driver, 1);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception: " + e.toString());
		}
		
	}
	
	@AfterClass
	public void teardown() 
	{
		driver.quit();
	}
	
	public void WaitForUI() throws InterruptedException{
		synchronized (wait)
		{
			wait.wait(10000);
		}
	}
}
