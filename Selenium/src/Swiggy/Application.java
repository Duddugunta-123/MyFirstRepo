package Swiggy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		WebElement element=driver.findElement(By.id("location"));
		element.sendKeys("Banglore");
		element.clear();
		driver.findElement(By.linkText("FIND FOOD")).click();
		driver.findElement(By.xpath("//type='text']")).submit();
		System.out.println(element.getText());
		System.out.println(element.getAttribute("id"));
		System.out.println(element.getTagName());
		System.out.println(element.getCssValue("background-color"));

		
		
	}

}
