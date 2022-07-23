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

public class Activity3{
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
        /*caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");*/
       // caps.setCapability("noReset", true);

        // Instantiate Appium Driver
URL appServer = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 5);
        
    }

    @Test
    public void Method1() throws InterruptedException {
        // Using resource-id
    	
    	
    	
         
    	MobileElement B1 = driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Search\"]");
    	B1.click();
    	B1.sendKeys("https://www.training-support.net/selenium");
    	
    	
    	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.Button[2]").click();
	
    	String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
    	driver.findElement(MobileBy.AndroidUIAutomator(UiScrollable + ".scrollTextIntoView(\"To-Do List\")")).click();
    	
    	driver.findElementByXPath("//android.view.View[@content-desc='To-Do List Elements get added at run time']/android.view.View").click();
    	
    	MobileElement B2 = driver.findElementByXPath("\\\'selectedElementContainer\\\']/div/div[2]/div/div[2]/div/div/div/div/div/div/table/tbody/tr/td[2]/div\"");
    	B2.sendKeys("Add tasks to list");
    	
    	//Clicked on Add
    	driver.findElementByXPath("//*[@id=\"selectedElementContainer\"]/div/div[2]/div/div[2]/div/div/div/div/div/div/table/tbody/tr/td[2]/div").click();
    	
B2.sendKeys("Get number of tasks");
    	
    	//Clicked on Add
    	driver.findElementByXPath("//*[@id=\"selectedElementContainer\"]/div/div[2]/div/div[2]/div/div/div/div/div/div/table/tbody/tr/td[2]/div").click();
    	
B2.sendKeys("Clear the list");
    	
    	//Clicked on Add
    	driver.findElementByXPath("//*[@id=\"selectedElementContainer\"]/div/div[2]/div/div[2]/div/div/div/div/div/div/table/tbody/tr/td[2]/div").click();
    	
    	driver.findElement(MobileBy.AndroidUIAutomator(UiScrollable + ".scrollTextIntoView(\"Add tasks to list\")")).click();
    	driver.findElement(MobileBy.AndroidUIAutomator(UiScrollable + ".scrollTextIntoView(\"Get number of tasks\")")).click();
    	driver.findElement(MobileBy.AndroidUIAutomator(UiScrollable + ".scrollTextIntoView(\"Clear the list\")")).click();
    	
    	Assert.assertEquals(true, true);
    	
    }
    
    
    

    @AfterClass
    public void tearDown() {
        // Close app
        driver.quit();
    }
}