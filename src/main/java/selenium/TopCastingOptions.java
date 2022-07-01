package selenium;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		// 1. valid
		//WebDriver driver = new ChromeDriver();

		// 2. valid
		//WebDriver driver = new FirefoxDriver();

		// 3. valid -- remote execution
		// lets we have setup AWS Machine or some docker machine or some server we have
		// to give server ip address and the port number Along with the capabilities
		// like on which browser(chrome, firefox etc) we want to execution
		//WebDriver driver = new RemoteWebDriver(url, caps);

		// 4. not useful, because we don't get all required methods, we top casting with
		// WebDriver than that SearchContext methods is also available to use 
		//SearchContext driver = new ChromeDriver();

		// 5. not useful
		//SearchContext driver = new RemoteWebDriver(remoteAddress, capabilities);

		// 6. valid
	 // RemoteWebDriver driver = new ChromeDriver();
		
		//we cannot create object of chromium class, because there constructor is protected class

	}

}
