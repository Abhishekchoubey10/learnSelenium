package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTabHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		String parentWidnowId = driver.getWindowHandle();// getWindowsHandle will capture the id of current page
															// immediately

		driver.switchTo().newWindow(WindowType.TAB);// newWindow(WindowType.TAB) and newWindow(WindowType.WINDOW) is
													// selenium 4 feature
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.close();// close child window

		// back to parent window:
		driver.switchTo().window(parentWidnowId);
		System.out.println(driver.getTitle());

	}

}
