package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsAlertPopUp {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		
		// driver.findElement(By.name("proceed")).click();

		// if alert is not there: NoAlertPresentException: no such alert

		//we are switch from driver to alert
		Alert alert = driver.switchTo().alert(); // JS popup, confirmation, prompt

		String text = alert.getText();
		System.out.println(text);

		// alert.sendKeys("testing");

		alert.accept();// click on ok button

		// alert.dismiss(); //click on cancel button

		// alert and prompt is method in javaScript and these are not a webelement 
		// Example-Go to rediffmail.com and click on login button without filling any
		// login and password--it shows on alert having some text with ok button
		// we custom reproduce this alert go to console and write a script "alert(in
		// this field
		// write some text in single clon('))" and click enter--it customise display a
		// same alert on screen
		// this alert is not a WebElement, thats why we not able to inspect anything,
		// because there is not any locators and not able to create a xpath, where on
		// alert the button could be anything 'OK', 'Cancel', 'Yes', 'No' etc

	}

}
