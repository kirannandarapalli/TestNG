package ui;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import jiraTestCases.TestBase;

public class Jira_LoginPage extends TestBase{

@FindBy(how = How.ID, using = "username") WebElement username;
@FindBy(how = How.ID, using = "login-submit") WebElement continueButton;
@FindBy(how = How.ID, using = "password") WebElement password;
@FindBy(how = How.ID, using = "login-submit") WebElement loginButton;
@FindBy(how = How.XPATH, using = "/html/head/link[6]") WebElement pageTitle;


public void enterLoginDetails() throws InterruptedException {
	 
	 	username.sendKeys("kiran1ly4friends@gmail.com");
	 	continueButton.click();
	 	Thread.sleep(3000);
	 	password.sendKeys("kiran476");
	 	loginButton.click();
	 	Thread.sleep(10000);
	 	String actualTitle = driver.getTitle();
	 	String expectedTitle = "System dashboard - Jira";
	 	assertEquals(expectedTitle,actualTitle);
	 	System.out.println(actualTitle);	 	 
	 
 }


public String getPageTitle() {
	return driver.getTitle();
}

}
 
	


