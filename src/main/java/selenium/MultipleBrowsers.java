package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleBrowsers {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		String parentWindowId = driver.getWindowHandle();

		// switching the domain:
		// this will not prefer, because end user will not open any new browser ot open
		// any link on current application, he simply open that link in new windows or
		// new tab,
		// so for that we use stichto.newWindow() option in selenium, it is new
		// feature added in selenium 4x
//		WebDriver driver1 = new ChromeDriver();
//		driver1.get("https://amazon.com");
//		driver1.close();

		// with the same domain:
		// this will also not prefer to use in different domain, but it is very useful
		// when we want to use same domain, means any link available on application and
		// we want to click to that open in same tab, then it will prefer
		// driver.navigate().to("amazon.com");

		// switch to a different domain:
		// this is correct way to switch a domain
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://amazon.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();

		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
