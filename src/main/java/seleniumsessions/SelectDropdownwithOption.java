package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownwithOption {

	static WebDriver driver;
	//drop down-html
	//Select class

	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/en/hris-hr-software-demo/");

		By country = By.id("Form_getForm_Country");
		
		
		
		
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
//	public static void getDropdownText() {
//		
//		Select select = new Select(getElement(locator));
//		
//		List<WebElement> countryoptionList=select.getOptions();
//		
//		System.out.println(countryoptionList.size());
//		
//		for(WebElement e:countryoptionList ) {
//			
//			String text=e.getText();
//			System.out.println(text);
//			
//			
//		}
		
	}


