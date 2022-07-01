package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

//		WebElement country = driver.findElement(By.id("Form_submitForm_Country"));
		
//		//html tag = select -- dropdown
		// we have to use Select class in selenium to select a dropdown, if dropdown on
		// website is using select tag in there html code, otherwise select class is
		// not requird, because in some html code on other website developer use input
		// tag option instead of select
		//select is default class in selenium 
//		Select select = new Select(country);//we have put webelement inside the this constructor 
//		//select.selectByIndex(5);
//		select.selectByVisibleText("India");//text visible on website
//		//select.selectByValue("Algeria");//attribute value
//		
//		Thread.sleep(2000);
//		
//		WebElement state = driver.findElement(By.id("Form_submitForm_State"));
//		Select select1 = new Select(state);
//		select1.selectByVisibleText("Goa");

		By country = By.id("Form_submitForm_Country");
//		By state = By.id("Form_submitForm_State");
//		doSelectByVisibleText(country, "India");
//		Thread.sleep(2000);
//		doSelectByVisibleText(state, "Goa");

		Select select = new Select(driver.findElement(country));
		System.out.println(select.isMultiple());
		select.getAllSelectedOptions();

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

	public static void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
}
