package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegieterTest {
	
	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver= brUtil.launchBrowser("chrome");
		brUtil.enterurl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		System.out.println(brUtil.getPageTitle());
		
		By firstName=By.id("input-firstname");
		By lastname=By.name("lastname");
		By email_id = By.xpath("//*[@id=\"input-email\"]");
		By telephone = By.cssSelector("#input-telephone");
		By password=By.id("input-password");
		By password_confirm=By.xpath("//*[@id=\"input-confirm\"]");
		
		By privacyclick=By.name("agree");
		By continuebtn =By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		ElementUtil eleUtl = new ElementUtil(driver);
		eleUtl.doSendKeys(firstName, "sandhya");
		eleUtl.doSendKeys(lastname, "p");
		eleUtl.doSendKeys(email_id, "sandhyap1@gmail.com");
		eleUtl.doSendKeys(telephone, "989988822");
		eleUtl.doSendKeys(password, "test@12344");
		eleUtl.doSendKeys(password_confirm, "test@12344");
		eleUtl.doClick(privacyclick);
		eleUtl.doClick(continuebtn);
		
		String accountText=driver.findElement(By.tagName("h1")).getText();
		
		if(accountText.equalsIgnoreCase("Your Account Has Been Created!")) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
		//driver.findElement(By.tagName(null))
		
		
	}

}
