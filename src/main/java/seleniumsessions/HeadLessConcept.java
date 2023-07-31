package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessConcept {

	public static void main(String[] args) {
		//headless--no browser opened
		//invisible browser//without UI
		//execution happening behind the scene
		//slightly faster than the normal browser
		//when to use headless mode-->Linux OS (no look n feel),Jenkins,Docker,NON UI environment
		
		//Disadvantage-->might not work for complex html,navigations,responsive testing-running ur tests on diff size of window
		
		ChromeOptions co = new ChromeOptions();
		//co.setHeadless(true);//deprecated
		co.addArguments("--headless");
		
		//co.addArguments("--headless=chrome");
		
		//co.addArguments("--headless");//this also works
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());;
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		
		//try for edge headless
		//safari - no support for headless
		

	}

}
