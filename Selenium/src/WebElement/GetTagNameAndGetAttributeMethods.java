package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameAndGetAttributeMethods
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement element=driver.findElement(By.name("email"));
		System.out.println(element.getTagName());
		System.out.println(element.getAttribute("class"));
		System.out.println(element.getAttribute("placeholder"));
		//System.out.println(element.getAttribute("value"));
		System.err.println("***********************");
		element.sendKeys("abcdef1234");
		System.out.println(element.getAttribute("value"));
		System.out.println(driver.findElement(By.linkText("Forgotten password?")).getAttribute("href"));
		
		
		
	}

}
