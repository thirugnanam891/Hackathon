package testCases;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.Health;
import testBase.BaseClass;

public class TC004 extends BaseClass {
	@Test(priority=4)
	public void demo() throws InterruptedException, HeadlessException, IOException, AWTException {
		logger.info("************Starting TC004 TestCases************");
		heal=new Health(driver);
		
		heal.selectCorporate();
		logger.info("Navigate to For Corporates DropDown");
		heal.selectHealth();
		logger.info("Selecting Health and wellness plan");
		heal.scrollDown();
		logger.info("Scrolling down");
		heal.enterDetails();
		logger.info("Fetched basic details like name,contact,email etc");
		heal.textPrint();
		logger.info("printing Thank you Message");
		heal.paraPrint();
		logger.info("printing Details of Message");
		heal.thankyou();
		logger.info("Thankyou Message Verified");
		screenshot();
		logger.info("ScreenShot taken");
		logger.info("************Ending TC004 TestCases************");
	}

}
