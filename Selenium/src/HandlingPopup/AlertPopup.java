package HandlingPopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(2000);
		
		//driver.switchTo().alert();
		
		//driver.switchTo().alert().accept();
		
		driver.switchTo().alert().dismiss();
		
	
}
}
