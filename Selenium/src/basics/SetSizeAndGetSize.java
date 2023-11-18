package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeAndGetSize 
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		ChromeDriver ref=new ChromeDriver();
		ref.get("https://www.amazon.com");
		//System.out.println("The height is:"+ref.manage().window().getSize().height);
		//System.out.println("The width is:"+ref.manage().window().getSize().width);
		
		
	
		//Dimension d=new Dimension(1000,600);
		
		//ref.manage().window().setSize(d);
		//System.out.println(d);
		
		
		System.out.println("The X coordinate is:"+ref.manage().window().getPosition().x);
		System.out.println("The Y coordinate is:"+ref.manage().window().getPosition().y);
		Point p=new Point(400,100);
		ref.manage().window().setPosition(p);
		System.out.println(p);
}
}
