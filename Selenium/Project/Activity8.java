package Selenium_Project_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 {
WebDriver driver;

@BeforeMethod
public void beforeMethod() {
	
	driver = new FirefoxDriver();
	driver.get("http://alchemy.hguy.co/orangehrm");
	driver.manage().window().maximize();
	
	WebElement username = driver.findElement(By.id("txtUsername"));
	username.sendKeys("orange");
	
	WebElement password = driver.findElement(By.id("txtPassword"));
	password.sendKeys("orangepassword123");
	
	WebElement submit = driver.findElement(By.id("btnLogin"));
	submit.click();

	}



@Test

public void leave() throws InterruptedException {
	
	WebElement levbtn = driver.findElement(By.linkText("Apply Leave"));
	Actions r = new Actions(driver);
	r.moveToElement(levbtn);
	r.click(levbtn).build().perform();
    Thread.sleep(2000);
    System.out.println("done");
    
    Select g = new Select(driver.findElement(By.xpath("//select[@id=\"applyleave_txtLeaveType\"]")));
	g.selectByVisibleText("DayOff");
	Thread.sleep(2000);
	
	WebElement date = (driver.findElement(By.xpath("//img[@class=\"ui-datepicker-trigger\"]")));
	date.click();
	
	System.out.println("Before date");
	
	
	Select x = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/select[2]")));
	x.selectByVisibleText("2022");
	Thread.sleep(2000);
	
	Select y = new Select(driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]")));
	y.selectByVisibleText("Aug");
	Thread.sleep(2000);
	
	(driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[4]/td[4]/a"))).click();
	
	WebElement f= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[9]/textarea"));
    f.sendKeys("LEAVE REQuest FOR RINTES");
	
	Thread.sleep(2000);
	
	System.out.println("After from date");
	
	
	driver.findElement(By.xpath("//input[@id=\"applyBtn\"]")).click();
	
	WebElement mylevbtn = driver.findElement(By.xpath("//div[@class='menu']/ul/li[3]"));
	Actions d = new Actions(driver);
    d.moveToElement(mylevbtn);
    d.click().build().perform();
    Thread.sleep(2000);
    
    WebElement newmylevbtn = driver.findElement(By.xpath("//div[@class='menu']/ul/li[3]/ul/li[2]/a"));
	Actions c = new Actions(driver);
    c.moveToElement(newmylevbtn);
    c.click().build().perform();
    Thread.sleep(2000);
    
    
	
}

@AfterMethod 
public void afterMethod() {
	driver.quit();
}
}
