package TestNgPractice;

import org.testng.annotations.Test;

public class DemonstrationForDependsOnMethods {
	
	@Test
	public void login() {
		System.out.println("I am from login");
	}
	
	@Test(dependsOnMethods = "login")
	public void home() {
		System.out.println("I am in home");
	}
	
	@Test(dependsOnMethods = "login")
	public void logout() {
		System.out.println("I am logout");
	}
	
	
	


}
