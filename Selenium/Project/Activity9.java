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

public class Activity9 {
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

public void emergency() throws InterruptedException {
	
	WebElement myinf = driver.findElement(By.xpath("//div[@class='menu']/ul/li[3]"));
	
    Actions p = new Actions(driver);
    p.moveToElement(myinf);
    p.click(myinf).build().perform();   

    Thread.sleep(2000);
    
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,250)", "");
    
    Thread.sleep(2000);
	
    WebElement emer = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[3]/a"));
	
    Actions k = new Actions(driver);
    k.moveToElement(emer);
    k.click(emer).build().perform();

    Thread.sleep(2000);
    
    WebElement table= driver.findElement(By.xpath("//*[@id=\"emgcontact_list\"]"));
    String tabledetails = table.getText();
    
    System.out.println("The Emergency contacts are : " +tabledetails);
    
}

@AfterMethod

public void afterMethod() {
	
	driver.quit();
}


}
