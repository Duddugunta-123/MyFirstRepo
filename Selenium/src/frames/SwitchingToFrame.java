package frames;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingToFrame {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='notification-frame-~10cb43881']"));
		driver.switchTo().frame(frame);
		//driver.switchTo().frame("notification-frame-~10cb43881");
		
		//driver.switchTo().frame(3);
		
		

}
}
