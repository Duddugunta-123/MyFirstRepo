package WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/fiction");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("FirstName")).sendKeys("sumathi");
		Thread.sleep(3000);
		driver.findElement(By.id("LastName")).sendKeys("123");
		Thread.sleep(3000);
		
		driver.findElement(By.id("Email")).sendKeys("sumathiduddugunta236@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys("Sumathi@123");
		Thread.sleep(3000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Sumathi@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Register']")).submit();
		
	}
	

}
