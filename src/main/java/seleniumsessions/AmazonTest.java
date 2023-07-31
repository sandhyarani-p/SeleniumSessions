package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	// this is a runner class no need to extend
	public static void main(String[] args) {

		String browserName = "chrome";
		BrowserUtil brUtil = new BrowserUtil();

		// brUtil.driver = new ChromeDriver();// we are giving the exception by
		// declaring the webdriver public so we need to use as private
		// brUtil.driver.get("https://www.google.com");//nPE because default value of
		// driver is pointing to null

		brUtil.launchBrowser(browserName);
		brUtil.enterurl("https://amazon.com");
		String actTitle = brUtil.getPageTitle();
		System.out.println(actTitle);

		if (actTitle.contains("Amazon.com")) {
			System.out.println("correct title");
		} else {
			System.out.println("in correct title");
		}

		String actUrl = brUtil.getPageURL();
		System.out.println(actUrl);

		if (actUrl.contains("amazon")) {
			System.out.println("correct url");
		} else {
			System.out.println("in correct url");
		}
		brUtil.quitBrowser();

	}

}
