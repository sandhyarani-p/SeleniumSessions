package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterColumncheck {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		Thread.sleep(5000);
		
		System.out.println(getFooterHeaderText("blog"));;
		System.out.println(getFooterHeaderText("Amazon Science"));
		System.out.println(getFooterHeaderText("Careers"));;
		System.out.println(getFooterHeaderText("Help"));;
		
		//a[text()='Amazon Science']/parent::li/parent::ul/parent::div/div
		////a[text()='Amazon Science']/parent::li/parent::ul/preceding-sibling::div
		
		
	}
	
	public static String getFooterHeaderText(String footerText) {
		String footerHeaderText=driver.findElement(By.xpath("//a[text()='"+footerText+"']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div")).getText();
		System.out.println(footerHeaderText);
		
		
		return footerHeaderText;
	}
			//a[text()='Joe.Root']/parent::td/preceding-sibling::td/child::input[@type='checkbox']
			//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']
			//a[text()='Joe.Root']/parent::td/following-sibling::td
}
