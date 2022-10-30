package actiTime_testscripts;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import actiTime_Generic.BaseClass;
import actiTime_Generic.FileLib;
import actiTime_Generic.U_AddUser;
@Listeners(actiTime_Generic.ListenerImplementation.class)

public class Users_001_driver extends BaseClass {
    static {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    }
    @Test
    public static void Task_001() throws FileNotFoundException, IOException, InterruptedException, AWTException {
        Reporter.log("CreateNewUser", true);
        FileLib f = new FileLib();
        String UserFirstName = f.getExcelData("users", 0, 0);
        String UserLastName = f.getExcelData("users", 0, 1);
        String UserEmail = f.getExcelData("users", 0, 2);

        actiTime_Generic.HomePage HomePage = new actiTime_Generic.HomePage(driver);
        HomePage.clickUsersMenu();
        
        actiTime_Generic.userlist userlist = new actiTime_Generic.userlist(driver);
        userlist.clickNewUser();
        
        Thread.sleep(3000);
        
        U_AddUser u_AddUser = new U_AddUser(driver);
        u_AddUser.setFnameTB(UserFirstName);
        u_AddUser.setLnameTB(UserLastName);
        u_AddUser.setEmailTB(UserEmail);
        u_AddUser.selectdept();
        u_AddUser.U_cancelbtn();
        
        Alert a= driver.switchTo().alert();
        a.accept();

    }
}
