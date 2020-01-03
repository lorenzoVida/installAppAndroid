package sayCheese;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {
	
	
	public static void screenShot(WebDriver driver, String nombre) throws IOException {
		System.out.println("Evidencia capturada");
		TakesScreenshot src = (TakesScreenshot) driver;
		File source = src.getScreenshotAs(OutputType.FILE);
	//	FileUtils.copyFile(source,new File("D:\\EvidenciasAuto\\" + nombre));
		
		FileUtils.copyFile(source,new File("./evidencia/" + nombre));
	}

}
