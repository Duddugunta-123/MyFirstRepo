package Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {
	
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		LoginPage page=new LoginPage(driver);
		page.getLoginLink().click();
		
		
		page.getEmailTB().sendKeys("selenium123");
		
		Thread.sleep(2000);
		
		page.getPasswordTB().sendKeys("123456");
		
		Thread.sleep(2000);
		
		page.getLoginButton().click();
	}

}
