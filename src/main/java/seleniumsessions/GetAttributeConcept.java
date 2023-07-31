package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {

	static WebDriver  driver;
	public static void main(String[] args) {
	
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By forgotpassword= By.linkText("Forgotten Password");
		By firstname =By.id("input-firstname");
		By logo_img= By.className("img-responsive");
		
		//this will get the attribute name say-->href="https://amazon.com"-->href is the attribute to get
//		String forgotpwd_href=driver.findElement(forgotpassword).getAttribute("href");
//		System.out.println(forgotpwd_href);
//		
//		String fn_placeholder_val=driver.findElement(firstname).getAttribute("placeholder");
//		System.out.println(fn_placeholder_val);
//		WebElement logo_ele=driver.findElement(logo_img);
//		String srcVal =logo_ele.getAttribute("src");
//		String titleVal =logo_ele.getAttribute("title");
//		String altVal =logo_ele.getAttribute("alt");
//		
//		System.out.println(srcVal);
//		System.out.println(titleVal);
//		System.out.println(altVal);
		
		String srcVal=getElementAttribute(logo_img, "src");
		System.out.println(srcVal);
		getElementAttribute(logo_img, "title");
		getElementAttribute(logo_img, "alt");
		getElementAttribute(firstname,  "placeholder");
		
}
	
	public static String getElementAttribute(By locator,String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
}