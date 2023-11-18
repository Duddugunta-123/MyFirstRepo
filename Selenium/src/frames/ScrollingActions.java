package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingActions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.findElement(By.id("name")).sendKeys("selenium");
		
		driver.switchTo().frame("frm2");
		
		driver.findElement(By.id("firstName")).sendKeys("sumathi");
		
		driver.findElement(By.id("lastName")).sendKeys("Duddugunta");
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		jse.executeScript("scrollTo(0,500)");
		
		
		
	}

}
