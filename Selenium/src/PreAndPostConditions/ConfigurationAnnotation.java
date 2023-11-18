package PreAndPostConditions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotation {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}
	
//	@Test
//	public void method1() {
//		System.out.println("from method1");
//	}
//	@Test
//	public void method2() {
//		System.out.println("from method2");
//	}
//	@Test
//	public void method3() {
//		System.out.println("from method3");
//	}
	
	@Test
	public void Class1() {
		System.out.println("from class1");
	}
	@Test
	public void Class2() {
		System.out.println("from class2 ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
