package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyswithNull {

	static WebDriver  driver;
	public static void main(String[] args) {
	
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		By firstName = By.id("input-firstname");
		
		driver.findElement(firstName).sendKeys(null);//this will not enter anything give exception illegal argument exception
		driver.findElement(firstName).sendKeys("");
		driver.findElement(firstName).sendKeys(" ");
		//driver.findElement(firstName).sendKeys(123);compile time error
		driver.findElement(firstName).sendKeys("123");
		
		String str ="sandhya";
		StringBuilder sb = new StringBuilder("Automation");
		StringBuffer sf = new StringBuffer("Labs");
		
		
		//SendKeys(charSequence..keysto send)
		driver.findElement(firstName).sendKeys(str+" "+sb+" "+sf);
		
		driver.findElement(firstName).sendKeys(str,sb,sf);
	}

}
