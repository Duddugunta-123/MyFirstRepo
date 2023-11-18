package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
		ChromeDriver ref=new ChromeDriver();
		ref.get("Monitors - Buy Computer, PC Monitor Online at Best Prices In India | Flipkart.com");
		ref.findElement(By.partialLink)t

}
