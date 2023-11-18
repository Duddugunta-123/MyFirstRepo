package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledAndDisplayedMethods
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.get("https://demowebshop.tricentis.com/fiction");
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(element.isEnabled());
		System.out.println("display status:"+element.isDisplayed());
		driver.findElement(By.name("username")).sendKeys("gdjhVDKbjfjsdabjhbnj");
		driver.findElement(By.name("password")).sendKeys("123456789");
		System.out.println(element.isEnabled());
		driver.findElement(By.linkText("Log in")).click();
		WebElement element1=driver.findElement(By.id("RememberMe"));
		System.out.println("selected status:"+element.isSelected());
		element.click();
		System.out.println("selected status:"+element.isSelected());
		
		
	}

}
