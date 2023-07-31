package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();// w2
		Thread.sleep(2000);

		// fetching window Id's

		Set<String> handle = driver.getWindowHandles();

		// set to list conversion

		List<String> handleList = new ArrayList<>(handle);

		String parentWindowId = handleList.get(0);

		String childIdWindowId = handleList.get(1);

		// 2. switch work:
		driver.switchTo().window(childIdWindowId);

		System.out.println(driver.getTitle());

		// close the child window:
		driver.close();// driver--lost

		// come back to parent window:
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window url: " + driver.getCurrentUrl());

		driver.quit();

	}

}
