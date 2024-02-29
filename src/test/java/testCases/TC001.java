package testCases;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.testng.annotations.Test;

import Utilities.ExcelUtils;
import pageObjects.Doctors;
import pageObjects.Health;
import pageObjects.HomePage;
import pageObjects.Surgeries;
import testBase.BaseClass;

public class TC001 extends BaseClass {
	
	@Test(priority=1)
	public void first() throws InterruptedException, IOException {
		logger.info("*******Starting the TC001 TestCases********" );
		home=new HomePage(driver);
		//Thread.sleep(1000);
		home.clickLoc();
		logger.info("******Clicking the location Text Box*******");
		home.clearLocation();
		logger.info("******Clearing the location Text Box*******");
		//Thread.sleep(1000);
		home.sendLocation();
		logger.info("******Sending Location******");
		home.selectDropOpt();
		//Thread.sleep(1000);
		logger.info("*****Selecting Current Location******");
		home.searchingDoctor();
		//Thread.sleep(1000);
		logger.info("*****Search Doctor type******");
		home.sendDoctor();
		logger.info("****Sending preffered doctor******");
		home.selectDoctor();
		logger.info("*****Selecting doctor*******");
		logger.info("*************Ending the TC001 TestCases************");
		//logger.info( driver, doctor);
		
		
	}
	
	
	
	 /* @Test(priority=4)
	  public void fourth() throws InterruptedException {
		  heal= new Health(driver);
		  heal.selectCorporate();
		  Thread.sleep(2000);
		  heal.selectHealth();
		  Thread.sleep(2000);
		  heal.scrollDown();
		  Thread.sleep(2000);
		  heal.enterName();
		  Thread.sleep(2000);
		  heal.enterOrgName();
		  Thread.sleep(2000);
		  heal.enterContact();
		  Thread.sleep(2000);
		  heal.enterEmail();
		  Thread.sleep(2000);
		  heal.clickOrgSize();
		  Thread.sleep(2000);
		  heal.selectOrgSize();
		  Thread.sleep(2000);
		  heal.clickIntrest();
		  Thread.sleep(2000);
		  heal.selectIntrest();	 
		  Thread.sleep(2000);
		  heal.verifyDemo();
		  Thread.sleep(3000);
	  } 
	  @Test(priority=5)
	  public void fifth() throws InterruptedException {
		  //heal=new Health(driver);
		  driver.navigate().refresh();
		  Thread.sleep(2000);
		  heal.enterName();
		  Thread.sleep(2000);
		  heal.enterOrgName();
		  Thread.sleep(2000);
		  heal.enterContact();
		  Thread.sleep(2000);
		  //heal.enterEmail();
		  //Thread.sleep(2000);
		  heal.fillEmail();
		  Thread.sleep(3000);
		  heal.clickOrgSize();
		  Thread.sleep(2000);
		  heal.selectOrgSize();
		  Thread.sleep(2000);
		  heal.clickIntrest();
		  Thread.sleep(2000);
		  heal.selectIntrest();	 
		  Thread.sleep(2000);
		  //heal.clearing();
		  //Thread.sleep(2000);
		  heal.verifyButton();
		  Thread.sleep(2000);
		  heal.clickingButton();
		  Thread.sleep(9000);
		  heal.textPrint();
		  Thread.sleep(2000);
		  heal.paraPrint();
		  Thread.sleep(3000);
		  heal.thankyou();
	  }
	*/
	
}



