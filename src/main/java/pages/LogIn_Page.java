package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LogIn_Page {
    WebDriver driver;
    WebElement userName = driver.findElement(By.id("username"));
    WebElement userPassword = driver.findElement(By.id("password"));
    WebElement titleText = driver.findElement(By.className("pull-left ng-binding"));
    WebElement loginBtn = driver.findElement(By.id("submitBtn"));

    public LogIn_Page(WebDriver driver){
        this.driver = driver;
    }
    //Set user name in textbox
    public void setUserName(String strUserName){
        userName.sendKeys(strUserName);;
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
    public String getLoginTitle(){
        return	titleText.getText();
    }
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

