package HandlingPopup;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopupUsingAutoIt {
		public static void main(String[] args) throws InterruptedException, AWTException, IOException {
				
				
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();

				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.ilovepdf.com/word_to_pdf");
				
				driver.findElement(By.id("pickfiles")).click();
				
				//Runtime.getRuntime().exec("./AutoIT/fileupload.exe");
				
				Runtime.getRuntime().exec("./AutoIt/fileupload.exe");
				

}
}
