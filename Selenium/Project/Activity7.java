package Selenium_Project_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 {
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

public void qualification() throws InterruptedException {
	
	 WebElement myinfo = driver.findElement(By.xpath("//div[@class='menu']/ul/li[3]"));
		
	    Actions a = new Actions(driver);
	    a.moveToElement(myinfo);
	    a.click(myinfo).build().perform();   

	    Thread.sleep(2000);
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,350)", "");
	     
	     
     WebElement qualify = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[9]/a"));
		
	    Actions h = new Actions(driver);
	    h.moveToElement(qualify);
	    h.click(qualify).build().perform();   

	    Thread.sleep(2000);
	    
	    WebElement adbtn = driver.findElement(By.id("addWorkExperience"));
	    adbtn.click();
	    	    
	    driver.findElement(By.id("experience_employer")).clear();
		driver.findElement(By.id("experience_employer")).sendKeys("IBM");
		
        Thread.sleep(2000);
		
		driver.findElement(By.id("experience_jobtitle")).clear();
		driver.findElement(By.id("experience_jobtitle")).sendKeys("Associate Systems Engineer");
		
		Thread.sleep(2000);
	    
		WebElement savbtn = driver.findElement(By.id("btnWorkExpSave"));
	    savbtn.click();
	
}

@AfterMethod

public void afterMethod() {
	
	driver.quit();
}

}
