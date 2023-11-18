package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemonstrationOfSelectClass {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("file:///E:/Sumathi/dropdown.html");
	
		WebElement dropdown = driver.findElement(By.id("multiple"));																																																																																																																																																																																																																																										
		Select select=new Select(dropdown);
		System.out.println(select.isMultiple());
		//select.selectByValue("3");
		Thread.sleep(2000);
		
		//select.selectByVisibleText("selenium");
		Thread.sleep(2000);
		select.selectByIndex(0);
		Thread.sleep(2000);
		
//		select.deselectByIndex(0);
//		Thread.sleep(2000);
//		select.deselectByValue("3");
//		Thread.sleep(2000);
//		select.deselectByVisibleText("selenium");
//		Thread.sleep(2000);
		
		//select.deselectAll();
	
		
		
		
									
		
	}

}
