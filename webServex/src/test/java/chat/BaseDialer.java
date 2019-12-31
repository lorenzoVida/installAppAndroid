package chat;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseDialer {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		 
		// TODO Auto-generated method stub
//		File f = new File("src\\test\\java");
//		File fs= new File(f,"ApiDemos-debug.apk");	
		
		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability("appiumVersion","1.9.1");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion","9");
		cap.setCapability("deviceOrientation", "portrait");
		cap.setCapability("deviceName", "Android");
		cap.setCapability("browserName", "");
		cap.setCapability("deviceType","phone");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		cap.setCapability("appPackage", "com.google.android.dialer");
		cap.setCapability("appActivity", "com.google.android.dialer.extensions.GoogleDialtactsActivity");
	//	cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	//	cap.setCapability(MobileCapabilityType.APP, "http://appium.s3.amazonaws.com/ApiDemos-debug-2015-03-19.apk");
		//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
	
		
		return driver;
	}

}
