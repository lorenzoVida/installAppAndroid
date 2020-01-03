package webapp;

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

public class WebServex {
	public AndroidDriver<AndroidElement> driver;
	@BeforeMethod
	public AndroidDriver<AndroidElement> setUp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();

//		cap.setCapability("platformName", "Android");
//		cap.setCapability("platformVersion","8");
		cap.setCapability("deviceName", "Android");
//		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
	//	cap.setCapability("noreset", true);
	//	cap.setCapability("autoWebview", true);
	//	cap.setCapability("appActivity", "com.linkedin.android.webrouter.webviewer.WebViewerActivity");
	//	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		
		//driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.servex.com.pe/");
		return driver;
	}
	
	 @Test
	    public void ingresar() {
	    	//driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	    	driver.get("http://www.servex.com.pe/");
	    	}
}
