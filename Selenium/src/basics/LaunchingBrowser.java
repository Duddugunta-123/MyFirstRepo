package basics;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingBrowser
	{
		public static void main(String [] args)
		{
			System.setProperty("webdriver.gecko.driver","./Selenium/geckodriver.exe");
			FirefoxDriver ref=new FirefoxDriver();
			
			
		}
		

	}



