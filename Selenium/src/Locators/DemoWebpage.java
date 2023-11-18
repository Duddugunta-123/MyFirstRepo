package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebpage 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.id("Email")).sendKeys("sumathiduddugunta236@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Sumathi@123");
		driver.findElement(By.linkText("ico-login")).click();
		
			
}
}
	
