package HandlingPopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//driver.get("https://kitchen.applitools.com/ingredients/file-picker");
		driver.get("http://the-internet.herokuapp.com/upload");
		
		//driver.findElement(By.id("photo-upload")).sendKeys("C:\\Users\\sumathi\\Desktop\\Company Resume.pdf");
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\sumathi\\Desktop\\Company Resume.pdf");
		
		//driver.findElement(By.id("file-submit")).click();
		
		//driver.findElement(By.id("drag-drop-upload")).click();	

}
}
