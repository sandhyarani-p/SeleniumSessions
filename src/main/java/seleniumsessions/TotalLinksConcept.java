package seleniumsessions;

import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksConcept {
			//open any url
			//get the count of the link on the page
			//print the text of the link on the console
	//but ignore the blank link
	static WebDriver  driver;
	public static void main(String[] args) {
	
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		By link = By.tagName("a");
		
		List<WebElement> linksList=driver.findElements(link);
		//return type of findElements is List<WebElement>
		//dynamic link
		//why WebElement--  we are collecting all the webElement links 
		
		int linksCount=linksList.size();
		System.out.println("Total links="+linksCount);
		
		//index based loop to pront links name
		
//		for(int i=0;i<linksCount;i++) {
//			
//			String text=linksList.get(i).getText();
//			if(!text.isEmpty()) {
//				System.out.println(i+":"+text);
//				
//			}
			int count=0;
			for(WebElement e:linksList) {
				String text1=e.getText();
			if(!text1.isEmpty()) {
				System.out.println(count+":"+text1);
				
			}
		
			count++;
		}
		
		
		
	}

}

		