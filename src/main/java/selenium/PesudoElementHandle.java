package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PesudoElementHandle {

	public static void main(String[] args) {

		WebDriver driver = WebDriverManager.chromedriver().create();
		// here create method will give us WebDriver instance, so we have store that
		// WebDriver reference directly, after that we donot need to write --- WebDriver
		// driver = new ChromeDriver();

		// WebDriver driver = new ChromeDriver(); // no need to write this line
		driver.get("https://demo.opencart.com/index.php?route=account/register");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('content')";
		String mand_text = js.executeScript(script).toString();
		System.out.println(mand_text);

	}

}
