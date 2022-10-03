package actiTime_Generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewProject {
    @FindBy(xpath = "(//input[@placeholder='Enter Project Name'])[2]")
    private WebElement projNameTB;

    @FindBy(css = "div[class='comboboxButton']")
    private WebElement selectProjDropdown;

    @FindBy(xpath = "//span[@class='highlightToken']")
    private WebElement PhighlightToken;
    
    @FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
    private WebElement projDescrTB;

    @FindBy(xpath = "(//input[@placeholder='Enter task name'])[1]")
    private WebElement taskNameTB;

    @FindBy(xpath = "(//input[@placeholder='not needed'])[1]")
    private WebElement estimateTB;

    @FindBy(xpath = "(//button[contains(.,'set deadline')])[1]")
    private WebElement deadlineBtn;
    
    @FindBy(xpath = "(//button[.='today'])[3]")
    private WebElement datepick;

    @FindBy(xpath = "(//span[contains(.,'ASSIGNED USERS')])[5]")
    private WebElement assignUsersBtn;

    @FindBy(xpath = "//div[.='Create Project']")
    private WebElement createProjBtn;

//************************************************************************************************************************************

    public CreateNewProject(WebDriver driver) {
        PageFactory.initElements(driver, this); // POM
    }

    public void setProjName(String Pna) throws InterruptedException {
        projNameTB.sendKeys(Pna);
        Thread.sleep(2000);
    }

    public void setSelectProjectDropdown() throws InterruptedException {
        selectProjDropdown.click();
        Thread.sleep(2000);
    }

    public void robot_big() throws AWTException, InterruptedException {
        Robot r1 = new Robot();
        r1.keyPress(KeyEvent.VK_B);
        r1.keyPress(KeyEvent.VK_I);
        r1.keyPress(KeyEvent.VK_G);
        Thread.sleep(4000);
    }

    public void selectHighlightToken() throws InterruptedException {
        PhighlightToken.click();
        Thread.sleep(2000);
    }
    
    public void setProjDesc(String Pdes) throws InterruptedException {
        projDescrTB.sendKeys(Pdes);
        Thread.sleep(2000);
    }
    
    
    public void EnterTaskName(String Tname) throws InterruptedException {
        taskNameTB.click();
        taskNameTB.sendKeys(Tname);
        Thread.sleep(2000);
    }
    
    public void EstimatedTB() {
        estimateTB.click();
    }
    
    public void deadLineBtn() throws InterruptedException {
        deadlineBtn.click();
        Thread.sleep(5000);
       // datepick.click();
    }
    
    public void assignUsers() throws InterruptedException {
        assignUsersBtn.click();
        Thread.sleep(2000);
    }
    
    
    public void CreateProject() throws InterruptedException {
        createProjBtn.click();
        Thread.sleep(5000);
    }   

}
