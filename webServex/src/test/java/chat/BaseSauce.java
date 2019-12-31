package chat;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseSauce {
	public static final String USERNAME = "lorenzovida";
	public static final String ACCESS_KEY = "15ee86b1-ff21-44d4-8a6f-197f06eb0f57";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	public static String id;
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		 
		// TODO Auto-generated method stub
//		File f = new File("src\\test\\java");
//		File fs= new File(f,"ApiDemos-debug.apk");	
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("appiumVersion","1.9.1");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion","8.0");
		cap.setCapability("deviceOrientation", "portrait");
		cap.setCapability("deviceName", "Android Emulator");
		cap.setCapability("browserName", "");
		cap.setCapability("deviceType","phone");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
	//	cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	//	cap.setCapability(MobileCapabilityType.APP, "src/test/java/ApiDemos-debug.apk");
		cap.setCapability(MobileCapabilityType.APP, "http://appium.s3.amazonaws.com/ApiDemos-debug-2015-03-19.apk");
		//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
	
		
	//	AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL(URL),cap);
		id = ((RemoteWebDriver)driver).getSessionId().toString();
		
		return driver;
	}

}
