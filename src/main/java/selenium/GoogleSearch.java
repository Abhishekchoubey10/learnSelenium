package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Naveen Automation Labs");
		Thread.sleep(3000);

		// when we have search any thing on google it shows number of option and to
		// collect all option
		// Actually on google all suggestion are represented by 'ul' Tag, then after all
		// suggestion are under individual 'li' tag
		// ul--means unorder list
		//li---means list
		

		List<WebElement> suggList = driver
				.findElements(By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']//span"));

		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains("interview questions")) {
				e.click();
				break;
			}
		}

		// return list<String> with all suggestions

	}

}
