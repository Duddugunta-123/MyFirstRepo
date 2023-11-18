package Swiggy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File photo=driver.findElement(By.linkText("Forgotten password?")).getScreenshotAs(OutputType.FILE);
		File file=new File("./errorshot/facebookscreenshot1.png");
	    photo.renameTo(file);
		//File photo=driver.findElement(By.id("email")).getScreenshotAs(OutputType.FILE);
		//File destination=new File("./errorshot/facebookscreenshot.png");
		//FileHandler.copy(photo, destination);
		//FileUtils.copyFile(photo, destination);
	}

}
