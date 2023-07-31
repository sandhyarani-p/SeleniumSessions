package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoAssignment {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/west-indies-in-united-arab-emirates-2023-1376996/united-arab-emirates-vs-west-indies-2nd-odi-1377006/full-scorecard");

		Thread.sleep(1000);
		
		System.out.println(getScorecard("Johnson Charles"));;
		System.out.println(getScorecard("Brandon King"));;
		
	}
	
	public static List<WebElement> getScorecard(String batsman) {
		List<WebElement> scorecard=driver.findElements(By.xpath(("//span[text()='"+batsman+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]")));
		for(WebElement e :scorecard) {
			
			String score=e.getText();
			System.out.println(score);
		}
		return driver.findElements(By.xpath("//span[text()='Johnson Charles']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')])"));
	}

}
