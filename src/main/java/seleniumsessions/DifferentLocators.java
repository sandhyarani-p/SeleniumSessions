package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {
	static WebDriver driver;
	public static void main(String[] args) {
		
		//1. ID- is always unique-Unique Locator(attribute)--Ist preference
		
		 driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	//	driver.findElement(By.id("")).sendKeys("");
		
		//2.NAME: can be unique or duplicate//99% Name will be unique(attribute)--II nd
		
	//	driver.findElement(By.name("")).sendKeys("");
		
		//3.CLASS NAME:can be duplicate and most of the time its duplicate(attribute)--IIIrd
		//class name is always space separated if multiple classes are used for the class attribute
		
	//	driver.findElement(By.className("")).sendKeys("");
		
		//4.Xpath-is not an attribute,Its a address of the element in html DOM
		//X means xml path
		
	
		
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("sandhya");
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("test123");
//		
//		driver.findElement(By.name("agree")).click();
//		
//		By 	fn_x_path=By.xpath("//*[@id=\\\"input-firstname\\\"]");
//		By ln_xpath=By.xpath("//*[@id=\\\"input-lastname\\\"]");
//		By pss_xpath=By.xpath("//*[@id=\"input-password\"]");
//		 By privacy_click=By.name("agree");
//		
//		doSendKeys(fn_x_path, "sandya");
//		doSendKeys(ln_xpath, "test1212");
//        doClick(privacy_click);
		
		//5.CSS SELECTOR --not an atrribute
		
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("sandhya");
//		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("test");
//		driver.findElement(By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)")).click();
		
		//6.LINK TEXT-not an attribute
		//only for the links and link text
		//can be duplicate
		
//		driver.findElement(By.linkText("Delivery Information")).click();
//		
//		By deliveryInfo=By.linkText("Delivery Information");
//		doClick(deliveryInfo);
		
		//7.Partial Link Text:-only for the the links-with the partial text of the link
		
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//8.TAG NAME:html tag,not an attribute
		//use tag name only when other locators not unique or not present
		
		//driver.findElement(By.tagName("input")).sendKeys("sandhya");
		String header=driver.findElement(By.tagName("h1")).getText();
		System.out.println(header);

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
		
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
