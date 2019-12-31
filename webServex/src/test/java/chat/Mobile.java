package chat;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Mobile {
public AndroidDriver<AndroidElement> driver;
public static final String USERNAME = "lorenzovida";
public static final String ACCESS_KEY = "15b061a6-42d1-4492-84e1-fb371bd7a36d";
public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

    @BeforeMethod
	public AndroidDriver<AndroidElement> setUp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8");
		cap.setCapability("deviceName", "Android Emulator");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
	//	cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability("appPackage", "com.linkedin.android");
		cap.setCapability("appActivity", "com.linkedin.android.authenticator.LaunchActivity");
		cap.setCapability("noreset", true);
	//	cap.setCapability("autoWebview", true);
	//	cap.setCapability("appActivity", "com.linkedin.android.webrouter.webviewer.WebViewerActivity");
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		//driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
    
    @Test
    public void ingresar() {
    	//driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
    	driver.findElementByXPath("//android.widget.Button[@text='¿Ya tienes una cuenta? Inicia sesión']").click();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.findElementByXPath("//android.widget.TextView[@text='lorenzo.v.more@gmail.com']").click();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.findElementById("com.linkedin.android:id/growth_login_join_fragment_password").sendKeys("KayaNow86");
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.findElementByXPath("//android.widget.Button[@text='INICIA SESIÓN']").click();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    //	driver.findElementByXPath("//android.widget.TextView[@index='1']").click();
    	driver.findElementById("com.linkedin.android:id/feed_recycler_view").click();
    //	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    //	driver.findElementByXPath("//android.widget.TextView[@index='1']").click();
    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Selenium\"));");
    	
    }
}
