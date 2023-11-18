package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("file:///C:/Users/sumathi/Desktop/webtech/html/selenium.html");
		driver.findElement(By.id("username")).sendKeys("In selenium");
		driver.findElement(By.name("password")).sendKeys("this is java");
		driver.findElement(By.className("password")).sendKeys("this is manual");
		driver.findElement(By.linkText("forgot password")).click();
		driver.findElement(By.partialLinkText("forgot")).click();
		}
}