package TestNgPractice;

import org.testng.annotations.Test;

public class DemonstrationForInvocationCount {
	
	@Test(invocationCount = 10)
	public void login() {
		System.out.println("I am in login");
	}

}
