package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		// Explicit wait
		// 2 types of explicit wait
		
		//1.WebDriverWait
		//2.Fluent Wait
		
		//WebDriverWait(Class)-->FluentWait(class)-->Wait(Interface):until();
		//inherit from FW        //unti(){}
		//no individual method   //+other methods
		
		//Explicit wait
		//not a global wait
		//will be applied for the specific element
		//Uname-10-->5 element display=5 ignore
		//p-EW-no applicable
		//login-Ew no applicable
		//can be applied for non webelements--url,title,alert
		//expected condition to meet
		
		WebDriver driver = new ChromeDriver();

	}

}
