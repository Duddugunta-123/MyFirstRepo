package Project;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;

public class qsp {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./selenium/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://demoapps.qspiders.com/");
		
		driver.findElement(By.id("name")).sendKeys("sumathi");
		driver.findElement(By.id("email")).sendKeys("abcd@123");
		
		driver.findElement(By.id("password")).sendKeys("1234567");
		
		driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();
		
		driver.findElement(By.id("email")).sendKeys("duddugunta@123");
		
		driver.findElement(By.id("password")).sendKeys("67890");
		
		driver.findElement(By.xpath(" //button[contains(text(),'Login')]")).click();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//File photo = ts.getScreenshotAs(OutputType.FILE);
		File photo = driver.findElement(By.linkText("Don't have an account ? Register Now")).getScreenshotAs(OutputType.FILE);
		
		File file=new File("./errorshot/qsp1.png");
		photo.renameTo(file);
		
		
		
		
	}

}
