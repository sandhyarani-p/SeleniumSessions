package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleOneByOne {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(1500);
		WebElement twiter = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		twiter.click();

		Set<String> handle = driver.getWindowHandles();

		Iterator<String> it = handle.iterator();

		String parentId = it.next();

		String childId = it.next();

		driver.switchTo().window(childId);

		System.out.println("twitter link clicked" + driver.getCurrentUrl());

		driver.close();

		driver.switchTo().window(parentId);
		WebElement fbook = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));

		fbook.click();
		driver.switchTo().window(childId);

		System.out.println("fb link clicked" + driver.getCurrentUrl());
//		driver.close();
//		driver.switchTo().window(parentId);
//		WebElement linkedin = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
//		linkedin.click();
//		
//		driver.switchTo().window(childId);
//		
//		System.out.println("Linked link clicked" + driver.getCurrentUrl());
//		driver.close();
//		driver.switchTo().window(parentId);
//		WebElement youtube = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
//		youtube.click();
//		driver.switchTo().window(childId);
//		System.out.println("youtube link clicked" + driver.getCurrentUrl());
//		driver.close();
//
//		driver.switchTo().window(parentId);
//		System.out.println("home page" + driver.getCurrentUrl());

	}

}
