package actiTime_Generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

@Listeners(actiTime_Generic.ListenerImplementation.class)


public class CreateNewTask {
    @FindBy(xpath = "(//div[@class='comboboxButton'])[1]")
    private WebElement dropdown1click;
    
    @FindBy(xpath = "//span[@class='highlightToken']")
    private WebElement PhighlightToken;
    
    @FindBy(xpath = "(//div[@class='selectedItem'])[16]")
    private WebElement dropdown2click;
    
    @FindBy(xpath = "(//span[@class='highlightToken'])[2]")
    private WebElement PhighlightToken2;
    
//    @FindBy(xpath = "//div[.='- New Customer -']")
//    private WebElement dropdown1Select;
//    
//    @FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
//    private WebElement CNTask_CusName;
//    
//    @FindBy(xpath = "(//input[@placeholder='Enter Project Name'])[2]")
//    private WebElement CNTask_ProjName;
    
    @FindBy(xpath = "(//input[@placeholder='Enter task name'])[1]")
    private WebElement CNTask_TaskName;
    
    @FindBy(xpath = "(//input[@placeholder='not needed'])[1]")
    private WebElement CNTask_Estimate;
    
    @FindBy(xpath = "(//button[contains(.,'set deadline')])[1]")
    private WebElement CNTask_deadlineBtn;  
    
    @FindBy(xpath = "(//button[contains(.,'OK')])[2]")
    private WebElement CNTask_OkBtn;
    
    @FindBy(xpath = "(//span[@class='checkmark checkMark'])[2]")
    private WebElement CNTask_checkbox;
    
    @FindBy(xpath = "//div[.='Create Tasks']")
    private WebElement createTasksBtn;

//************************************************************************************************************************************

    public CreateNewTask(WebDriver driver) {
        PageFactory.initElements(driver, this); // POM
    }
    
    public void dropdown1Click() throws InterruptedException {
        Thread.sleep(3000);
        dropdown1click.click();
        Thread.sleep(3000);
    }
    
    public void dropdown2Click() throws InterruptedException {
        Thread.sleep(3000);
        dropdown2click.click();
        Thread.sleep(3000);
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
    
    public void robot_tcs() throws IOException, AWTException, InterruptedException {
        Robot r1 = new Robot();
        r1.keyPress(KeyEvent.VK_B);
        r1.keyPress(KeyEvent.VK_U);
        r1.keyPress(KeyEvent.VK_I);
        Thread.sleep(4000);
    }
    
    public void selectHighlightToken2() throws InterruptedException {
        PhighlightToken2.click();
        Thread.sleep(2000);
    }
    
//    public void dropdown1Select() throws InterruptedException {
//        dropdown1Select.click();
//        Thread.sleep(3000);
//    }
    
//    public void setCusName_CNTask() throws InterruptedException {
//        CNTask_CusName.sendKeys("Ninad Customer");
//        Thread.sleep(3000);
//    }
//    
//    public void setProjName_CNTask() throws InterruptedException {
//        CNTask_ProjName.sendKeys("Ninad Project");
//        Thread.sleep(3000);
//    }
    
    public void setTaskName_CNTask() throws InterruptedException {
        CNTask_TaskName.sendKeys("Ninad Task 1");
        Thread.sleep(3000);
    }
    
    public void setEstimate_CNTask() throws InterruptedException {
        CNTask_Estimate.click();
        Thread.sleep(3000);
    }
    
    public void setDeadline_CNTask() throws InterruptedException {
        CNTask_deadlineBtn.click();
        Thread.sleep(3000);
     //   CNTask_OkBtn.click();
    }
    
    public void selectCheckbox_CNTask() throws InterruptedException {
        CNTask_checkbox.click();
        Thread.sleep(3000);
    }
    
    public void CreateTaskBtn() throws InterruptedException {
        Thread.sleep(3000);
        createTasksBtn.click();
    }
    
    
}
