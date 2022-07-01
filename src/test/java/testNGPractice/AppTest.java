package testNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {

	// 1. global pre conditions
	// 2. Pre conditions // for both global pre conditons and pre condition testNG
	// provides some annotations
	// 3. test steps + actual vs exp results
	// 4. post steps //for this again testNG provides some annotations

	/**
	 * BS - connectWithDB BT - createUser BC - launchBrowser
	 * 
	 * BM - login to App page header test AM - logout
	 * 
	 * BM - login to App user is logged in AM - logout
	 * 
	 * BM - login to App page title test AM - logout
	 * 
	 * AC - closeBrowser AT - deleteUser AS - disconnectWithDB
	 */

	//BeforeSuite is execute before BeforeTest 
	
	// Which will be executed between BeforeTest and BeforeClass
	// It always execute BeforeTest first, BeforeTest is not about Before@Test, it
	// means Before All the Test Cases, BeforeTest annotation will be executed
	// BeforeClass means-- It running before the BeforeMethod and After BeforeTest

	// We cannot create duplicate method of any Before and After annotations
	// But we can create duplicate annotations of Test, like 100, 200 and so on

	// If we have Zero Test annotations -- then there is no point to write a Test
	// class without a Test annotations 
	//Test annotations is a main Test case, that we have to write 

	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS - connectWithDB");
	}

	@BeforeTest
	public void createUser() {
		System.out.println("BT - createUser");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC - launchBrowser");
	}

	@BeforeMethod
	public void login() {
		System.out.println("BM - login to App");
	}

	@Test
	public void titleTest() {
		System.out.println("page title test");
	}

	@Test
	public void headerTest() {
		System.out.println("page header test");
	}

	@Test
	public void isUserLoggedInTest() {
		System.out.println("user is logged in");
	}

	@AfterMethod
	public void logout() {
		System.out.println("AM - logout");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("AC - closeBrowser");
	}

	@AfterTest
	public void deleteUser() {
		System.out.println("AT - deleteUser");
	}

	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS - disconnectWithDB");
	}

}
