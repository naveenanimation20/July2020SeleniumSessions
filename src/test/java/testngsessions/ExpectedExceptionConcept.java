package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void divisionTest() {

		System.out.println("div test");

		int i = 9 / 3;
		System.out.println("hello");
		
		String str = "selenium";
		str = null;
		System.out.println(str.length());

	}

}
