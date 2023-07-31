package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import customexception.FrameworkException;

public class ElementUtil {

	private WebDriver driver;
	private Actions act;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
		act = new Actions(driver);
	}

	public void doSendKeys(By locator, String value) {
		if (value == null) {
			System.out.println("value can not be null while using send Keys");
			throw new FrameworkException("");
		}
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();

	}

	public String doElementGetText(By locator) {
		String eleText = getElement(locator).getText();
		System.out.println("Element text is ==>" + eleText);
		return eleText;

	}
	
	public  WebElement getLinkEleByText(String linkText) {
		return driver.findElement(By.linkText(linkText));
	}

	public boolean checkElementIsDisplayed(By locator) {

		return getElement(locator).isDisplayed();
	}

	public String getElementAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

	public boolean checkElementIsDisabled(By locator) {
		String disabledValue = getElement(locator).getAttribute("disabled");
		if (disabledValue.equals("true")) {
			return true;
		}
		return false;
	}

	// base method to create webElement
	public WebElement getElement(By locator) {

		WebElement element = null;
		try {
			element = driver.findElement(locator);
		} catch (NoSuchElementException e) {
			System.out.println("getting element exception..plz check your locator again");
			e.printStackTrace();
			try {
				Thread.sleep(2000);

			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			element = driver.findElement(locator);
		}
		return element;
	}

	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();// pc=0
		for (WebElement e : eleList) {
			String text = e.getText();
			if (!text.isEmpty()) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}
	public  void clickOnElement(By locator,String linkText) {
		List<WebElement> linkslist=getElements(locator);
		
		System.out.println("total number of links"+linkslist.size());
		
		for(WebElement e: linkslist) {
			
			String text=e.getText();;
			System.out.println(text);
			if(text.equals(linkText)){
				e.click();
				break;
			}
	}
			
	}
	
	public  void doSearch(By searchlocator, By searchSuggLocator, String searchKey, String suggName)
			throws InterruptedException {

		doSendKeys(searchSuggLocator, searchKey);
		Thread.sleep(1000);
		List<WebElement> suggestionLIst = getElements(searchSuggLocator);
		System.out.println(suggestionLIst.size());
		for (WebElement e : suggestionLIst) {

			String text = e.getText();
			System.out.println(text);
			if (text.contains(suggName)) {
				e.click();
				break;
			}
		}
	}
	//--------------------Drop Down _---------
	
	
	public  void doSelectDropdownByIndex(By locator, int index) {

		if (index < 0) {
			System.out.println("please pass right (+ve) index");
			return;
		}

		Select select = new Select(getElement(locator));

		select.selectByIndex(index);
	}
	public  void doSelectDropdownByVisibleText(By locator, String visibleText) {

		if (visibleText == null) {
			System.out.println("please pass right (visible Text");
			return;
		}

		Select select = new Select(getElement(locator));

		select.selectByVisibleText(visibleText);
	}
	
	
	public  void doSelectDropdownByValue(By locator, String value) {

		if (value == null) {
			System.out.println("please pass right value attribute");
			return;
		}

		Select select = new Select(getElement(locator));

		select.selectByValue(value);
		
		
	}
	
	
	//****************Actions class Utils************
	
	public  void doActionsClick(By locator) {
		
		act.click(getElement(locator)).perform();
	}
	
	public  void doActionsSendKeys(By locator, String value) {
		
		act.sendKeys(getElement(locator), value).perform();
	}
	/**
	 * this method will handle the menu upto 4 levels
	 * @param level1locator
	 * @param level2
	 * @param level3
	 * @param level4
	 * @throws InterruptedException
	 */
	
	
	public  void multilevelMenuHandling(By level1locator,String level2,String level3,String level4) throws InterruptedException {
		act.moveToElement(getElement(level1locator)).perform();
		Thread.sleep(1500);
		act.moveToElement(getLinkEleByText(level2)).perform();
		Thread.sleep(1500);
		act.moveToElement(getLinkEleByText(level3)).perform();
		Thread.sleep(1500);
		getLinkEleByText(level4).click();
		
	}
	
	public  void multilevelMenuHandling(By level1locator,String level2,String level3) throws InterruptedException {
		act.moveToElement(getElement(level1locator)).perform();
		Thread.sleep(1500);
		act.moveToElement(getLinkEleByText(level2)).perform();
		Thread.sleep(1500);
		getLinkEleByText(level3).click();
		
	}
}
