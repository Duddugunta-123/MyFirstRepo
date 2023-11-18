package HandlingPopup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://demoapps.qspiders.com/browser/multipleTabs");
		
		
		driver.findElement(By.xpath("//button[text()='Click to open multiple tabs']")).click();
		Set<String> allMultipleTabId= driver.getWindowHandles();
		String parentId = driver.getWindowHandle();
		
		
		allMultipleTabId.remove(parentId);
		String expectedTitle="Basic Controls";
		for (String Id : allMultipleTabId) {
			driver.switchTo().window(Id);
			if (driver.getTitle().contains(expectedTitle)) {
				break;
			
		}
			
		}
}
}



