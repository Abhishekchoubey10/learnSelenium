package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
static WebDriver driver;
	public static void main(String[] args)throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver ();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Naveen Automation Labs");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@role=\"listbox\"]/li//div[@class=\"wM6W7d WggQGd\"]//span")).click();

	}

}
