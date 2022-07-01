package testNGPractice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest{

	

	@Test
	public void titleTest() {// It always a good practice to write a test word after each test method to
								// identify this is test method

		String title = driver.getTitle();
		System.out.println(title);
		// validation-- if dont need to write typical if else conditions
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");

		// Without a assertion we should never write a test, means test is incomplete
		// without assertion
	}

	@Test
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("amazon"));

	}

	@Test
	public void searchTest() {
		driver.get("https://www.amazon.com/");
		Assert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).isDisplayed());
	}

	
}
