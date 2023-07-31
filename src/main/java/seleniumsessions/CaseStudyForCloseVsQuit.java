package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudyForCloseVsQuit {

	//1.case
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		
	//enter the url
		
		driver.get("https://www.google.com");
		
		
		//get the title
		String title =driver.getTitle();
		System.out.println("actual title"+title);
		
	
		driver.quit();//
		//SID--quit-->123-->null /close the browser sid-123-after quit sid is null
		//Exception in thread "main" org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		//driver.close();//
		//SID--close-->123->123--invalid sessionid after close

		driver.getTitle();//session id is null
		//// "main" org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		
		 driver = new ChromeDriver();
		
		
		//enter the url
			
			driver.get("https://www.google.com");
			
			
			//get the title
			driver.getTitle();
			System.out.println("actual title"+title);


	}
}
