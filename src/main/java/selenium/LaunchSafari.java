package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchSafari {

	public static void main(String[] args) {

//there is not any .exe file(like--safari.exe),that is currently internally handle by 
		// selenium dev team only, so we donot need to setup any propety for safari and
		// safari is only work for mac machine
		//that selenium server for safari is provided by selenium internally 
		WebDriver driver = new SafariDriver();

		driver.get("https://www.google.com");// enter url
		String title = driver.getTitle(); // get thte page title -- Google
		System.out.println(title);

		driver.quit();

	}

}
