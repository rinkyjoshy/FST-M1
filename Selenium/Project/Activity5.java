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

public class Activity5 {
public static WebDriver driver;

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
 
 public void edit() throws InterruptedException
 {
	   
	    WebElement myinfo = driver.findElement(By.xpath("//div[@class='menu']/ul/li[3]"));
		
	    Actions a = new Actions(driver);
	    a.moveToElement(myinfo);
	    a.click(myinfo).build().perform();   

	    Thread.sleep(2000);

		
        driver.findElement(By.xpath("//input[@id=\"btnSave\"]")).click();
      
        
        System.out.println("clicked edit");
        
        driver.findElement(By.id("personal_txtEmpFirstName")).clear();
		driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("AMMU");
		
        Thread.sleep(2000);
		
		driver.findElement(By.id("personal_txtEmpLastName")).clear();
		driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("HERE");
		
		WebElement radio = driver.findElement(By.id("personal_optGender_2"));
		radio.click();
		
		//WebElement nation = driver.findElement(By.xpath("//*[@id=\"personal_cmbNation\"]"));
		//WebElement nationopt = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/ol[3]/li[3]/select/option[83]"));
		//Actions b = new Actions(driver);
	    //b.moveToElement(nation);
	    //a.click(nation).build().perform();
	    
	    //Actions f = new Actions(driver);
	   // f.moveToElement(nationopt);
	    //f.select
		
		Select s = new Select(driver.findElement(By.xpath("//select[@id=\"personal_cmbNation\"]")));
		s.selectByVisibleText("Indian");
		Thread.sleep(2000);
		
		WebElement date = (driver.findElement(By.xpath("//img[@class=\"ui-datepicker-trigger\"]")));
		date.click();
		
		System.out.println("Before date");
		
		Select x = new Select(driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]")));
		x.selectByVisibleText("2013");
		Thread.sleep(2000);
		
		Select y = new Select(driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]")));
		y.selectByVisibleText("Feb");
		Thread.sleep(2000);
		
		(driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[3]/td[3]/a"))).click();
		
		Thread.sleep(2000);
		
		System.out.println("After date");
		
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
	    
	}

 @AfterMethod
 
 public void afterMethod() {
	 
	 driver.quit();
 }
}
