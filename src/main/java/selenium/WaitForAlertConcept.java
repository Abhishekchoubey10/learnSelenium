package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForAlertConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();

		// driver.switchTo().alert();-- we donot need to write this line of code as
		// alert is present, then it automatically switch to alert
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//	Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		//alert.accept();
	}

	public static Alert waitForAlert(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return  wait.until(ExpectedConditions.alertIsPresent());
	}
	public static void acceptAlert(int timeout){
		waitForAlert(timeout).accept();
	}
	public static void dismissAlert(int timeout){
		waitForAlert(timeout).dismiss();
	}
	public static String getAlertText(int timeout) {
		return waitForAlert(timeout).getText();
	}
}
