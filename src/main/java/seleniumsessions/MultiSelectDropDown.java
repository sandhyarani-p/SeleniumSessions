package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	//multiple selection with the select tag
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/attribute/select-multiple");
		
		WebElement dropdownEle = driver.findElement(By.xpath(""));
		
		Select select = new Select(dropdownEle);

		if(select.isMultiple()) {
			System.out.println("Multi select is possible");
			select.selectByVisibleText("American Flamingo");
			select.selectByVisibleText("Chilean Flamingo");
			select.selectByVisibleText("Lesser Flamingo");
			
			select.deselectByVisibleText("American Flamingo");
			select.deselectByVisibleText("Lesser Flamingo");
			select.deselectAll();
				}
	}

}
