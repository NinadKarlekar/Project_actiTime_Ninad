package actiTime_Generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

import actiTime.LoginLogoutPage;
public class BaseClass {

private static final String input = null;
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
	Reporter.log("openBrowser", true);	
	 driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.manage().window().maximize();
	
	}
	@AfterTest
	public void closeBrowser() {
		Reporter.log("closeBrowser", true);	
		driver.close();
	}
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login", true);	
		FileLib f=new FileLib();
		
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pw = f.getPropertyData("password");
		driver.get(url);
		LoginLogoutPage l1=new LoginLogoutPage(driver);
		l1.setLogin(un, pw);
	}
	@AfterMethod
	public void logout() throws InterruptedException {
		Reporter.log("logout", true);	
		LoginLogoutPage l2=new LoginLogoutPage(driver);
		l2.setLogout();
		Thread.sleep(3000);
	}
	
}
