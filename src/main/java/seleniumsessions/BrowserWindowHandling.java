package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {

//no suchwindow Exception
		public static void main(String[] args) throws InterruptedException {

			WebDriver driver = new ChromeDriver();//Browser
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//w1
			Thread.sleep(3000);
			
			//target=_blank -->link opend in another tab
			
			driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
			//Fetching the window id's
			Set<String> handle =driver.getWindowHandles();
			
			Iterator<String> it =handle.iterator();
			
			String parentWindowid=it.next();
			System.out.println(parentWindowid);
			
			String childWindowId= it.next();
			System.out.println(childWindowId);
			
			//switch work
			driver.switchTo().window(childWindowId);
			System.out.println("child window url"+driver.getCurrentUrl());
			
			//close the child window
			
			driver.close();
			
			//come  back to parent window
			
			driver.switchTo().window(parentWindowid);
			
			System.out.println("parent window"+driver.getCurrentUrl());
			
			driver.quit();
			
			
			
	}

}
