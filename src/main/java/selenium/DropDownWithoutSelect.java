package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		// driver.findElement(By.id("Form_submitForm_Country")).sendKeys("India");

		List<WebElement> countryList = driver.findElements(By.xpath("//select[@id='Form_submitForm_Country']/option"));
		// if there is select tag in dropdown, there is always a option tag in html
		// code, to select there desire option---it is a rule in html to create a
		// dropdown

		// select[@id='Form_submitForm_Country']/option-- the single forward slas, means
		// direct--
		// these option is directly associated with a select, 
		//if we write double slas is
		// also fine, but it means direct + indirect

		for (WebElement e : countryList) {
			String text = e.getText();// getText capture the text 
			if (text.equals("India")) {
				e.click();
				break;
			}
		}
		driver.quit();
	}

}
