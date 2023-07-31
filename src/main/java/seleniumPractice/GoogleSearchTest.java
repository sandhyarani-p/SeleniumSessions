package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Bangalore Traffic");
		
		Thread.sleep(1000);
		
		List<WebElement> suggestionLIst=driver.findElements(By.xpath("//ul[@role='listbox']//div[@class='lnnVSe']"));
		System.out.println(suggestionLIst.size());
		for(WebElement e:suggestionLIst) {
			
			String text=e.getText();
			System.out.println(text);
			if(text.contains("twitter")) {
				e.click();
				break;
			}
		}
		
		
	}
	
	

}
