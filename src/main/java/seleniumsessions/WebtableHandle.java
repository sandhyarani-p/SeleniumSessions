package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		selectEmp("Joe.Root");
		selectEmp("Garry.White");
		System.out.println(getEmpInfo("Joe.Root"));
		System.out.println(getEmpInfo("Garry.White"));
		getEmpInfo("Joe.Root");
	}
	
	public static void selectEmp(String emp) {
		
		driver.findElement(By.xpath("//a[text()='"+emp+"']/parent::td/preceding-sibling::td/child::input[@type='checkbox']")).click();
		
	}
	
	public static List<String> getEmpInfo(String empname) {
		List<WebElement> empInfolist= driver.findElements(By.xpath("//a[text()='"+empname+"']/parent::td/following-sibling::td"));
		System.out.println(empInfolist.size());
		
		List<String> infoValList = new ArrayList<String>();
		for(WebElement e:empInfolist) {
			String text=e.getText();
			infoValList.add(text);
			System.out.println(e);
		}
		return infoValList;
	}

}
