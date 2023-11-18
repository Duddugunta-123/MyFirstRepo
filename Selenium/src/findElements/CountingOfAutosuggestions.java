package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingOfAutosuggestions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
				
		 List<WebElement> suggestionsElements=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		 
		System.out.println(suggestionsElements.size());
		for (WebElement webElement : suggestionsElements) {
			System.out.println(webElement.getText());
		}
	}

}
