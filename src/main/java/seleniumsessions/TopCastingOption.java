package seleniumsessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOption {

	public static void main(String[] args) {
		
		//0.valid but used only for specific chromebrowser
		//ChromeDriver driver = new ChromeDriver();
		
		
		//1.valid top cast but not recommended because it has only 2 methods,FE-find element,FES-findElements
		//SearchContext sc =new ChromeDriver();
		
		
		//2.Valid and recommended
		//WebDriver driver = new ChromeDriver();--local execution
		
		//3.valid and recommended but ppl are not using but there is one limitation
		//RemoteWebDriver driver =new ChromeDriver();--local execution
		
		//4.valid only for chrome and edge browser
		//ChromiumDriver driver =new ChromeDriver();
		
		//driver = new EdgeDriver();
		
		//5.valid and recommended -used for remote execution/sel grid/cloud-aws/browser stack/lamdaTest
		//WebDriver driver =new RemoteWebDriver(remoteAddress,capabilities);

		//6.valid but not recommended
		
		//SearchContext	sc =new RemoteWebDriver(remoteAddress,capabilities);
	}

}
