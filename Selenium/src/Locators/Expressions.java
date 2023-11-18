package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expressions 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("7671810016");
		//driver.get("https://demowebshop.tricentis.com/login");
		//driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("manual");
		//driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("sumathi");
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("java");
		//driver.findElement(By.cssSelector("input[id^='small']")).sendKeys("java");
		//driver.findElement(By.cssSelector("input[id$='terms']")).sendKeys("manual");
		//driver.findElement(By.cssSelector("input[id*='search']")).sendKeys("SQL");
		//driver.findElement(By.cssSelector("input[id='small-searchterms'][name='q']")).sendKeys("amma");
		driver.findElement(By.cssSelector("input#email")).sendKeys("abcd");
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("abcderg");
	      
		
	}

}
