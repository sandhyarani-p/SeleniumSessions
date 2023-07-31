package seleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		//Implicit wait apply after driver initialization
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Deprecated sel 3.x version
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Sel 4.x version
		
		//Implicitly wait is also called Global wait
		//Applicable for all the WebElements
		//once the element is found,it will not  wait for the remaining time ,it will ignore remaining time n continue
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("admin");//10 sec wait
		//e2--10 sec
		//e3--10 sec
		//e4--10sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//override to 20 sec,then after overwrite it will 
		//be applicable for all the elements
		//homepage--need20 sec
		//he1-20 sec
		//he2--20sec
		
		//if i want to change the wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//login page
		//e1-10sec
		//e2-10sec
		
		//reg page-0 secs,nullification of implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));//sel 4.x
		
		//Implicit wait disadvantage:
		//Performance issue
		//we keep checking the wait for all the elements
		//it will not support for non webElemente like title of the page,url,alert
		
		//so now we go for Explicit wait
		
		
		
		
		
		
		
		
		

	}

}
