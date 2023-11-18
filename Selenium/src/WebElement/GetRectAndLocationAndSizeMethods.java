package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectAndLocationAndSizeMethods 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/fiction");
		WebElement element=driver.findElement(By.id("add-to-cart-button-45"));
		System.out.println("The x value is:"+element.getLocation().x);
		System.out.println("The y value is:"+element.getLocation().y);
		System.err.println("********************************");
		System.out.println("The Height is:"+element.getSize().height);
		System.out.println("The Width is:"+element.getSize().width);
		System.err.println("*********************************");
		System.out.println("The x value is:"+element.getRect().x);
		System.out.println("The y value is:"+element.getRect().y);
		System.out.println("The Height  is:"+element.getRect().height);
		System.out.println("The Width is:"+element.getRect().width);
		
	}

}
