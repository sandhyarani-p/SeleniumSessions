package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksListxpath {


	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='list-group']/a"));
		System.out.println(links.size());
		
		for(WebElement e:links) {
			
			String totallinksText=e.getText();
			
			
			System.out.println(totallinksText);
		}
		
		
	}

}
