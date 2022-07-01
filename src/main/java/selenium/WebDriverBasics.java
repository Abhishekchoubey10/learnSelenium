package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// win:
		// it work as mediater to interact selenium script to browser
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-java-2021-12-R-win32-x86\\chromedriver.exe");
		// where key is-- webdriver.chrome.driver
		// value is -- path of chrome driver exe file-
		// D:\\eclipse-java-2021-12-R-win32-x86\\chromedriver.exe
		// In windows we have to use two backward backslace(\)
		// In windows we have to write .exe
		// if we are using lunix or mac than .exe is not required in path

		// mac:
		// System.setProperty("webdriver.chrome.driver",
		// "/Users/naveenautomationlabs/Downloads/chromedriver");

		// Top Casting:
		// ChromeDriver class object can be referred by parent WebDriver Interface ref
		// variable
		WebDriver driver = new ChromeDriver();// launch chrome

		// if we donot pass https in URL it showing InvaildArgumentExeception
		// if we donot pass www. in URL it not showing any error, it simply launch the
		// browser , and shows some warning
		driver.get("https://www.google.com");// enter url
		String title = driver.getTitle(); // get the page title
		System.out.println(title);

		// validation point/ checkpoint/ act vs exp result / assertions
		if (title.equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("incorrect title");
		}

		//validate the getting url is same as we have pass 
		//if we want to print the getting url just write driver.getCurrentUrl()
		System.out.println(driver.getCurrentUrl().contains("google"));

		//validate the some text is present in our page source or not 
		//if we want to print the page source just pass driver.getPageSource()
		System.out.println(driver.getPageSource().contains("Copyright The Closure Library Authors"));
		// automation steps + //validation point/ checkpoint/ act vs exp result /
		// assertions
		// Automation Testing

		driver.quit();// close browser

	}

}
