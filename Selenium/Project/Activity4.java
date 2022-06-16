package Selenium_Project_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {

	public static WebDriver driver;

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
	public void add() throws InterruptedException {
		
		WebElement pimbtn = driver.findElement(By.xpath("//div[@class='menu']/ul/li[2]"));
		
	    Actions s = new Actions(driver);
	    s.moveToElement(pimbtn);
	    s.click(pimbtn).build().perform();   

	    Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//input[@id=\"btnAdd\"]")).click();
		
	    driver.findElement(By.xpath("//input[@id=\"firstName\"]")).clear();
		driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("JORIN");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("lastName")).clear();
		driver.findElement(By.id("lastName")).sendKeys("IBMQA");
			
		driver.findElement(By.xpath("//input[@id=\"btnSave\"]")).click();
		
		
		System.out.println("DONE UP THIS");
		
		driver.findElement(By.xpath("//a[@id=\"menu_pim_viewEmployeeList\"]")).click();
		
		Thread.sleep(2000);
		
	   driver.findElement(By.xpath("//input[@id=\"empsearch_employee_name_empName\"]")).sendKeys("JORIN");
	    		
		
		System.out.println("BEFORE SEARCH");
		
		
	   driver.findElement(By.id("searchBtn")).click();
		
	   System.out.println("AFTER SEARCH");
			
	}
	
	@AfterMethod

	public void afterMethod() {
		
		driver.quit();
	}

	}


