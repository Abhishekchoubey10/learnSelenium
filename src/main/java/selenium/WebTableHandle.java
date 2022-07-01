package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/46026/gt-vs-csk-29th-match-indian-premier-league-2022");

		String WCName = getWicketTakerNmae("Rayudu");
		System.out.println(WCName);
		
		System.out.println(getScoreCardList("Rayudu"));
		System.out.println(getScoreCardList("Ruturaj Gaikwad"));
	}
	
	//use following-sibling option when we move to right hand side in webpage 
	public static String getWicketTakerNmae(String name) {
		String nameOfWicketTaker = driver
				.findElement(By.xpath("//a[contains(text(), '"+name+"') and @class ='cb-text-link'] /parent::div/following-sibling::div/span"))
				.getText();
		return nameOfWicketTaker;
	}
	
	public static List<String> getScoreCardList(String name) {
		List<String> scoreVal = new ArrayList<String>();
		List<WebElement> scoreList = driver
				.findElements(By.xpath("//a[contains(text(), '"+name+"') and @class ='cb-text-link'] /parent::div/following-sibling::div"));
		for (int i = 1; i < scoreList.size(); i++) {
			String score = scoreList.get(i).getText();
			scoreVal.add(score);
		}
		return scoreVal;
	}
	

}
