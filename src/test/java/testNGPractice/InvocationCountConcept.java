package testNGPractice;

import org.testng.annotations.Test;

public class InvocationCountConcept {

	// I want to execute these test cases more than one times--
	// instead of writing this test same test method more than one times, that is
	// unneccasy a TDS jobs and we are writing a duplicate code again and again, we
	// use invocation count options

	// we can also use this when we are doing API Testing, where we really want to
	// test a same test cases back to back

	// Invocation count should always be imteger

	@Test(invocationCount = 3, priority = 2)
	public void loginTest() {
		System.out.println("loginTest");
	}

	@Test(invocationCount = 2, priority = 1)
	public void homePageTest() {
		System.out.println("loginTest");
	}
}
