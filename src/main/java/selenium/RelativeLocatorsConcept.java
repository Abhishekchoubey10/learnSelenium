package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsConcept {

	public static void main(String[] args) {
		// sel 4.x-- features
		// we use this features in web table
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");

		WebElement ele = driver.findElement(By.linkText("Saint-John, Canada"));

		// Before using a with method we have import static library manually by writing
		// a Library link, as i have written above the class name, we are using static
		// because with is static method
		// otherwise when we want to use with we have to write RelativeLocator.with
		// every time when we want to use with
		String index = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText(); // toRightof() is method it
																							// go to right side on
																							// element
		System.out.println(index);

		String rank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText(); // toLeftOf() is method it go
																							// to left side on element
		System.out.println(rank);

		String below = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(below);

		String above = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(above);

		String near = driver.findElement(with(By.tagName("p")).near(ele)).getText();// near() is method it go to its
																					// nearest locator, generally it go
																					// its parent locator
		System.out.println(near);

		List<WebElement> aboveList = driver.findElements(with(By.tagName("a")).above(ele));
		for (WebElement e : aboveList) {
			System.out.println(e.getText());
		}

	}

}
