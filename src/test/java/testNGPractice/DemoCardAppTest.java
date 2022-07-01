package testNGPractice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoCardAppTest extends BaseTest{

	

	@Test(priority =2)
	public void titleTest() {// It always a good practice to write a test word after each test method to
								// identify this is test method

		String title = driver.getTitle();
		System.out.println(title);
		// validation-- if dont need to write typical if else conditions
		Assert.assertEquals(title, "Account Login");

		// Without a assertion we should never write a test, means test is incomplete
		// without assertion
	}

	@Test(priority =1)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("account/login"));

	}

	@Test(priority =0, enabled = false, description = "search test of demo test")
	public void searchTest() {
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		Assert.assertTrue(driver.findElement(By.name("search")).isDisplayed());
	}

	
}
