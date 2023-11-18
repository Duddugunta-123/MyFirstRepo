package basics;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemonstrationOfGetMethod 
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
		ChromeDriver ref=new ChromeDriver();
		//get method
		ref.get("http://www.facebook.com");
		//getTitle method
		
		String expectedTitle="Facebook – log in or sign up";
		String actualTitle=ref.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("The testcase is passed");
			
		}
		else
		{
			System.out.println("The testcase is failed");
			
		}
		//getCurrentUrl
		System.out.println(ref.getCurrentUrl());
		System.out.println("*************************");
		//getPageSource
		System.out.println(ref.getPageSource());
	}

}
