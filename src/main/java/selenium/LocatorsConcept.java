package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		// webElement--whatever(Every field) we see on the webpage is called webElemnt--
		// like search, button, checkbooks,
		// dropdown, some written field like comment box, header text, label, text
		// field, link etc

		// always remember when we have create WebElement then after we have to perform
		// some actions--
		// Create WebElement + Perform Actions(click, sendKeys, isDisplayed, getText)

		// 1st Approach to create WebElemets
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");// findElement is method and 
		// 'By' is class, In By class various methods is available from which we have
		// used 'id' method in that code, sendKeys is also a method
//		driver.findElement(By.id("input-password")).sendKeys("test@123");

		// 2nd Approach to create WebElemets
		// this approach is better than 1st one, whenever we have to enter value, we
		// only use these variable and no need to create webElement again
		// disadvantage
		// if we have created 10 WebElement and right now use only two webElement than
		// this approach selenium unnecessary sending request all created webelement to
		// server(that unnecessary busy the server) that use in future
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		//10 WE
//		emailId.sendKeys("naveen@gmail.com");
//		password.sendKeys("test@123");

		// 3rd Approach to create WebElements
		// using By Locators
		// here we just maintain By locators, whenever a need to create a WebElement we
		// just create webElement and perform some action
		// Advantage
		// 1. we just maintain By locators also called Object reprositary(OR) with the
		// form of By locators
		// here we are not interacting with the server unnecessary when we are not using
		// that webElement
		//
//		By email = By.id("input-email");//it returning 'By' Class reference , 
		// where we are storing By class reference in 'email' variable
//		By password = By.id("input-password");
//		
//		WebElement emaiId = driver.findElement(email);//it create a webElent and when we call driver.findElements 
		// then it interact with selenium server
//		WebElement pwd = driver.findElement(password);
//		
//		emaiId.sendKeys("test@gmail.com");
//		pwd.sendKeys("test@123");

		// 4.Approach to create WebElements
		// By locator: generic function
		// here we have create webElement in one static menthod and call that webElement
		// we need that webElement, here we donot need to create webEleement again when
		// we want to create new webElemrnt we just call that webelement and pass the By
		// locators reference
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//
//		getElement(email).sendKeys("test@gmail.com");
//		getElement(password).sendKeys("test@123");

		// 5.Approach to create WebElements
		// By locator: generic functions (GE, actions)
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//		
//		doSendKeys(email, "test@gmail.com");//here email is By locator reference and 'test@gmail.com' is value 
//		doSendKeys(password, "test@123");

		// 6. Approach to create WebElements
		// locator: generic functions (GE, actions) in a Utility class
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(email, "test@gmail.com");
//		eleUtil.doSendKeys(password, "test@123");

		// 7:Approach to create WebElements
	//use BrowserUtil and ElementUtil

		// 8. Approach to create WebElements
		//String locators --> By Locator
		//In some company the are using String locator and create By locator using that String locators 
		//In some company they are using simply a By locators 
		String email_id = "input-email";
		String password_id = "input-password";

		ElementUtil eleUtil = new ElementUtil(driver);

		By email = eleUtil.getBy("id", email_id);
		By password = eleUtil.getBy("id", password_id);

		eleUtil.doSendKeys(email, "test@gmail.com");
		eleUtil.doSendKeys(password, "test@123");
	}

	public static By getBy(String locatorType, String locatorValue) {
		By locator = null;
		switch (locatorType.toLowerCase()) {
		case "id":
			locator = By.id(locatorValue);
			break;

		default:
			break;
		}
		return locator;

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

}
