package actiTime_Generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class userlist {

    @FindBy(xpath = "//div[@class='userList_manageButtons_component_groupItem department ']")
    private WebElement departmentsBtn;
    
    @FindBy(xpath = "//div[.='New User']")
    private WebElement newUserBtn;
    
    @FindBy(xpath = "//div[.='Bulk Invitations']")
    private WebElement bulkInvitationBtn;
    
    
    //**************************************************************
    
    public userlist(WebDriver driver) {
        PageFactory.initElements(driver, this); // POM
    }
    
    public void clickDepartmentBtn() {
        departmentsBtn.click();
    }
    
    public void clickNewUser() {
        newUserBtn.click();
        
    }
    
    public void clickBulkInvitation() {
        bulkInvitationBtn.click();
        
    }
}
