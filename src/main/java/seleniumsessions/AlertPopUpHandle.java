package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		// JavaScript pop up or modal dialog
		// 1.Alert pop up
		// 2.prompt alert (enter something with ok /cancel)
		// 3.confirmation alert(are you sure to delete)

		// https://the-internet.herokuapp.com/javascript_alerts

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		// 1.
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();// accept the alert
		// alert.dismiss();// org.openqa.selenium.NoAlertPresentException: no such alert

		// 2.confirm

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

		Alert alert1 = driver.switchTo().alert();
		String text1 = alert.getText();
		System.out.println(text1);
		alert1.accept();

		// 3.Prompt

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

		Alert alert2 = driver.switchTo().alert();
		String text2 = alert.getText();
		System.out.println(text2);
		Thread.sleep(2000);
		alert2.sendKeys("Test automation");
		alert2.accept();
		
		String msg=driver.findElement(By.id("result")).getText();
		System.out.println(msg);
		
		String actText=msg.split(":")[1].trim();
		System.out.println(actText);
		

	}

}
