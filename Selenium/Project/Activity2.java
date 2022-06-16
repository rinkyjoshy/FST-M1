package Selenium_Project_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
WebDriver driver;


@BeforeMethod

public void beforeMethod() {
	
	driver = new FirefoxDriver();
	driver.get("http://alchemy.hguy.co/orangehrm");	
}


@Test

public void displayUrl() {
	
	
	WebElement img = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/img"));
	
	System.out.println("The URL is :" +img.getAttribute("src"));
		
}

@AfterMethod

public void afterMethod() {
	
	driver.quit();
}


}
