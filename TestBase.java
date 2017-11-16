package jiraTestCases;

import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testReporterBase.TestReports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;

public class TestBase {
   public static WebDriver driver;
	TestReports testReorts;
	
  @BeforeSuite
  public void initializeBrowser() {
	  testReorts = new TestReports();
	    testReorts.takeScreenshots();
	  	ChromeOptions options = new ChromeOptions();
	  	options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-extenstions");
		options.addArguments("disable-infobars");
		driver = new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver", "D:\\Automation-TestNG\\chromedriver.exe");
		driver.manage().window().maximize();
		testReorts.log(LogStatus.INFO, "Browser is Opened");
		driver.get("https://newcrx.atlassian.net");
		testReorts.log(LogStatus.PASS, "JIRA url is Opened");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }	

  @AfterSuite
  public void closeBrowser() {
	  driver.quit();
	  testReorts.endTest();
  }
	
}
