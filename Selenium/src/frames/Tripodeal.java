package frames;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tripodeal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.tripodeal.com/hotels");
		
		driver.findElement(By.linkText("HOTEL")).click();
		
		driver.switchTo().frame("tpcwl_iframe");
			WebDriverWait wait=new WebDriverWait(driver, 100);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("destination")));
		
		driver.findElement(By.name("destination")).sendKeys("Banglore",Keys.ENTER);
		
		driver.switchTo().defaultContent();
		
		//driver.findElement(By.xpath("//input[@Placeholder='City or hotel name']")).sendKeys("Goa");
		
		driver.findElement(By.linkText("Kashmir")).click();
		
		
		

}
}
