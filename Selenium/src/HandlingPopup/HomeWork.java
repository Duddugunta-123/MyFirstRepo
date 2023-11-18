package HandlingPopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/alert/alertCheck");
		
		driver.findElement(By.xpath("//button[text()='Open alert']")).click();
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//button[text()='×']")).click();
		
		driver.findElement(By.xpath("//button[text()='close']")).click();
		

}
}
