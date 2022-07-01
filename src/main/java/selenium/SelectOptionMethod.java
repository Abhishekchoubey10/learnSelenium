package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectOptionMethod {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By country = By.id("Form_submitForm_Country");
		By state = By.id("Form_submitForm_State");

		doSelectDropDownValue(country, "India");
		Thread.sleep(2000);
		doSelectDropDownValue(state, "Goa");

		// Select.deselect --- option where we can deselect a selected option, in some
		// application if some value is already selected then we can deselect that
		// option
		// the condition to use deselect option is dropdown should have select tag in
		// there html code
		// In some application multi selection dropdown is available and these options
		// are by default selected and we want to deselect that option that time we use
		// this method
		// or in some application first three option is always selected by default then
		// in that case, if we want to deselect that default selected option then we
		// have to use this deselect menthod

		// Select.isMultiple--- where isMultiple method will tell that wheater this
		// element supportes multiple support option at same time or not and there
		// return type is boolean

		// Select.getAllSelectedOptions--where getAllSelectedOptions method give list of
		// all selected option in dropdown 

//		Select select = new Select(driver.findElement(country));
//		List<WebElement> countryList = select.getOptions();//getOption method is used to get the options from dropdown
//		for(WebElement e : countryList) {
//			String text = e.getText();
//				if(text.equals("India")) {
//					e.click();
//					break;
//				}
//		}

//		Select select = new Select(driver.findElement(country));
//		List<WebElement> countryOptions = select.getOptions();
//		System.out.println(countryOptions.size());
//
//		for (WebElement e : countryOptions) {
//			String text = e.getText();
//			System.out.println(text);
//		}

//		System.out.println(doGetDropDownOptions(country).contains("India"));
//		doSelectByVisibleText(country, "India");
//		Thread.sleep(2000);
//		System.out.println(doGetDropDownOptions(state).contains("Goa"));
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

	public static List<String> doGetDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		List<String> optionsValList = new ArrayList<String>();
		System.out.println(optionsList.size());

		for (WebElement e : optionsList) {
			String text = e.getText();
			optionsValList.add(text);
		}
		return optionsValList;
	}

	public static void doSelectDropDownValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		for (WebElement e : optionsList) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}

}
