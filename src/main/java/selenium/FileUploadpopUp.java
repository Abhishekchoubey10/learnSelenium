package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadpopUp {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		Thread.sleep(3000);

		// type = file is mandatory--when developer is creating upload file option, if
		// this is not present then we have to ask the developer to add a 'type' attribute= file
		// if we click on choose file button, it open windows drawer that is not handle
		// by selenium, so for better we can use sendKeys method
		driver.findElement(By.name("upfile")).sendKeys("/Users/naveenautomationlabs/Desktop/Cypress_vs_Playwright.png");

		// autoit -- only for windows OS

//			driver.findElement(By.xpath("//*[@id=\"__cond-30\"]/div/div/div/div/div/div/form/label/div/div[2]/div/button[1]"))
//					.sendKeys("/Users/naveenautomationlabs/Desktop/Cypress_vs_Playwright.png");

	}

}
