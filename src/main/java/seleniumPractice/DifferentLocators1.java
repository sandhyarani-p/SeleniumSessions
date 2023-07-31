package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators1 {

	
	static WebDriver driver;
	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		By firstname=By.id("input-firstname");
		
		By lastname =By.id("input-lastname");
		
		By email = By.name("email");
		By telephone=By.name("telephone");
		
		By password=By.name("password");
		
		By passconfirm= By.name("confirm");
		
		By radio = By.name("newsletter");
		
		
		By chkbox= By.name("agree");
		
		By submt = By.xpath("//input[@type='submit']");
		
		
//		
//		getElement(firstname).sendKeys("sandhya");
//		getElement(lastname).sendKeys("p");
//		getElement(email).sendKeys("tyetwy@gmail.com");
//		
		
		doSendKeys(firstname, "sandhya");
		doSendKeys(lastname, "p");
		doSendKeys(email, "test@gmail.com");
		doSendKeys(telephone, "898876565");
		doSendKeys(password, "76473hkj");
		doSendKeys(passconfirm, "76473hkj");
		doClick(radio);
		doClick(chkbox);
		doClick(submt);
		
		

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
