package HandlingPopup;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://demoapps.qspiders.com/browser");
		
		
		driver.findElement(By.linkText("Open in new window")).click();
		Set<String> allWindowId = driver.getWindowHandles();
		String parentId = driver.getWindowHandle();
		String expectedTitle="new Window";
		for (String Id : allWindowId) {
			driver.switchTo().window(Id);
			if (expectedTitle.equals(driver.getTitle())) {
				driver.manage().window().maximize();
				//driver.close();
				
			}
		
			
		}
		
		//driver.findElement(By.id("email")).sendKeys("sumathi1234");
			
		}
}

