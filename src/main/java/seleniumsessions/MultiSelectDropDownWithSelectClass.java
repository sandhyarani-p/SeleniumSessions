package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownWithSelectClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		
		WebElement dropdownElement=driver.findElement(By.xpath("//select[@multiple]"));
		
		Select select = new Select(dropdownElement);
		
		if(select.isMultiple()) {
			
			System.out.println("multiselection is possible");
			select.selectByVisibleText("American flamingo");
			select.selectByVisibleText("Chilean flamingo");
			select.selectByVisibleText("Lesser flamingo");
			select.selectByVisibleText("James's flamingo");
			
		}
		
		select.deselectByVisibleText("Lesser flamingo");
		select.deselectAll();
	}

}
