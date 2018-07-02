package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
public class Home_Page {


    WebDriver driver;
    WebElement LogOutBtn = driver.findElement(By.cssSelector("[href='https://core2.qa.bravais.com/login/logout']"));
    WebElement profileMenu = driver.findElement(By.className("caret"));


    public Home_Page(WebDriver driver){
        this.driver = driver;
    }
    public void logOut(){
     profileMenu.click();
     LogOutBtn.click();
    }




}
