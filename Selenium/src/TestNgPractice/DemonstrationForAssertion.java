package TestNgPractice;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemonstrationForAssertion {
	@Test
	public void demo() {
		String expectedTitle="demo";
		String actualTitle="sam";
		//Hard Assert
		
		//assertEquals(actualTitle, expectedTitle);
		
		//Soft Assert
		SoftAssert soft=new SoftAssert();
//		soft.assertEquals(actualTitle, expectedTitle);
//		
//		System.out.println("done");
//		soft.assertAll();
		
//
		
		soft.assertNotEquals(actualTitle, expectedTitle);
		
		
		
		
	}

}
