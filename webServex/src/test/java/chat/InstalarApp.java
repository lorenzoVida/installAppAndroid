package chat;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstalarApp {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		File f = new File("src/test/java/");
		File fs= new File(f,"ApiDemos-debug.apk");	
		
		DesiredCapabilities cap = new DesiredCapabilities();

	//	cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "AOSP on IA Emulator");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	//	cap.setCapability("deviceName", "Android");
	//	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
	//	cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
//		cap.setCapability("appPackage", "com.linkedin.android");
//		cap.setCapability("appActivity", "com.linkedin.android.authenticator.LaunchActivity");
//		cap.setCapability("noreset", true);
	//	cap.setCapability("autoWebview", true);
	//	cap.setCapability("appActivity", "com.linkedin.android.webrouter.webviewer.WebViewerActivity");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		//driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//	return driver;
	}

}
