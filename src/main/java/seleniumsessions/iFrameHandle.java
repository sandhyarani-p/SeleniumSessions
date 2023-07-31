package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		
		//frame/iFrames are used to provide layer of security
		WebDriver driver = new ChromeDriver();//browser - chrome

		//page
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page
		Thread.sleep(3000);
		
		//page element
		driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iFrame[contains(@id,'frame-one')]")));
		///frame element
		
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("sandhya");
		
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Bangalore");
		
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("2023-06-23");
		driver.findElement(By.name("RESULT_TextArea-5")).sendKeys("this is description text area");
		
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\ADMIN\\Desktop\\Java Session notes");
		
		//coming back to the main page
		driver.switchTo().defaultContent();
		
		//page element:
				String info = driver.findElement(By.id("tooltip")).getText();
				System.out.println(info);
	}

}
