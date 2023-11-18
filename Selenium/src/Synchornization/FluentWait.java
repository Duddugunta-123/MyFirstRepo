package Synchornization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	Wait<WebDriver> ref=new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofSeconds(6))
			.ignoring(NoSuchElementException.class);
	ref.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
	driver.findElement(By.name("email")).sendKeys("Good morning");
	


}
}
