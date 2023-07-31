package seleniumPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		By langlinks=By.xpath("//div[@id='SIvCob']/a");
		clickonElement(langlinks, "ಕನ್ನಡ");
		
	}
	
	 public static void clickonElement(By locator,String langText) {
		 List<WebElement> langlinks=driver.findElements(locator);
			
			System.out.println("total lang links"+langlinks.size());
			
			for(WebElement e: langlinks) {
				
				String link=e.getText();
				if(link.equals(langText)) {
					e.click();
					break;
				}
				System.out.println(link);
			}
	 }
	 
	 

}
