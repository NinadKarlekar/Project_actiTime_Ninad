package actiTime_testscripts;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import actiTime.LoginLogoutPage;
import actiTime_Generic.BaseClass;
import actiTime_Generic.CreateNewCustomer;
import actiTime_Generic.FileLib;

@Listeners(actiTime_Generic.ListenerImplementation.class)

public class Task_001_driver extends BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@Test
	public static void Task_001() throws FileNotFoundException, IOException, InterruptedException, AWTException {
		Reporter.log("CreateCustomer", true);
		FileLib f = new FileLib();
		String expectedCustName = f.getExcelData("description", 0, 0);
		String custDescription = f.getExcelData("description", 0, 1);

		actiTime_Generic.HomePage HomePage = new actiTime_Generic.HomePage(driver);
		HomePage.clickTaskMenu();

		actiTime_Generic.tasklist tasklist = new actiTime_Generic.tasklist(driver);
		tasklist.clickaddNewCustomer();
		tasklist.clickNewCustomer();

		Thread.sleep(3000);

		CreateNewCustomer CreateNewCustomer = new CreateNewCustomer(driver);
		CreateNewCustomer.setnameTB(expectedCustName);
		CreateNewCustomer.setdescriptionTB(custDescription);
		CreateNewCustomer.setSelectCustomerLISTBOX();
		CreateNewCustomer.robot_big();
		CreateNewCustomer.selectHighlightToken();
		CreateNewCustomer.clickCreateCustomerBtn();
		Thread.sleep(4000);
		String actualCustName = CreateNewCustomer.getActualCustCreated().getText();
		Assert.assertEquals(actualCustName, expectedCustName);
	}
}
