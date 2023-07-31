package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// SafariDriver driver = new SafariDriver();//this is only for mac machine,if
		// you want to run make enable allow remote automation

		// Enter the url

		driver.get("https://www.google.com");

		// get the title
		String title = driver.getTitle();
		System.out.println("actual title" + title);
		//driver.quit();// close the browser
		driver.close();

		//driver.getTitle();//session id is null
		//// "main" org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?

	}

}
