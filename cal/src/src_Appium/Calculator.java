package src_Appium;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class Calculator {
WebDriver driver;
AndroidDriver dr;

@Test
public void setUp() throws IOException, InterruptedException{
	
	DesiredCapabilities capabilities = new DesiredCapabilities();
	DesiredCapabilities dc = new DesiredCapabilities();
	
	
	
	
    capabilities.setCapability("VERSION", "v1.17.1"); 
    capabilities.setCapability("deviceName","VSCQ9LGQA6WG7HA6");
	capabilities.setCapability("platformName","Android");
	  
 
   
   capabilities.setCapability("appPackage", "com.android.dialer");

	capabilities.setCapability("appActivity","com.android.dialer.DialtactsActivity"); // This is Launcher activity of your app (you can get it from apk info app)

   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
 
	 driver.findElement(By.id("com.android.dialer:id/floating_action_button")).click();
	  
	  //Dial a number
	 driver.findElement(By.id("com.android.dialer:id/zero")).click();
	 driver.findElement(By.id("com.android.dialer:id/four")).click();
	 driver.findElement(By.id("com.android.dialer:id/six")).click();
	 driver.findElement(By.id("com.android.dialer:id/nine")).click();
	 driver.findElement(By.id("com.android.dialer:id/zero")).click();
	 driver.findElement(By.id("com.android.dialer:id/nine")).click();
	 driver.findElement(By.id("com.android.dialer:id/six")).click();
	 driver.findElement(By.id("com.android.dialer:id/four")).click();
	 driver.findElement(By.id("com.android.dialer:id/six")).click();
	 driver.findElement(By.id("com.android.dialer:id/eight")).click();
	
	  
	  
	  //Dialing a number
	  driver.findElement(By.id("com.android.dialer:id/dialpad_floating_action_button")).click();
	 
	 }
	

 
}

