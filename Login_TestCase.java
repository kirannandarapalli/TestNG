package jiraTestCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import ui.Jira_LoginPage;
import org.openqa.selenium.support.PageFactory;

public class Login_TestCase extends TestBase{
	  
	  
  @Test
  public void login() throws InterruptedException {
	  Jira_LoginPage loginpage = PageFactory.initElements(driver, Jira_LoginPage.class);
	  loginpage.enterLoginDetails();
	  try {
	        if (loginpage.getPageTitle().contains("System dashboard - Jira"))
	        	testReorts.log(LogStatus.PASS, loginpage.getPageTitle());
	        else
	        	testReorts.log(LogStatus.FAIL, loginpage.getPageTitle());
	        
	    } catch (Exception e) {
	    	testReorts.log(LogStatus.ERROR, e.getMessage());
	    }
	  
  }
 

}
