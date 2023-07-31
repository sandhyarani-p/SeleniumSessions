package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		String actTitle=driver.getTitle();
		System.out.println(actTitle);
		
		if(actTitle.equals("Amazon.com. Spend less. Smile more.")) {
			System.out.println("test pass");
		}else {
			System.out.println("test fail");
		}
	}

}
