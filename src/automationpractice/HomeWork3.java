
/*
Open url : http://automationpractice.com/index.php
        Click on Sign In
        Enter correct Email in Email field
        Enter wrong Password in Password field
        Click on Sign In button.
        Expected Result:
        Error Message “There is 1 error”
*/


package automationpractice;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeWork3 {

    WebDriver driver;

    @Before

    public void setUp(){

        String baseUrl = "http://automationpractice.com/index.php";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test
    public void verifyUserShouldGetErrorMessageWhenEnterWrongPasswordOnSignInPage(){

        driver.findElement(By.xpath("//a[@class='login']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dip@gmail.com");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("1234567");
        driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();
    }

}
