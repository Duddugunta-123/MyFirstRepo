package HandlingPopup;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {
public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		Runtime.getRuntime().exec("./AutoIT/basic.exe");

}
}
