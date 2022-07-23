package AppiumProject;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity2{
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
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
       // caps.setCapability("noReset", true);

        // Instantiate Appium Driver
URL appServer = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 5);
        
    }

    @Test
    public void addTask() throws InterruptedException {
        // Using resource-id
    	
    	System.out.println("on keep right now");
    	 Thread.sleep(5000);
         wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.keep:id/skip_welcome")));
    	driver.findElementById("com.google.android.keep:id/skip_welcome").click();
    	System.out.println("Welcome");
    	
    	
    Thread.sleep(5000);
    wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.apps.tasks:id/tasks_list")));
   	driver.findElementById("com.google.android.keep:id/notes").click();
   	
   	Thread.sleep(5000);
    
	MobileElement tasktitle = driver.findElementById("9aab09b2-230c-48b7-aa2f-04804fac6bae");
	tasktitle.sendKeys("Keep Task 1");
   	  	
   	MobileElement taskdesc = driver.findElementById("d8254e73-bf59-4337-bf10-9481114037ae");
   	taskdesc.sendKeys("This is my first Keep task");
   	
   
   	
   MobileElement addbutton = driver.findElementById("ce3eb839-1149-426a-9f2c-95ab6f2dde7f");
   addbutton.click();
   
   MobileElement task1= driver.findElementById("01193520-7e16-4f86-a057-2deeef19c3a0");
   
   String s1 = ("Keep Task 1");
   
   Assert.assertEquals(s1, task1);
	
   
    }

    @AfterClass
    public void tearDown() {
        // Close app
        driver.quit();
    }
}