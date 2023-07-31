package seleniumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseuoElementCheck {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		checkElementIsMandatory("input-firstname");

		// ::before/::after

		// JS:
//		
//		String script = "return window.getComputedStyle(document.querySelector(\"label[for='input-telephone']\"), '::before').getPropertyValue('content')";
//
//		
//		//JavascriptExecutor: Interface
//		
//		JavascriptExecutor js =(JavascriptExecutor)driver;
//		String mand_text = js.executeScript(script).toString();
//		
//		System.out.println(mand_text);
//		if(mand_text.contains("*")) {
//			System.out.println("Element is mandatory");
//			
//		}

	}

	public static void checkElementIsMandatory(String text) {
		String script = "return window.getComputedStyle(document.querySelector(\"label[for='"+text+"']\"), '::before').getPropertyValue('content')";

		// JavascriptExecutor: Interface

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String mand_text = js.executeScript(script).toString();

		System.out.println(mand_text);
		if (mand_text.contains("*")) {
			System.out.println("Element is mandatory");

		}
	}

}
