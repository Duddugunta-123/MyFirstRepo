package DOM;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM {
	public static void main(String[] args) throws InterruptedException {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the data");
		String s=scan.next();
		System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("chrome://downloads/");
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		//driver.findElement(By.id("searchInput")).sendKeys("fjghhg");
		Object obj = jse.executeScript("return document.querySelector(\"body > downloads-manager\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")");
		
		WebElement element=(WebElement) obj;
		
		element.sendKeys("gdhksjbgdjhbs");
		

}
}
