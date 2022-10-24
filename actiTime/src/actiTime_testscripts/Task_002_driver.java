package actiTime_testscripts;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import actiTime_Generic.BaseClass;
import actiTime_Generic.CreateNewCustomer;
import actiTime_Generic.CreateNewProject;
import actiTime_Generic.FileLib;

@Listeners(actiTime_Generic.ListenerImplementation.class)

public class Task_002_driver extends BaseClass{
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@Test
	public static void Task_001() throws FileNotFoundException, IOException, InterruptedException, AWTException {
		Reporter.log("CreateNewProject", true);
		FileLib f = new FileLib();
        String expectedProjName = f.getExcelData("description", 1, 0);
        String projDescription = f.getExcelData("description", 1, 1);
		actiTime_Generic.HomePage HomePage = new actiTime_Generic.HomePage(driver);
		HomePage.clickTaskMenu();
		
		actiTime_Generic.tasklist tasklist = new actiTime_Generic.tasklist(driver);
		tasklist.clickaddNewCustomer();
		tasklist.clickNewProject();
		Thread.sleep(3000);
		
		CreateNewProject CreateNewProject = new CreateNewProject(driver);
		CreateNewProject.setProjName(expectedProjName);
		CreateNewProject.setSelectProjectDropdown();
        CreateNewProject.robot_big();
        CreateNewProject.selectHighlightToken();
		CreateNewProject.setProjDesc(projDescription);
		CreateNewProject.EnterTaskName("abcd");
		CreateNewProject.EstimatedTB();
		CreateNewProject.deadLineBtn();
		CreateNewProject.assignUsers();
		CreateNewProject.CreateProject();
        Thread.sleep(4000);
		
	}
}
