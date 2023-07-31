package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalGetAttributeHref {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

		By links= By.tagName("a");

		List<WebElement> linList = driver.findElements(links);

		System.out.println("total images = " + linList.size());

		for (WebElement e : linList) {
			String href_val = e.getAttribute("href");
			
			System.out.println(href_val );//web scraping
		}

	}

}
