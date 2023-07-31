package seleniumPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
	 selectEmp("Joe.Root");
	System.out.println( getEmpInfo("Joe.Root"));
	}

	
	public static void selectEmp(String empname) {
		 driver.findElement(By.xpath("//a[text()='"+empname+"']/parent::td/preceding-sibling::td/input")).click();
	}
	
	public static  List<String>  getEmpInfo(String emName) {
		List<WebElement> empInfoList=driver.findElements(By.xpath("//a[text()='"+emName+"']/parent::td/following-sibling::td"));
		System.out.println(empInfoList.size());
		
		List<String> infolist = new ArrayList<String>();
		for(WebElement e:empInfoList) {
			
			String text=e.getText();
			infolist.add(text);
		}
		return infolist;
	}
}
