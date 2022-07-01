package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAndDeselectCheckBox {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(2000);
		By choices = By.xpath("//span[@class='comboTreeItemTitle']");

		// all checkboxs selection
		selectChoice(choices, "all");
		Thread.sleep(1200);
		//all checkboxs deselection
		deselectChoice(choices, "all");

	}

	public static void selectChoice(By locator, String... value) {//if we write String[] it giving error 
		List<WebElement> choiceList= driver.findElements(locator);
		
		if(!value[0].equalsIgnoreCase("all")) {
			for(WebElement e:choiceList) {
				String text = e.getText();
				for(int i=0; i<value.length; i++) {
					if(text.equals(value[i])) {
						e.click();
						System.out.println("limited checkbox is chosen");
						break;
					}
				}
			}
		}else {
			//all selection logic
		try {	for(WebElement e : choiceList) {
				e.click();
			}
		}catch(ElementNotInteractableException e) {
			System.out.println("All selection is over");
		}
		}
			
		
	}

	public static void deselectChoice(By locator, String...value) {
		List<WebElement> choiceList= driver.findElements(locator);
	
		try {	for(WebElement e : choiceList) {
			e.click();
		}
	}catch(ElementNotInteractableException e) {
		System.out.println("All deselection is over");
	}
	}

}
