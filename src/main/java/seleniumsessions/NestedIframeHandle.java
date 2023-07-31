package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframeHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//browser - chrome

		//page
		driver.get("https://selectorshub.com/iframe-scenario/");//page
		Thread.sleep(2000);
		
		//frame 1
		driver.switchTo().frame("pact1");
		
		driver.findElement(By.id("inp_val")).sendKeys("first crush");
		
		//frame 2
		driver.switchTo().frame("pact2");
		
		driver.findElement(By.id("jex")).sendKeys("current crush-jex");
		
		//frame 3
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("Destiny");
		
		//frame 2-pact2
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("jex")).sendKeys("current 2-updated");
		
		//cant switch from f3 to f1// also f1 to f3 not  possible
//		driver.switchTo().frame("pact1");
//		driver.findElement(By.id("inp_val")).sendKeys(" back to first crush");

		
		//frame1-pact1
		driver.switchTo().parentFrame();//sel 4.xversion feature
		driver.findElement(By.id("inp_val")).sendKeys("first crush-updated");
		
		//back to page/browser context
		
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		String h3Text=driver.findElement(By.tagName("h3")).getText();
		System.out.println(h3Text);
		
		
		//defaultcontent() will always go to main page
		
		
		
	
		
		
	}

}
