package chat;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Dialer extends BaseDialer {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("llegamos");
		Thread.sleep(3000);
		driver.findElementById("com.google.android.dialer:id/fab").click();
		driver.findElementByXPath("//android.widget.TextView[@text='9']").click();
		Thread.sleep(3000);
		driver.findElementById("com.google.android.dialer:id/dialpad_floating_action_button").click();
	}

}
