package sauceLabs;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class VodQA {
	public AndroidDriver<AndroidElement> driver;
	public static final String USERNAME = "lorenkaya";
	public static final String ACCESS_KEY = "a79b741f-8b49-4a86-a444-4e26e1682fbb";  
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	public static String id;
	public String app = "https://github.com/lorenzoVida/installAppAndroid/blob/master/webServex/resources/android/VodQA.apk?raw=true";
	  
	@BeforeMethod
	public void setUp() throws MalformedURLException, InterruptedException {
	
		DesiredCapabilities caps = DesiredCapabilities.android();
		//DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("appiumVersion", "1.9.1");
		caps.setCapability("deviceName","Android Emulator");
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability("browserName", "Chrome");
		caps.setCapability("platformVersion", "8.0");
		caps.setCapability("platformName","Android");
		caps.setCapability("app", app);
	//	AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL(URL),caps);
		 driver = new AndroidDriver(new URL(URL),caps);
		id = ((RemoteWebDriver)driver).getSessionId().toString();
//      driver = new RemoteWebDriver(new URL(sauceURL), capabilities);
	
		// driver= new RemoteWebDriver(new URL(sauceURL), capabilities);;
	}
	
	@Test
	public void login () throws InterruptedException {
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.EditText[@text='admin']").sendKeys("admin");
		driver.findElementByXPath("//android.widget.EditText[@index='2']").sendKeys("admin");
		driver.findElementByXPath("//android.widget.TextView[@text='LOG IN']").click();
		
	}
	
	
}
