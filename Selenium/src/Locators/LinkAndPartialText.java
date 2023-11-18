package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LinkAndPartialText
{
	
			public static void main(String[] args) 
			{
				System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.swiggy.com");
				//driver.findElement(By.linkText("Sign up")).click();
				//driver.findElement(By.linkText("Login")).click();
				//driver.findElement(By.tagName("a")).click();
				driver.findElement(By.partialLinkText("Sign")).click();

}
}
