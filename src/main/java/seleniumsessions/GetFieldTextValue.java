package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetFieldTextValue {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By firstName = By.id("input-firstname");

		driver.findElement(firstName).sendKeys("naveenautomationlabs");

		String fn_val = driver.findElement(firstName).getAttribute("First Name");//here dont use getText().use getAttribute get the text entered
		//value attribute is holding the text entered
		System.out.println(fn_val);

	}

}
