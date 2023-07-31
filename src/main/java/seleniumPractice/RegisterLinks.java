package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterLinks {

	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<WebElement> Reglinks=driver.findElements(By.xpath("//div[@class='list-group']/a"));
		System.out.println(Reglinks.size());
		
		for(WebElement e: Reglinks) {
			String links= e.getText();
			System.out.println(links);
			if(links.equals("Register")) {
				e.click();
				break;
			}
		}

	}

}
