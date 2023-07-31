package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	
	//check for frame presence when u get no such element even though the locator is correct
	//Frame- is a webelement/html element
	//Frame has its own DOM
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		
		//driver.switchTo().frame(2);// we dont prefer frame by index
		
		//driver.switchTo().frame("main");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
		
		String header=driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
		
		//to come back to main page
		driver.switchTo().defaultContent();
		//to know frame is present or not --right click n see view frame source 

	}

}
