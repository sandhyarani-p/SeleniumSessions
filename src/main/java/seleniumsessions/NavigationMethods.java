package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {


	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//driver.navigate().to("https://www.google.com");
		driver.navigate().to(new URL("https://www.amazon.com"));
		
		//There are 2 types of to() 1.takes string url and 2.takes URL url(new URL("https://www.amazon.com");
		
		
		//driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.com");//to() method is internally calling get ()
		
		//to() and get() both works the same way,no difference//to() is internally calling get()
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();//to load the page in case page not loaded
		
		//driver.quit();
		
	}
}
