package seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import customexception.FrameworkException;

/**
 * 
 * @author sandhya
 *
 */
public class BrowserUtil {

	private WebDriver driver;

	/**
	 * 
	 * This method is used to initialize the browser on the basis of given browser
	 * name. valid browser=chrome/edge/safari/firefox
	 * @return 
	 */
	public WebDriver launchBrowser(String browserName) {

		System.out.println("browser name is :" + browserName);
		if (browserName == null) {
			System.out.println("Browser can not be null");
			throw new FrameworkException("BROWSER CANNOT BE NULL");
		}

		if (browserName.isEmpty()) {
			System.out.println("BrowserName can not be empty");
			throw new FrameworkException("BROWSER can not be empty");
		}

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Please pass the right browser.." + browserName);
			throw new FrameworkException("NOTVALIDBrowser");
		}
		return driver;
	}

	/**
	 * 
	 * @param url
	 */
	public void enterurl(String url) {

		if (url.contains("http")) {
			driver.get(url);
		} else {
			throw new FrameworkException("url should have http(s)");
		}
	}

	public void enterurl(URL url) {

		if (String.valueOf(url).contains("http")) {
			driver.navigate().to(url);
		} else {
			throw new FrameworkException("url should have http(s)");
		}
	}

	public String getPageTitle() {

		return driver.getTitle();
	}

	public String getPageURL() {

		return driver.getCurrentUrl();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}

}
