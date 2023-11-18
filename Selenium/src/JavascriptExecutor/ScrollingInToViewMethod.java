package JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingInToViewMethod {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/fiction");
		WebElement element=driver.findElement(By.xpath("//strong[text()='Product tags']"));
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		//jse.executeScript("arguments[0].scrollIntoView(true)",element);
		//jse.executeScript("arguments[0].scrollIntoView(false)",element);
		
		//jse.executeScript("scrollBy(0,200)");
		
		//jse.executeScript("scrollBy(0,200)");
		
		jse.executeScript("scrollTo(0,200)");
		
		jse.executeScript("scrollTo(0,200)");
	}

}
																																			