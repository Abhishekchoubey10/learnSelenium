package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCardRegister {
	public static  WebDriver driver;

	public static void main(String[] args) {


		 WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		By firstName = By.id("input-firstname");
		By LastName = By.id("input-lastname");
		By Email = By.id("input-email");
		By Telephone = By.id("input-telephone");
		By Password = By.id("input-password");
		By CPassword = By.id("input-confirm");
		By SubscribeYes = By.xpath("//label[@class='radio-inline']/input[@type ='radio' and @value= 1 ]");
		By SubscribeNo = By.xpath("//label[@class='radio-inline']/input[@type ='radio' and @value= 0 ]");
		By CheckBox = By.xpath("//input[@type ='checkbox' ]");
		By ContinueBtn = By.xpath("//input[@type ='submit' ]");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		doSendKeys(firstName, "Abhishek");
		doSendKeys(LastName, "Choubey");
		doSendKeys(Email, "abhishek10mar@gmail.com");
		doSendKeys(Telephone, "9311728660");
		doSendKeys(Password, "Abhishek@123");
		doSendKeys(CPassword, "Abhishek@123");
		doClick(SubscribeYes);
		doClick(CheckBox);
		doClick(ContinueBtn);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		WebElement ele = getElement(locator);
		ele.clear();
		ele.sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
}
