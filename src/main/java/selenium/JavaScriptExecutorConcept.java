package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {

		// Although selenium is just a library, that perform various action on browser
		// some time we have execute a many thing on application with help with java
		// script, because browser support java script, means what ever action we are
		// performing on this page everythings happening in javaScript, so what if we
		// want to create own javaScript, but in main language we are using java for
		// writing a script, so what to do?

		// execute js
		// JavaScriptExecutor will help to execute the JS

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);

		// jsUtil.generateAlert("hi this is my alert");
//				String pageText = jsUtil.getPageInnerText();
//				System.out.println(pageText);
//				System.out.println(pageText.contains("Marketing Campaigns"));

//				String title = jsUtil.getTitleByJS();
////				String title = driver.findElement(By.tagName("title")).getText();
//				System.out.println(title);

		// jsUtil.refreshBrowserByJS();
//				WebElement loginForm = driver.findElement(By.id("loginForm"));
//				jsUtil.drawBorder(loginForm);

//				WebElement email = driver.findElement(By.id("input-email"));
//				jsUtil.flash(email);
//				email.sendKeys("naveen@gmail.com");
//				
//				WebElement pwd = driver.findElement(By.id("input-password"));
//				jsUtil.flash(pwd);
//				pwd.sendKeys("test@123");

//				jsUtil.scrollPageDown();
//				Thread.sleep(2000);
//				jsUtil.scrollPageUp();

		// jsUtil.scrollPageDown("500");
//				WebElement ele = driver.findElement(By.xpath("//span[text()='Popular products in PC internationally']"));
//				jsUtil.scrollIntoView(ele);

		// infinite loading///lazy page loading

		WebElement reg = driver.findElement(By.linkText("Registry"));
		jsUtil.clickElementByJS(reg);
		// click, Actions-click : click is happening on the element on the page-- normal
		// user case
		// when click and action-click will not work, then sack of runing our script we
		// have to use this, but from end user point of view we donot use javaScript
		// click(JS click)
		// JSclick: clicking on the element by injecting the java script.

	}

}
