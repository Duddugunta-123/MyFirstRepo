package HandlingPopup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://demoapps.qspiders.com/browser/multipleWindow");
		
		
		driver.findElement(By.xpath("//button[text()='Click to open multiple popup windows']")).click();
		Set<String> allMultipleWindowId= driver.getWindowHandles();
		String parentId = driver.getWindowHandle();
		
		
		allMultipleWindowId.remove(parentId);
		String expectedTitle="Basic Controls";
		for (String Id : allMultipleWindowId) {
			driver.switchTo().window(Id);
			if (driver.getTitle().contains(expectedTitle)) {
				break;
				
			}
		}
		
			
		
		//driver.findElement(By.id("username")).sendKeys("1234");
			
		}
}



