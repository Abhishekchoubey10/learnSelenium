package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");// here id:password@url is given
		// if in password @ or something else is there than this will not work, because
		// after @ it consider a url
		// Authorize popup are not a javascript popup
		//it means username, password popup
		// this authirise popup will show when we setup our modem
		// when we are login a company server
		// when webpage is not ready
		// If we pass id and password along with url, it will not shows any authorize
		// popup, it simplify login a page

		// CDP(chrome dev protocause) -auth - selenium 4.x
		//it will handle authorize popup in selenium and element the earlier limitation
	}

}
