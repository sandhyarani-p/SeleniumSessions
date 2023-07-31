package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By regAccount = By.tagName("h1");
		
		//String text=getElement(regAccount).getText();;
		//System.out.println(text);
		
		String text=doElementGetText(regAccount);
		System.out.println(text);

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}
	
	public static String doElementGetText(By locator) {
		
		String eleText=getElement(locator).getText();
		return eleText;
		
	}

}
