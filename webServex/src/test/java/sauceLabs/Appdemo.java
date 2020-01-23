package sauceLabs;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Appdemo {
	public AndroidDriver<AndroidElement> driver;
	
	@BeforeMethod
	public AndroidDriver<AndroidElement> setUp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8");
		cap.setCapability(MobileCapabilityType.APP, "calculator2.apk");
		cap.setCapability("appPackage", "com.android.calculator2");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		return driver;
	}
	
	
	  @Test
	    public void seleccionarPais() throws InterruptedException {
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElementById("com.android.calculator2:id/digit_7").click();
			driver.findElementById("com.android.calculator2:id/op_add").click();
			driver.findElementById("com.android.calculator2:id/digit_5").click();
			driver.findElementById("com.android.calculator2:id/eq").click();
			Thread.sleep(3000);
			String results = driver.findElementById("com.android.calculator2:id/result").getText();
			System.out.println("el resultado es " + results);
			driver.quit();
	    	}
}
