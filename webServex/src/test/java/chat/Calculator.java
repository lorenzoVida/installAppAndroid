package chat;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {
	public static final String USERNAME = "lorenzovida";
	public static final String ACCESS_KEY = "15ee86b1-ff21-44d4-8a6f-197f06eb0f57";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	public static String id;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.0");
		cap.setCapability(MobileCapabilityType.APP, "calculator2.apk");
		
		cap.setCapability("deviceType","phone");
		//cap.setCapability("app","");
		cap.setCapability("appiumVersion","1.9.1");
		cap.setCapability("appPackage", "com.android.calculator2");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		//AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL(URL),cap);
		id = ((RemoteWebDriver)driver).getSessionId().toString();
		
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
