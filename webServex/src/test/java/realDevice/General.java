package realDevice;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.util.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class General {
	public AndroidDriver<AndroidElement> driver;
	
	@BeforeMethod
	public AndroidDriver<AndroidElement> setUp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion","8");
		cap.setCapability("deviceName", "Android");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
	//	cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability("appPackage", "com.androidsample.generalstore");
		//cap.setCapability("appActivity", "com.androidsample.generalstore.MainActivity");
		cap.setCapability("appActivity", ".SplashActivity");
		
	//	cap.setCapability("noreset", true);
	//	cap.setCapability("autoWebview", true);
	//	cap.setCapability("appActivity", "com.linkedin.android.webrouter.webviewer.WebViewerActivity");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		
		//driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	
	  @Test
	    public void seleccionarPais() {
	    	//driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	    	driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
	    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
	    	driver.findElementByXPath("//android.widget.TextView[@text='Argentina']").click();
	    	driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
	    	
	    	String nameAlert= driver.findElementByXPath("//android.widget.Toast[1]").getAttribute("name");
	    	System.out.println(nameAlert);
	    	assertEquals("Please enter your name", nameAlert);
	    	}
}
