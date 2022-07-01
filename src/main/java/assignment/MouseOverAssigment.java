package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverAssigment {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		By parentMenu = By.xpath("//a[@class='dropdown-toggle meganav-shop']");
		By childMenu1 = By.linkText("Foodgrains, Oil & Masala");
		By subChildMenu2 = By.linkText("Dals & Pulses");
		By subChildMenu3 = By.linkText("Toor, Channa & Moong Dal");
		
		selectSubMenu(parentMenu, childMenu1, subChildMenu2, subChildMenu3);

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void selectSubMenu(By parentMenu, By childMenu1, By subChildMenu2, By subChildMenu3)
			throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(2000);
		act.moveToElement(getElement(childMenu1)).perform();
		Thread.sleep(2000);
		act.moveToElement(getElement(subChildMenu2)).perform();
		Thread.sleep(2000);
		getElement(subChildMenu3).click();

	}


}
