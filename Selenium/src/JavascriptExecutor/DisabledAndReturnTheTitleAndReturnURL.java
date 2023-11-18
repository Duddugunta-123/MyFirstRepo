package JavascriptExecutor;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledAndReturnTheTitleAndReturnURL {
	public static void main(String[] args) throws InterruptedException {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the data");
		String s=scan.next();
		System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/sumathi/Desktop/webtech/html/selenium.html");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.id("username"));
		
		jse.executeScript("arguments[0].value='fdgfgnvb'",element);
		System.out.println(jse.executeScript("return document.title"));
		System.out.println(jse.executeScript("return window.location.href"));

}
}
