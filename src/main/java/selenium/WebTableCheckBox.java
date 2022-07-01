package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableCheckBox {
	 static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");


		selectCheckBox("Joe.Root");
		selectCheckBox("Garry.White");
		
		

	}
	public static void selectCheckBox(String name) {
		driver.findElement(By.xpath("//a[contains(text(), '"+name+"')]/parent::td/preceding-sibling::td/child::input[@type = 'checkbox']"))
		.click();
	}

}
