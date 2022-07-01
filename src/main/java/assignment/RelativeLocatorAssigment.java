package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorAssigment {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");

		WebElement ele = driver.findElement(By.xpath("//label[@class = 'radio-inline']/input[@value ='1']"));

		ele.click();
		Thread.sleep(2000);
		driver.findElement(with(By.tagName("label")).toRightOf(ele)).click();

		
		WebElement priv = driver.findElement(By.xpath("//a[@class ='agree']"));
		driver.findElement(with(By.tagName("input")).toRightOf(priv)).click();
		
	}

}
