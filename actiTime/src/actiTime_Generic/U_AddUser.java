package actiTime_Generic;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class U_AddUser {
    @FindBy (xpath = "(//div[.='Users'])[1]")
    private WebElement user;
    @FindBy (xpath="//div[.='New User']")
    private WebElement newuser;
    @FindBy (id="createUserPanel_firstNameField")
    private WebElement firstname;
    @FindBy (id="createUserPanel_lastNameField")
    private WebElement lastname;
    @FindBy (id="createUserPanel_emailField")
    private WebElement email;
    @FindBy (xpath = "(//div[.='-- department not assigned --'])[1]")
    private WebElement department;
    @FindBy (xpath = "(//div[.='HR & Finance'])[3]")
    private WebElement HRdropdown;
    
    @FindBy (xpath="//div[@class='components_button cancelBtn']")
    private WebElement cancelbtn;
    
    //*********************************************************************
    
    public U_AddUser(WebDriver driver)
    {
    PageFactory.initElements(driver, this);
    }
    
    public void setFnameTB(String Fname) throws InterruptedException {
        firstname.sendKeys(Fname);  
        Thread.sleep(2000);
    }
    public void setLnameTB(String Lname) throws InterruptedException {
        lastname.sendKeys(Lname);  
        Thread.sleep(2000);     
    }
    public void setEmailTB(String Email) throws InterruptedException {
        email.sendKeys(Email);   
        Thread.sleep(2000);
    }
    
    public void selectdept() throws InterruptedException
    {
        department.click();
        Thread.sleep(2000);
        HRdropdown.click();
        Thread.sleep(2000);
    }
    
    public void U_cancelbtn() throws InterruptedException
    {
        cancelbtn.click();
        Thread.sleep(2000);
    }
    
    
    

}
