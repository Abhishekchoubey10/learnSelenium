package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConceopt {

	public static void main(String[] args) {
		// element1 --> element2 drag and drop is allow from selenium

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		WebElement sourceEle = driver.findElement(By.id("draggable"));
		WebElement targetEle = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);// this class is already available in selenium, so we have create a object of
											// this class and in this class there is not any default constructor so we
											// have pass a driver

//				act
//				.clickAndHold(sourceEle)
//				.moveToElement(targetEle)
//				.release()
//				.build().perform();

		// build method is use to check how many actions we have, it will build all
		// these actions--means it collect all the action and arrange in the same
		// sequence and they are ready to be perform

		// perform method is used to perfrom the action in same sequence

		// without build and perform we cannot do any user action

		// direct method to perform all there action(clickAndHold, moveToElement and
		// release) on element
		// it mandatory to use a perform or build and perform method after a action
		// if we write one action the only perform method is sufficient to perform a
		// action, because here build method is not required
		act.dragAndDrop(sourceEle, targetEle).perform();
		// act.dragAndDrop(sourceEle, targetEle).build().perform();;
		// act.dragAndDrop(sourceEle, targetEle).build();//NA--Not Applicable

	}

}
