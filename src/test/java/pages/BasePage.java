package pages;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {
	AppiumDriver<MobileElement> driver;
	
	public BasePage(AppiumDriver<MobileElement> appiumDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
		driver = appiumDriver;
	}
	
	public void getElement(MobileElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public void clear(MobileElement element) {
		getElement(element);
		element.clear();
	}
	
	public void goBack() {
		driver.navigate().back();
	}
	
	public void tapElement(MobileElement element) {
		getElement(element);
		element.click();
	}
	
	public void typeElement(MobileElement element, String text) {
		getElement(element);
		element.sendKeys(text);
	}
	
	public String getAttribute(MobileElement element, String attribute) {
		getElement(element);
		return element.getAttribute(attribute);
		}

}
