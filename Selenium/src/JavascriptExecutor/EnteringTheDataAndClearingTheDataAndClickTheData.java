package JavascriptExecutor;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnteringTheDataAndClearingTheDataAndClickTheData {
	public static void main(String[] args) throws InterruptedException {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the data");
		String s=scan.next();
		System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/fiction");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		//String data="GoodMorning";
		WebElement SearchStore = driver.findElement(By.id("small-searchterms"));
		WebElement SearchButton = driver.findElement(By.xpath("//input[@value='Search']"));
//		jse.executeScript("arguments[0].value='"+data+"'",SearchStore);
		jse.executeScript("arguments[0].value='"+s+"'",SearchStore);
		
		Thread.sleep(2000);
		
		jse.executeScript("arguments[0].value=' '",SearchButton);
		
		Thread.sleep(2000);
		
		jse.executeScript("arguments[0].click()",SearchButton);
		
		

}
}
