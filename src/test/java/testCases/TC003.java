package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.Surgeries;
import testBase.BaseClass;

public class TC003 extends BaseClass{
	@Test(priority=3)
	public void third() throws InterruptedException, IOException {
		logger.info("************Starting TC003 TestCases************");
		sur=new Surgeries(driver);
		
		sur.clickSurgery();
		//Thread.sleep(1000);
		logger.info("Navigating to Surgeries page");
	
		sur.scrollDown();
		logger.info("Scrolling down to Popular Surgeries");
		//Thread.sleep(1000);
		
		sur.listOfSurgeries();
		logger.info("Fetching List of Surgeries");
		logger.info("************Ending TC003 TestCases************");
		
	}
}
