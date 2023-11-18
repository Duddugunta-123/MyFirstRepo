package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteScriptMethod {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		//jse.executeScript("scrollTo(0,500);");
		//jse.executeScript("scrollBy(0,300);");
		  jse.executeScript("alert(\'Good morning\');");
		  jse.executeScript("prompt('enter the name');");
	}
}