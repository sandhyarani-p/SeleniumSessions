package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthPopUp {

	public static void main(String[] args) {

		String username = "admin";
		String passwrod = "admin";
		WebDriver driver = new ChromeDriver();

		// AUth pop ,we need to provide username and password in the url itself
		// If we have 2@ then this will not work
		driver.get("https://" + username + ":" + passwrod + "@" + "the-internet.herokuapp.com/javascript_alerts");

		// basic auth??
		// username:password --> encoded string
		// btoa("username:password") --> ERQWERQWERQWER!@#$@!#$===-encode the username
		// /password and given to server

	}

}
