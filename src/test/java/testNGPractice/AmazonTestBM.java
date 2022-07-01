package testNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTestBM {

	WebDriver driver;

	// We write BeforeMethod and Aftermethod then for each test new browser is launch
	// and then after the quit and again start for 2nd method and this process will
	// flow till all test case are done
	@BeforeMethod
	public void setup() {
		WebDriver driver = WebDriverManager.chromedriver().create();
		this.driver = driver;

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
	}

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
		Assert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).isDisplayed());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
