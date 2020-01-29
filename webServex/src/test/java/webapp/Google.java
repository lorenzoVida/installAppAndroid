package webapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "Android");
		cap.setCapability("platformName", "Android");
		cap.setCapability("browserName", "Chrome");
		cap.setCapability("noReset", true);
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe");
		
		
		//Instantiate Appium Driver
				AppiumDriver<MobileElement> driver = null;
				try {
					driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
					
				} catch (MalformedURLException e) {
					System.out.println(e.getMessage());
				}

		driver.get("https://www.google.com/");
	
	}

}
