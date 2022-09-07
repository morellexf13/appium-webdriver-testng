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
		// Click "START" button to start speed test download/upload
        homePage.tapStart();
        Thread.sleep(5000);
        homePage.tapInteriorOption();
        // Click the "Interior" option, this defines where are you going to use the network
        Thread.sleep(300000);
       
    }
}