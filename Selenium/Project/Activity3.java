package Selenium_Project_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
WebDriver driver;

@BeforeMethod

public void beforeMethod() {
	driver = new FirefoxDriver();
	
	driver.get("http://alchemy.hguy.co/orangehrm");
	
}
	
@Test

public void login() {
	
	WebElement username = driver.findElement(By.id("txtUsername"));
	username.sendKeys("orange");
	
	WebElement password = driver.findElement(By.id("txtPassword"));
	password.sendKeys("orangepassword123");
	
	WebElement submit = driver.findElement(By.id("btnLogin"));
	submit.click();
	
	String currentURL = driver.getCurrentUrl();
    Assert.assertEquals("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/dashboard",currentURL);
		
    System.out.println("HEYY I AM IN HOME PAGE");
}

@AfterMethod

public void afterMethod() {
	
	driver.quit();
}
}
