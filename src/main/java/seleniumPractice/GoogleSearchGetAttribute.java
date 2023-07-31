package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchGetAttribute {

	
	static WebDriver driver;
	public static void main(String[] args) {
	
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		List<WebElement> langlinks=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		for(WebElement e:langlinks) {
			
			String attr=e.getAttribute("href");
			System.out.println(attr);
			
		}
		

	}

}
