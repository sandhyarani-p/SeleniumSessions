package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHandlingPopUp {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		// type = file -- 99.99% 
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\ADMIN\\Desktop\\Java Session notes");
		
		//for window--//c:\\
		
		//what if id type=file is not available?
		//1.ask your dev to add this attribute
		//2.Robot class -- not recommended --only windows .wont work for linux,mac,docker,cloud,jenkins,headless,grid
		//3.aotoIt-- not recommended --wont work for linux,mac,docker,cloud,jenkins,headless,grid
		//4.sikuli -- not recommended -- based on image only 

		
		//advisement pop up  --QA/STAGE?DEV?UAT- No Adv Pop up
		//only for production
		//no need to use switch to alert
		
		//random pop up-- should we automate?--never automate
		
		//browser window pop up
		
	}

}
