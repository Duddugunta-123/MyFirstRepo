package Synchornization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWaitMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		for(int i=0;i<100;i++) {
			try {
				driver.findElement(By.name("email")).sendKeys("Good");
				break;
			} catch (Exception e) {
				System.out.println(i);
			
			}
		}
		
		
	}

}
