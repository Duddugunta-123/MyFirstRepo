package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/fiction");
		driver.findElement(By.linkText("Log in")).click();
		//driver.findElement(By.cssSelector("//label[text()='Female']")).click();
		//driver.findElement(By.cssSelector("label[for='FirstName']")).sendKeys("sumathi");
		//driver.findElement(By.name("First name")).sendKeys("123");
		//driver.findElement(By.id("FirstName")).sendKeys("1234");
		driver.findElement(By.id("Email")).sendKeys("sumathiduddugunta236@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Sumathi@123");
		driver.findElement(By.xpath("//label[text()='Remember me?']")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).submit();
		
		
	}

}
