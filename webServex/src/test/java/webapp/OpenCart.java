package webapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class OpenCart {
	public AndroidDriver<AndroidElement> driver;

	@BeforeMethod
	public AndroidDriver<AndroidElement> setUp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "Android");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://opencart.abstracta.us/");
		return driver;
	}

	@Test
	public void ingresar() {

		System.out.println("ingresar");
	}

}
