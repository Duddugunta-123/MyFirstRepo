package Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptsForRegistrationPage {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		
		RegisterPage page=new RegisterPage(driver);
		
		
		page.getRegisterElement().click();
		
		
		Thread.sleep(2000);
		
		page.getClickElement().click();
		
		Thread.sleep(2000);
		
		page.getFirstNameElement().sendKeys("sumathi");
		
		Thread.sleep(2000);
		
		page.getLastNameElement().sendKeys("Duddugunta");
		
		Thread.sleep(2000);
		
		page.getEmailElement().sendKeys("sumathiduddugunta4@gmail.com");
		
		Thread.sleep(2000);
		
		page.getPasswordElement().sendKeys("Sumathi@123");
		
		Thread.sleep(2000);
		
		page.getConfirmPasswordElement().sendKeys("Sumathi@123");
		
		
		Thread.sleep(2000);
		
		page.getRegisterButtonElement().click();
	
	}
}
