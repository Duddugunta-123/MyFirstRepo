package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotAs {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File tempFile=ts.getScreenshotAs(OutputType.FILE);
		String PresentDateAndTime=LocalDateTime.now().toString().replace(':','_');
		FileHandler.copy(tempFile, new File("./errorshot/google"+PresentDateAndTime+".jpg"));
		
	}


		
	
	
	
	}


