package seleniumPractice;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import customexception.FrameworkException;



public class BrowserUtil1 {

	private WebDriver driver;
	
	public WebDriver launchBrowser(String browserName) {
		
		
		if(browserName==null) {
			System.out.println("Browser name can not be null"+browserName);
			throw new FrameworkException("BRowser Name can not be null");
			
		}
		
		if(browserName.isEmpty()) {
			System.out.println("Browser name can not be empty"+browserName);
			throw new FrameworkException("BRowser Name can not be empty");
			
		}
		
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "Edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("please pass the right browser name"+browserName);
			throw new FrameworkException("NOT A VALID BROWSER NAME");
		}
		return driver;
	}
	
	public void enterUrl(String url) {
		
		if(url.contains("http")) {
			driver.get(url);
		}
		else {
			throw new FrameworkException("pls pass the right url with http");
		}
	}
	
	public void enterurl(URL url) {
		if(String.valueOf(url).contains("http")) {
			driver.navigate().to(url);
		}
		else {
			throw new FrameworkException("url should have http(s)");
		}
	}
	
	public String getTitle() {
		
		return driver.getTitle();
	}
	
	public String getUrl() {
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser() {
		
		 driver.quit();
	}

	
	public void closeBrowser() {
		
		 driver.close();
	}
}
