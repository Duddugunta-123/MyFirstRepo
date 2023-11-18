package HandlingPopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PromptPopup {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
		//WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","./Selenium/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/alert/prompt");
		
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		
		Alert alert = driver.switchTo().alert();
		
	Thread.sleep(2000);
	
		alert.sendKeys("yes");
	Thread.sleep(2000);
		
		alert.accept();		
		//alert.dismiss();
		
		
		

}
}
