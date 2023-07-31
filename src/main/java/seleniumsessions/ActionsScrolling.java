package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		Actions act = new Actions(driver);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.PAGE_DOWN).perform(); 	
//		Thread.sleep(1000);
//		act.sendKeys(Keys.PAGE_UP).perform(); 	

		// control+KEYDOWN--to come to bottom of the page

	//	act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		Thread.sleep(1000);

		// control+KEYUP--(to go back to top of the page)

		//act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
	//	act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();

		
		//scrollTo Element
		
		act.scrollToElement(driver.findElement(By.linkText("Help"))).
		click(driver.findElement(By.linkText("Help"))).
		click().build().perform();
		
		//refresh with keyboard action
		act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).build().perform();
		//Or the below
		driver.navigate().refresh();
		
		
	}

}
