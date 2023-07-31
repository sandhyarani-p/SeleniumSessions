package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//open the browser
		//ChromeDriver driver = new ChromeDriver();
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		//EdgeDriver driver = new EdgeDriver();
		
		WebDriver driver = new ChromeDriver();
		
		
	//SafariDriver driver = new SafariDriver();//this is only for mac machine,if you want to run make enable allow remote automation 
		
		//Enter the url
		
		driver.get("https://www.google.com");
		
		
		//get the title
		String title =driver.getTitle();
		System.out.println("actual title"+title);
		
		//verify the title:actual vs expected:checkpoint /verification point
		
		if(title.equals("Google")) {
			
			System.out.println("correct title");
		}
		else {
			System.out.println("in-correct title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		//if you want to check some text in pagesource then u can use contains
		System.out.println(driver.getPageSource().contains("put your text to check"));
		//automation testing -->automation steps+verification(act vs exp)
		
		driver.quit();//close the browser
		
	//	driver.getTitle();
		// "main" org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		

	}

}
