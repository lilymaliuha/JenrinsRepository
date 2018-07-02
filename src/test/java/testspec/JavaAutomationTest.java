package testspec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import pages.LogIn_Page;
public class JavaAutomationTest {


    @Test(priority = 0)
    public void test_Home_Page_Appear_Correct() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://tb2.qa.bravais.com/");
        //Find user name and fill user name
        driver.findElement(By.id("username")).sendKeys("oksana.mysyak_test");
        //find password and fill it
        driver.findElement(By.id("password")).sendKeys("Matviuchuk3621");
        //click login button
        driver.findElement(By.id("submitBtn")).click();

        driver.findElement(By.className("caret")).click();
        driver.findElement(By.cssSelector("[href='https://core2.qa.bravais.com/login/logout']"));
        //verify login success

    }



}