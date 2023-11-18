package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingOfCheckbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.get("https://demoapps.qspiders.com/checkbox");
		 List<WebElement> checkboxes = driver.findElements(By.xpath("a"));
		System.out.println(links.size());
		
		for (WebElement webElement : links) {
			System.out.println(webElement.getText());
			System.out.println(webElement.getAttribute("href"));
		}
		
	}

}
