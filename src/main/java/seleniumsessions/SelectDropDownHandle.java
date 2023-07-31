package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/en/hris-hr-software-demo/");

		By country = By.id("Form_getForm_Country");

		doSelectDropdownByIndex(country, 4);
		
		doSelectDropdownByVisibleText(country, "Brazil");
		
		doSelectDropdownByValue(country, "Afghanistan");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropdownByIndex(By locator, int index) {

		if (index < 0) {
			System.out.println("please pass right (+ve) index");
			return;
		}

		Select select = new Select(getElement(locator));

		select.selectByIndex(index);
	}

	public static void doSelectDropdownByVisibleText(By locator, String visibleText) {

		if (visibleText == null) {
			System.out.println("please pass right (visible Text");
			return;
		}

		Select select = new Select(getElement(locator));

		select.selectByVisibleText(visibleText);
	}
	
	
	public static void doSelectDropdownByValue(By locator, String value) {

		if (value == null) {
			System.out.println("please pass right value attribute");
			return;
		}

		Select select = new Select(getElement(locator));

		select.selectByValue(value);
	}
}
