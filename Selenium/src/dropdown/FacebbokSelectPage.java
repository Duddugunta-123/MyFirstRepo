package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebbokSelectPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.get("https://www.facebook.com/reg/");
		
		
		Select daySelect=new Select(driver.findElement(By.id("day")));
		List<WebElement> dayAllOptions = daySelect.getOptions();
		for(WebElement WebElement:dayAllOptions)
		{
			WebElement.click();
		}
		Thread.sleep(2000);
		Select monthSelect=new Select(driver.findElement(By.id("month")));
		List<WebElement> monthAllOptions = monthSelect.getOptions();
		for(WebElement WebElement:monthAllOptions)
		{
			WebElement.click();
		}
		Thread.sleep(2000);
		Select yearSelect=new Select(driver.findElement(By.id("year")));
		List<WebElement> yearAllOptions = yearSelect.getOptions();
		for(WebElement WebElement:yearAllOptions)
		{
			WebElement.click();
		}
	}

}
