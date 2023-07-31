package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		//driver.get("https://amazon.com");

		// inject JS script/code using selenium-Java with JavaScriptExecutor

//		RWD --> WD
//		RWD --> JSE -- executeScript()

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("alert('hi this is naveen')");
//		String title = js.executeScript("return document.title").toString();
//		System.out.println(title);
//		String url = js.executeScript("return document.URL").toString();
//		System.out.println(url);

		JavascriptUtil jsutil = new JavascriptUtil(driver);

//		System.out.println(jsutil.getTitleByJS());
//
//		// jsutil.generateJSAlert("this is sandhya alert");
//
//		String pageText = jsutil.getPageInnerText();
//		System.out.println(pageText);
//		if (pageText.contains("account")) {
//			System.out.println("Pass");
//
//		}
//
//		jsutil.scrollPageUp();
//		Thread.sleep(1000);
//		jsutil.scrollPageDown();
//		Thread.sleep(1000);
//		jsutil.scrollPageDown("500");
//		jsutil.scrollPageDownMiddlepage();

//		WebElement element = driver.findElement(By.xpath("//span[text()='International top sellers']"));
//		jsutil.scrollIntoView(element);
//
//		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
//		jsutil.drawBorder(search);
//		jsutil.drawBorder(element);
//		
		//WebElement reg_form_ele = driver.findElement(By.cssSelector(".form-horizontal"));
				//jsUtil.drawBorder(reg_form_ele);
				
				WebElement fn = driver.findElement(By.id("input-firstname"));
				WebElement ln = driver.findElement(By.id("input-lastname"));

				jsutil.flash(fn);
				fn.sendKeys("Naveen");
				jsutil.flash(ln);
				ln.sendKeys("Testing");

	}

}
