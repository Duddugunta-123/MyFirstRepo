package TestNgPractice;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserExecution {
	@Test
	@Parameters("browser")
	public void cbt(String browser) {
		//System.setProperty("webdriver.edge.driver","./selenium/edgedriver.exe");
		//EdgeDriver driver=new  EdgeDriver();
		
		
		if(browser.equals("edge")) {
			System.out.println("edge browser is launched");
		}else {
			System.out.println("firefox browser is launched");
		}
	}

}
