package HandlingPopup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleTab {
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		driver.get("https://demoapps.qspiders.com/browser/newTab");


		driver.findElement(By.xpath("//button[text()='Open window in new Tab']")).click();
		Set<String> allTabId = driver.getWindowHandles();
		//String parentId = driver.getWindowHandle();
		String expectedTitle="new Window";
		for (String Id : allTabId) {
			driver.switchTo().window(Id);
			
			if (driver.getTitle().contains(expectedTitle)) {
				System.out.println("if block");
				break;	
			}
			else {
				System.out.println("else block");
			}
		}
		driver.switchTo().frame(0);
		driver.findElement(By.id("username")).sendKeys("kghdhHk");




	}
}


