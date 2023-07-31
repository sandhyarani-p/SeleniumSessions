package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoScoreTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/west-indies-in-united-arab-emirates-2023-1376996/united-arab-emirates-vs-west-indies-2nd-odi-1377006/full-scorecard");

		Thread.sleep(1000);
		System.out.println(getwkTakerName("Brandon King"));
		;
		System.out.println(getwkTakerName("Johnson Charles"));

	}

	public static String getwkTakerName(String batsManName) {
		return driver
				.findElement(By.xpath("//span[text()='" + batsManName + "']/ancestor::td/following-sibling::td//span"))
				.getText();

	}

}
