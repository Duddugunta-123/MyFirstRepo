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



public class TroubleShotAs {
	public static void main(String[] args) {
		
	
	
			System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
            TakesScreenshot ts=(TakesScreenshot) driver;
           File photo=ts.getScreenshotAs(OutputType.FILE);
           File file=new File("./errorshot/google.png");
           photo.renameTo(file);
            }

	

}
