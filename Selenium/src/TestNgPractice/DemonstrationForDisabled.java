package TestNgPractice;

import org.testng.annotations.Test;

public class DemonstrationForDisabled {
	@Test(priority = 10)
	public void login() {
		System.out.println("I am from login");
	}
	@Test(priority = 0)
	public void home() {
		System.out.println("I am in home");
	}
	@Test(priority = -1,enabled = false)
	public void logout() {
		System.out.println("I am logout");
	}

}
