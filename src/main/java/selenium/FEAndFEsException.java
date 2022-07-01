package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FEAndFEsException {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");

		// list of Exception we have seen so far
		// IllelgalStateException--at time if we have not given System.setProperty or
		// WebDriverManager
		// StaleElementRefException
		// ElemntNotInteractableExceptionÂ
		// ElementNotFoundException -- not in selenium
		// NoSuchSessionException
		// TimeOutException
		// NoAlertException

		// driver.findElement(By.linkText("Customers1111")).click();
		// NoSuchElementException

		boolean flag = driver.findElement(By.linkText("Customers1111")).isDisplayed();
		System.out.println(flag);
		// NoSuchElementException
		// it not execute isDisplayed method because first it try to create a element
		// and found that element is not present on page
		// here we are not returning any collection, here we are returning WebElement
		// if WebElement is not got created or not found then it gives
		// "NoSuchElementException"

		// in case of driver.findElements
		// if element is not available or we have pass the wrong locater or element is
		// not available on the page--in that case it always return a empty list(means
		// size is '0')
		// in that case it not throws any exception
		// here we have using collection as 'footerList' that return empty collection
		// this is one of another difference from findElement
		List<WebElement> footerList = driver.findElements(By.xpath("//ul[@class='footer-nav11']//a"));
		System.out.println(footerList.size());// 0

		// wrong selector: InvalidSelectorException
		// if we are giving wrong xpath syntax or any like css syntax it gives
		// InvalidSelectorException
		// List<WebElement> footerList =
		// driver.findElements(By.xpath("@@@@ul@@[@class'footer-nav11']//a"));
		// System.out.println(footerList.size());// 0

		if (footerList.size() > 0) {
			System.out.println("footers are present on the page...");
			for (WebElement e : footerList) {
				String text = e.getText();
				System.out.println(text);
			}
		}

		// we can use findElements method for single link also
		// it uses to check the given element is present on page or not
//      if(driver.findElements(By.linkText("Customers")).size() > 0) {
//			System.out.println("customers link is present on the page");
//		}
		System.out.println(isElementPresent(By.linkText("Customers")));
	}

	public static boolean isElementPresent(By locator) {
		if (getElements(locator).size() > 0) {
			return true;
		}
		return false;
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
