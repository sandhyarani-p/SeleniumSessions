package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleTogether {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentwindowId = driver.getWindowHandle();
		Thread.sleep(2000);

		WebElement twter = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));

		WebElement fbook = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement linkedin = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		WebElement youtube = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));

		twter.click();
		fbook.click();
		linkedin.click();
		youtube.click();

		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();

		while (it.hasNext()) {

			String windowId = it.next();

			driver.switchTo().window(windowId);

			System.out.println(driver.getCurrentUrl());
			Thread.sleep(1500);
			
			if(!windowId.equals(parentwindowId)) {
			driver.close();
			}
		}
		
		driver.switchTo().window(parentwindowId);
		
		System.out.println("parent window url"+ driver.getCurrentUrl());

	}

}
