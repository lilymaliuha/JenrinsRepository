package Factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryHomePage {

    WebDriver driver;
    WebElement homePageUserName;
    WebElement getHomePageUserName= driver.findElement(By.className("pull-left ng-binding"));

    public PageFactoryHomePage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create  all WebElements
        PageFactory.initElements(driver, this);
    }
    //Get the User name from Home Page
    public String getHomePageDashboardUserName(){
        return	homePageUserName.getText();
    }

}
