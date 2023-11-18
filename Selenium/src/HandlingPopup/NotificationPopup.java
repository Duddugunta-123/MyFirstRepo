package HandlingPopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions option=new ChromeOptions();
		//to handle notification popup
		option.addArguments("--disable-notifications");
		//option.addArguments(" --disable-extensions");
		//to open browser in incognito mode
		option.addArguments("--incognito");
		// to open browser in maximized mode
		
		option.addArguments("start-maximized");
		//to open browser in headless mode
		option.addArguments("--headless");
		WebDriver driver=new ChromeDriver(option);
		System.out.println("browser is launched");
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/");
		System.out.println("Browser is navigated to Ajio");
		//driver.findElement(By.xpath("//button[text()='Notification']")).click();
		driver.quit();
		System.out.println("Browser is closed");

}
}
