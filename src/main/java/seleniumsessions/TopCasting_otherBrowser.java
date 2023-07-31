package seleniumsessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCasting_otherBrowser {

	public static void main(String[] args) {
		//0.valid but used only for specific browser
		
		EdgeDriver driver = new EdgeDriver();
		
		//1.valid but not recommended,as it has only 2 methods
		//SearchContext sc = new EdgeDriver();
		
		//2.valid and recommended
		//WebDriver driver = new EdgeDriver();
		
		//3.valid and recommended but it has one limitation
		//RemoteWebDriver driver = new EdgeDriver();
		
		//4.valid but used only for edge and chrome browser
		
		//ChromiumDriver driver = new ChromeDriver();
		//ChromiumDriver driver = new EdgeDriver();
		
		//5.valid but used only for remote execution
		//WebDriver driver =new RemoteWebDriver(remoteAddress,capabilities);
		
		
		//6.valid but not recommended
		//SearchContext sc = new RemoteWebDriver(remoteAddress,capabilities);
		
		
	}

}
