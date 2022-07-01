package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author Abhishek kumar write a program for back and forward button emulation
 *         emulation means- click on back button>click on forward button>click
 *         on back button>and so on on browser
 */

public class NavigationMethods {

	public static void main(String[] args) {

		// Use Ctrl+Shift+o to import all library that we required to run the current
		// script
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());

		// meths about 'get' method
		// 1. it wait till page is loading-- it wrong concept
		// 2. we cannot use back and forward emulation using 'get' method-- it totally a
		// wrong concept, we can use both 'get' and 'navigate.to' method for back and
		// forward emulation

		// meths about 'navigate .to' method
		// 1. it maintain the browser history-- it totally a wrong concept, it never
		// Maintain any browser history
		// 2. 'navigate.to' and 'get' method are two different methods-- it totally
		// wrong
		// both are synonyms both are do same job to launch/open a url in webpage, that
		// two methods are internally calling 'get' method only

		// But 'driver.navigate.to' method they have design to jump to some 3rd party
		// url sometimes -- it gives a clear flow that --
		// example -- we are working on google.com and suddenly we have to move to some
		// 3rd party url like-- youtube/tiwter/facebook page and do some operation and
		// come back to google.com--
		// in that case we can write a script where we can use 'driver.naviagete.to'

		// the only difference between 'get' and 'navigate.to' method is--
		// 'driver.navigate.to' method is overloaded method
		// 1st navigate is using 'string url' and 2nd navigate is using URL url

		// driver.navigate().to("https://www.amazon.com/");//string url-- this is synonyms of 'get' method 
		// driver.navigate().to(new URL("https://www.amazon.com"));//URL url-- this is
		// not synonyms of 'get' method as this is only available in naviagete.to method

		// what are the various option available with navigate
		// 1. we can go to any url
		// 2. back click
		// forward click
		// Refresh page

		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getTitle());

		driver.navigate().forward();
		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getTitle());

		driver.navigate().refresh();

		driver.quit();

	}

}
