package seleniumsessions;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementExceptionConcept {

	static WebDriver  driver;
	public static void main(String[] args) {
	
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By registerHeader = By.tagName("h1");
		By forgotpassword= By.linkText("Forgotten Password11");//wrong value is entered as link text
		
		//interview: if findElements what it will give when elements are having invalid loactor-->gives Empty list
		try{driver.findElement(forgotpassword).click();//we get no such element exception,when locator is not correct
		//(NoSuchElementExceptionConcept.java:18)
		}
		catch (NoSuchElementException e) {
			
			System.out.println("");
			e.printStackTrace();
		}
		
		System.out.println(driver.getTitle());//this will not execute because there is a exception in the above line due to invalid lacator
	}

}
