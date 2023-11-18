package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ts {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./selenium/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://demowebshop.tricentis.com/fiction");
		
		
		//File photo =(File) driver.findElement(By.xpath("//div[@class='block block-category-navigation']")).findElement(By.partialLinkText("Books"));
		
		//File destination=new File("./errorshot/demoelement.jpg");
		
		//FileUtils.copyFile(photo, destination);
		
		
		//driver.findElement(By.id("name")).sendKeys("sumathi");
		
		//driver.findElement(By.id("email")).sendKeys("sumathiduddugunta236@gmail.com");
		
		
		
		
	}

}
