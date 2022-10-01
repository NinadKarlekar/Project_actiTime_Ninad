package actiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLogoutPage {

	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgBtn;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement lgoBtn;
	
	public LoginLogoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setLogin(String un,String pw) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgBtn.click();
	}
	
	public void setLogout() {
		lgoBtn.click();
	}
}
