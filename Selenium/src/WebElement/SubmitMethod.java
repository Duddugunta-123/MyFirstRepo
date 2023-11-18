package WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement element=driver.findElement(By.id("small-searchterms"));
		element.sendKeys("abc");
		Thread.sleep(1000);
		element.clear();
		Thread.sleep(1000);
		element.sendKeys("123");
		driver.findElement(By.xpath("//input[@value='Search']")).submit();
		driver.findElement(By.xpath("//input[@value='Search']")).submit();
		driver.findElement(By.xpath("//input[type='checkbox']")).click();

}
}
