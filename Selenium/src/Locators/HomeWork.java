package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		//driver.findElement(By.linkText("login")).click();
		//driver.findElement(By.className("login")).sendKeys("7671810016");
		driver.findElement(By.partialLinkText("gin")).click();
		
		
	}
	

}