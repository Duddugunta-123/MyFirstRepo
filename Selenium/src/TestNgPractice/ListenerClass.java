package TestNgPractice;

import static org.junit.Assert.assertFalse;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerImplementation.class)
public class ListenerClass {
	@Test
	public void sample() {
		
		System.out.println("from testcase");
		assertFalse(true);
	}

}
