package Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryLoginPage {

    WebDriver driver;
    WebElement userName = driver.findElement(By.name("uid"));
    WebElement userPassword = driver.findElement(By.name("password"));
    WebElement loginBtn = driver.findElement(By.name("btnLogin"));



    public PageFactoryLoginPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create  all WebElements
        PageFactory.initElements(driver, this);
    }
    //Set user name in textbox
    public void setUserName(String strUserName){
        userName.sendKeys(strUserName);

    }

    //Set password in password textbox
    public void setPassword(String strPassword){
        userPassword.sendKeys(strPassword);
    }

    //Click on login button
    public void clickLogin(){
        loginBtn.click();
    }

    //Get the title of Login Page

    /**
     * This POM method will be exposed in test case to login in the application
     * @param strUserName
     * @param strPasword
     * @return
     */
    public void loginToGuru99(String strUserName,String strPasword){
        //Fill user name
        this.setUserName(strUserName);
        //Fill password
        this.setPassword(strPasword);
        //Click Login button
        this.clickLogin();

    }


}
