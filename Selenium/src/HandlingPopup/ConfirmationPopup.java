package HandlingPopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/alert/confirm");
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert alert = driver.switchTo().alert();
		
		//alert.accept();
		
		Thread.sleep(2000);
		
		//alert.dismiss();
		Thread.sleep(2000);
       // System.out.println(alert.getText());
		
		//alert.sendKeys("selenium");
		
		
		
}
}
