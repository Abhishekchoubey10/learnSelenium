package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {
	static WebDriver driver;

	public static void main(String[] args) {

		// 1. total links on the page
		// 2. print the text of each link
		// 3. exclude the blank text
		// 4. capture the text in a list and return

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		List<WebElement> linksList = driver.findElements(By.tagName("a"));// findElements method is used to find
																			// multiple elements
		// here we are search for all the elements are that is associated with tagName
		// 'a'
		// it return list of webelement so we have to store

		// Also remember findElement method return one webElement but findElements
		// method return list of webelement

		System.out.println("total links: " + linksList.size());

//		for(WebElement e : linksList) {
//			String text= e.getText();
		// System.out.println(text);// it print text of all WebElement, here we are
		// printing text of all links including blank text
		// there might be possible that some links have blank text
//			if(!text.isEmpty()) {
//				System.out.println(text);
//			}

//		}

//		for(int i=0; i<linksList.size(); i++) {
//		String text = linksList.get(i).getText();
//		if(!text.isEmpty()) {
//			System.out.println(text);
//		}
//	}

		By links = By.tagName("a");

		System.out.println("total links : " + getElements(links).size());

		List<String> eleTextList = getLinksTextList(links);
		System.out.println(eleTextList.size());
		System.out.println(eleTextList.contains("Sell"));

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static List<String> getLinksTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String text = e.getText();
			if (!text.isEmpty()) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}

}
