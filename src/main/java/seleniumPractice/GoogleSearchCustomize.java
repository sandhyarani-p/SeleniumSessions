package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchCustomize {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");

		By searchlocator = By.name("q");
		By searchSuggLocator = By.xpath("//ul[@role='listbox']//div[@class='lnnVSe']");

		doSearch(searchlocator, searchSuggLocator, "Bangalore Traffic", "twitter");

	}

	public static void doSearch(By searchlocator, By searchSuggLocator, String searchKey, String suggName)
			throws InterruptedException {

		driver.findElement(searchlocator).sendKeys(searchKey);

		Thread.sleep(1000);

		List<WebElement> suggestionLIst = driver.findElements(searchSuggLocator);
		System.out.println(suggestionLIst.size());
		for (WebElement e : suggestionLIst) {

			String text = e.getText();
			System.out.println(text);
			if (text.contains(suggName)) {
				e.click();
				break;
			}
		}
	}

}
