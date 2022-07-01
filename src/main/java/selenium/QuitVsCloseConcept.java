package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsCloseConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-java-2021-12-R-win32-x86\\chromedriver.exe");// to
																												// start
																												// the
																												// server,
																												// where
																												// path
																												// of
																												// exe
																												// file
																												// is
																												// given
		// to create a debugger simply click two time on line scale, then one point got
		// created that is called debugger point
		WebDriver driver = new ChromeDriver();// launch chrome-- lets consider session Id - 123
		driver.get("https://www.google.com");// enter url
		String title = driver.getTitle(); // get thte page title
		System.out.println(title);

		driver.quit();// quit browser- // it will close entire windows browser 
		// NoSuchSessionException
		//Session id is null, using webDriver After calling quit?
		
		// driver.close();//close browser // it will close current windows browser 
		// System.out.println(driver.getTitle());//? 
		// NoSuchSessionException: invalid session id

		// re-initialization of the driver
		//at every time when we re-initialize the driver then new session id is created 
		driver = new ChromeDriver();// launch chrome -lets consider new session Id is- 324
		driver.get("https://www.google.com");// enter url
		title = driver.getTitle(); // get thte page title -- Google
		System.out.println(title);
	}

}
