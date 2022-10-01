package actiTime_testscripts;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import actiTime_Generic.BaseClass;

@Listeners(actiTime_Generic.ListenerImplementation.class)

public class Task_002_driver extends BaseClass{
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@Test
	public static void Task_001() throws FileNotFoundException, IOException, InterruptedException, AWTException {
		Reporter.log("CreateNewProject", true);
		actiTime_Generic.HomePage HomePage = new actiTime_Generic.HomePage(driver);
		HomePage.clickTaskMenu();
		
		actiTime_Generic.tasklist tasklist = new actiTime_Generic.tasklist(driver);
		tasklist.clickaddNewCustomer();
		tasklist.clicknewProject();
		Thread.sleep(3000);
		
	}
}
