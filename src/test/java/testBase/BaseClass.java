package testBase;


import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import pageObjects.Doctors;
import pageObjects.Health;
import pageObjects.HomePage;
import pageObjects.Surgeries;

public class BaseClass  
{
	public static WebDriver driver;
	public static Logger logger;
	public Properties prop;
	public HomePage home;
	public Doctors doctor;
	public Surgeries sur;
	public  Health heal;
	//public ExcellFromExcell exe;
	@BeforeTest
	@Parameters({"os","browser"})
	public void setup(String os,String br) throws IOException 
	{
		
		FileReader file=new FileReader(".\\src\\test\\resources\\conf.properties");
		prop=new Properties();
		prop.load(file);
		
		logger=LogManager.getLogger(this.getClass());
		
		if(prop.getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			
			
			
			DesiredCapabilities capabilities=new DesiredCapabilities();
			
			//os
			if(os.equalsIgnoreCase("windows"))
			{
				capabilities.setPlatform(Platform.WIN11);
			}
			else if(os.equalsIgnoreCase("mac"))
			{
				capabilities.setPlatform(Platform.MAC);
			}
			else
			{
				System.out.println("No matching os..");
				return;
			}
			
			//browser
			switch(br.toLowerCase())
			{
			case "chrome" : capabilities.setBrowserName("chrome"); break;
			case "edge" : capabilities.setBrowserName("MicrosoftEdge"); break;
			default: System.out.println("No matching browser.."); return;
			}
			
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
			
		    }
		else if(prop.getProperty("execution_env").equalsIgnoreCase("local"))
		{
				//launching browser based on condition - locally
			if(br.equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();
					
				}
				else if(br.equalsIgnoreCase("edge")) {
					driver=new EdgeDriver();
					//driver.get(prop.getProperty("link"));
				}
				else {
					System.out.println("There are no browser");
				}
			}	

		
		
		
	
		driver.get(prop.getProperty("link"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
	}
	
	public  void screenshot() throws IOException, HeadlessException, AWTException {
		BufferedImage img1=new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(img1, "png", new File("C:\\Users\\2304036\\eclipse-workspace\\Hackathon_proj\\src\\test\\java\\screenshotss\\errormsg.png"));
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
