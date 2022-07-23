package AppiumProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity1{
    // Declare Android driver
    AppiumDriver<MobileElement> driver;
    WebDriverWait wait;
    

    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "PixelEmulator");
        caps.setCapability("platformName ", "android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
       // caps.setCapability("noReset", true);

        // Instantiate Appium Driver
URL appServer = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 5);
        
    }

    @Test
    public void addTask() throws InterruptedException {
        // Using resource-id
    	
    	System.out.println("on tasks right now");
    	 Thread.sleep(5000);
         wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.apps.tasks:id/welcome_get_started")));
    	driver.findElementById("com.google.android.apps.tasks:id/welcome_get_started").click();
    	System.out.println("Clicked on Addtask");
    	
    	
    Thread.sleep(5000);
    wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.apps.tasks:id/tasks_list")));
   	driver.findElementById("com.google.android.apps.tasks:id/tasks_list").click();
   	
   	Thread.sleep(5000);
    wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.apps.tasks:id/add_task_title")));
	MobileElement taskname = driver.findElementById("com.google.android.apps.tasks:id/add_task_title");
	taskname.sendKeys("Complete Activity with Google Tasks");
   	  	
   	driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
   	System.out.println("Clicked on Save");
   
   	
   	driver.findElementById("com.google.android.apps.tasks:id/welcome_get_started").click();
	System.out.println("Clicked on Addtask");
	
	
Thread.sleep(5000);
wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.apps.tasks:id/tasks_list")));
	driver.findElementById("com.google.android.apps.tasks:id/tasks_list").click();
	
	Thread.sleep(5000);
wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.apps.tasks:id/add_task_title")));
MobileElement taskname1 = driver.findElementById("com.google.android.apps.tasks:id/add_task_title");
taskname1.sendKeys("Complete Activity with Google Keep");
	  	
	driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
	System.out.println("Clicked on Save");

	driver.findElementById("com.google.android.apps.tasks:id/welcome_get_started").click();
	System.out.println("Clicked on Addtask");
	
	
Thread.sleep(5000);
wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.apps.tasks:id/tasks_list")));
	driver.findElementById("com.google.android.apps.tasks:id/tasks_list").click();
	
	Thread.sleep(5000);
wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.apps.tasks:id/add_task_title")));
MobileElement taskname2 = driver.findElementById("com.google.android.apps.tasks:id/add_task_title");
taskname2.sendKeys("Complete the second Activity Google Keep");
	  	
	driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
	System.out.println("Clicked on Save");

    List<MobileElement> textItems = driver.findElementsByClassName("android.widget.TextView");
	
    for(MobileElement textItem : textItems) {

        System.out.println(textItem.getText());
        
        Assert.assertEquals(taskname,textItem);
    	
    }
    }

    @AfterClass
    public void tearDown() {
        // Close app
        driver.quit();
    }
}