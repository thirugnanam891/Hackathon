package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.Doctors;
import pageObjects.Surgeries;
import testBase.BaseClass;

public class TC002 extends BaseClass {
	@Test(priority=2)
	public void second() throws InterruptedException, IOException {
		logger.info("*************Starting TC002 TestCases************");
		doctor=new Doctors(driver);
		doctor.selectingPatientStories();
		logger.info("Clicking patient Stories");
		Thread.sleep(1000);
		doctor.selectPatientOpt();
		logger.info("Clicking patient Stories");
		Thread.sleep(1000);
		doctor.selectDoctor();
		logger.info("Clicking patient Stories");
		Thread.sleep(1000);
		doctor.selectDoctorExp();
		logger.info("Clicking patient Stories");
		Thread.sleep(1000);
		doctor.selectFilter();
		logger.info("Clicking patient Stories");
		Thread.sleep(1000);
		doctor.selectFee();
		logger.info("Clicking patient Stories");
		Thread.sleep(1000);
		doctor.selectFilterAgain();
		logger.info("Clicking patient Stories");
		Thread.sleep(2000);
		doctor.selectAvailableSlot();
		logger.info("Clicking availabilty");
		Thread.sleep(1000);
		doctor.selectRelevance();
		logger.info("Clicking Relevance DropDown");
		Thread.sleep(1000);
		doctor.selectFeesDesc();
		logger.info("Selecting Fee Description");
		Thread.sleep(1000);
		doctor.getDoctorInfo();
		logger.info("Extracting Doctors information");
		logger.info("************Ending TC002 TestCases************");
		
	}


}
