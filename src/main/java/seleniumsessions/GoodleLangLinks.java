package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoodleLangLinks {

	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://www.google.com");
		
		By langLink = By.xpath("//div[@id='SIvCob']/a");
		clickOnElement(langLink, "ಕನ್ನಡ");
			
		}
		
		public static void clickOnElement(By locator,String linkText) {
			List<WebElement> langlinks=driver.findElements(locator);
			
			System.out.println("total number of links"+langlinks.size());
			
			for(WebElement e: langlinks) {
				
				String text=e.getText();;
				System.out.println(text);
				if(text.equals(linkText)){
					e.click();
					break;
				}
		}
	}

}
