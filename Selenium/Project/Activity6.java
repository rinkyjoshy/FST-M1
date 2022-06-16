package Selenium_Project_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity6 {
WebDriver driver;

@BeforeMethod

public void beforeMethod() {
	
	driver = new FirefoxDriver();
	
	driver.get("http://alchemy.hguy.co/orangehrm");
	driver.manage().window().maximize();
	
	WebElement username = driver.findElement(By.id("txtUsername"));
	username.sendKeys("rinky");
	
	WebElement password = driver.findElement(By.id("txtPassword"));
	password.sendKeys("rinkypassword123");
	
	WebElement submit = driver.findElement(By.id("btnLogin"));
	submit.click();

	}

@Test

public void directory() throws InterruptedException {
	
	
	WebElement directory = driver.findElement(By.xpath("//div[@class='menu']/ul/li[6]"));
	Boolean Result = directory.isDisplayed();
	Boolean visibility = directory.isEnabled();
	System.out.println("Directory is visible ? "+ Result);
	System.out.println("Directory is clickable ? "+ visibility);
	
    Actions a = new Actions(driver);
    a.moveToElement(directory);
    a.click(directory).build().perform();   

    Thread.sleep(2000);
    
    WebElement title = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[1]/h1"));
  
    
    String heading = title.getText();
    
   
    
    System.out.println("Heading is " + heading);
    
     Assert.assertEquals(heading, "Search Directory");
    System.out.println("Heading is Matching");
}

@AfterMethod

public void afterMethod() {
	
	driver.quit();
	
}

}
