package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {


	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver = new ChromeDriver();
		
		 driver.get("http://mrbool.com/search/");

		 driver.findElement(By.className("menulink"));
		WebElement parentmenu= driver.findElement(By.className("menulink"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(parentmenu).build().perform();
		//act.moveToElement(parentmenu).perform();  this also works fine ,when we have single action can use both 
		driver.findElement(By.linkText("COURSES")).click();
		
		
		
		
	}

}
