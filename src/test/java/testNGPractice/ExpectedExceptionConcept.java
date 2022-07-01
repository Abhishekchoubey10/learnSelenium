package testNGPractice;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	String name;

	// use of this exception in real time scenario
	// For example if we have written 20 Test Cases and whenever we are giving a
	// demo and we donot have time and we really want to give all test cases get
	// passed or should be passed in that case we write expectedExectptions = Exception.class

	@Test(expectedExceptions = { NullPointerException.class, ArithmeticException.class }) // Here we are expecting two
																							// exception
	public void loginTest() {
		System.out.println("loginTest");
		int i = 9 / 0;
		ExpectedExceptionConcept obj = null;
		obj.name = "tom";
	}

}
