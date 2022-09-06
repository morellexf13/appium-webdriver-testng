package tests.AbstractBaseTests;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;



public abstract class TestBase {

	public static AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public abstract void setUpPage() ;
	
		
	@BeforeSuite
	public void setUpAppium() throws MalformedURLException {
	
		DesiredCapabilities caps = new DesiredCapabilities();
		// caps.setCapability("deviceName", "OnePlus 7 Pro");
		// caps.setCapability("platformName", "Android");
		// caps.setCapability("platformVersion", "10");
		// caps.setCapability("udid", "DEVICE SERIAL");
		// caps.setCapability("app", "PATH TO YOUR APP");
		// caps.setCapability("appPackage", "PACKAGE NAME");
		// caps.setCapability("appActivity", "ACTIVITY NAME");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
;

		driver = new AndroidDriver<MobileElement>(url, caps);
	}
	
    @AfterSuite
    public void tearDownAppium() {
        driver.quit();
    }

    @AfterClass
    public void restartApp() {
        driver.resetApp();
    }

}