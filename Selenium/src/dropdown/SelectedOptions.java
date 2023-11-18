package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectedOptions {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("file:///E:/Sumathi/dropdown.html");
	
		WebElement dropdown = driver.findElement(By.id("multiple"));																																																																																																																																																																																																																																										
		Select select=new Select(dropdown);
		System.out.println(select.isMultiple());
		select.selectByValue("3");
		Thread.sleep(2000);
		
		select.selectByVisibleText("selenium");
		Thread.sleep(2000);
		select.selectByIndex(0);
		Thread.sleep(2000);
		System.out.println(select.getFirstSelectedOption().getText());
		//you want to get the all selected options
		List<WebElement>  allSelectedOptions= select.getAllSelectedOptions();
	
		for(WebElement option: allSelectedOptions)
	    {
			System.out.println(option.getText());
		}
	
	//you want to the print the text
		List<WebElement>  allSelectedOptions1= select.getOptions();
		
		for(WebElement option: allSelectedOptions1)
		{
			System.out.println(option.getText());
		}
		//using all options and click method
		
	List<WebElement>  allOptions= select.getOptions();	
	for(WebElement option: allOptions)	{
		//System.out.println(option.getText());
			option.click();
	}
		//System.out.println(select.getOptions());
		
		//Another way using for loop and we use the size the method to get the size
		for(int i=0;i<allOptions.size();i++)
		{			
			select.selectByIndex(i);
		}
		

}
}


