package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title = brUtil.getPageTitle();
		System.out.println(title);

		System.out.println(brUtil.getPageUrl());

		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@type='submit']");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(email, "abhishek10mar@gmail.com");
		eleUtil.doSendKeys(password, "Abhishek@123");
		eleUtil.doclick(loginBtn);

		//brUtil.quitBrowser();

	}

}
