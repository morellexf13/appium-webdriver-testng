package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import tests.AbstractBaseTests.TestBase;

public class NetworkTest extends TestBase{
	
    @BeforeTest
    public void setUpPage() {	

	}

	@Test
	public void testNetwork() throws InterruptedException {
        Thread.sleep(15000);
		HomePage homePage;
		homePage = new HomePage(driver);
		
        homePage.tapStart();
        Thread.sleep(5000);
        homePage.tapInteriorOption();
        Thread.sleep(300000);
       
    }
}