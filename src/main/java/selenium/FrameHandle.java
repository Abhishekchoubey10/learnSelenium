package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		// if any webelemnet in inside a frame, then driver is directly not interact
		// with these webelement, for this we have switch our driver to frame from main
		// page, then
		// present webelement is interact with driver

		// there is 3 way's to switch and interact with frame

		// 1st method
		// driver.switchTo().frame(2);--where 2 define the index of frame, means on
		// frame html dom, there is more than 1 frame, where 1st frame--index is 0 and
		// 2nd frame index is 1

		// 2nd method
		// driver.switchTo().frame("main");--where main is value of name attribute in
		// frame

		// frame is also a web element:
		// frame has its own HTML DOM : #document
		// html tags: frame, iframe
		// NoSuchFrameException: no such frame : In case frame is not present

		// 3rd method
		driver.switchTo().frame(driver.findElement(By.name("main")));

		String header = driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(header);

		// Selenium 4 feature--
		// driver.switchTo().parentFrame();

		// form this we can with to parent frame from child frame
		// driver.switchTo().parentFrame();

		// Get out with the frame and come back on main page
		driver.switchTo().defaultContent();// main page

		// Realtime example of Frame used application is--
		// Salesforce UI

		// random pop up: limitation
		// we cannot handle these popup, these are advertisement popup, that display on
		// production enviroment, in qa enviroment we have to disable that popup
		// QA : disable adv. pop ups

	}

}
