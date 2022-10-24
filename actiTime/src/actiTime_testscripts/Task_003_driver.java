package actiTime_testscripts;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import actiTime_Generic.BaseClass;
import actiTime_Generic.CreateNewTask;
import actiTime_Generic.FileLib;

@Listeners(actiTime_Generic.ListenerImplementation.class)
public class Task_003_driver extends BaseClass {
    static {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    }

    @Test
    public static void Task_003() throws InterruptedException, AWTException, IOException {
        Reporter.log("CreateNewTask", true);
        FileLib f = new FileLib();

        actiTime_Generic.HomePage HomePage = new actiTime_Generic.HomePage(driver);
        HomePage.clickTaskMenu();

        actiTime_Generic.tasklist tasklist = new actiTime_Generic.tasklist(driver);
        tasklist.clickaddNewCustomer();
        tasklist.clickNewTask();
        Thread.sleep(3000);

        actiTime_Generic.CreateNewTask CreateNewTask = new actiTime_Generic.CreateNewTask(driver);
        CreateNewTask.dropdown1Click();
        CreateNewTask.robot_big();
        CreateNewTask.selectHighlightToken();
        CreateNewTask.dropdown2Click();
        CreateNewTask.robot_tcs();
        CreateNewTask.selectHighlightToken2();

        CreateNewTask.setTaskName_CNTask();
        CreateNewTask.setEstimate_CNTask();
        CreateNewTask.setDeadline_CNTask();
       
        CreateNewTask.selectCheckbox_CNTask();
        CreateNewTask.CreateTaskBtn();
        Thread.sleep(5000);

    }
}
