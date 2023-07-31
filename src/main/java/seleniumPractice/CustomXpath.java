package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	
	public static void main(String[] args) {

		//path- Address of the element in the html DOM(document object model)
		
		//Abosolute Xpath- /html/body/div/div/[2]/ul/li[4]
		//Relative Xpath- //exact address of the element
		
		//input[@id='input-firstname' and @name='firstname']
		//input[@id='input-password' and @name='password']
		
		//when id is present ,go for it(By,id(""));
		//By e1=	By.xpath("//input[@class='form-control private-form__control login-email']");//valid
			//below is used with unique classname from the class attribute//valid
		//By e2=	By.className("login-email");//valid
		By e3=	By.className("'form-control private-form__control login-email'");//not valid with multiple classname//
		//compoud class not permitted
			
			WebDriver driver= new ChromeDriver();
			driver .get("https://app.hubspot.com/login/beta");
			
			driver.findElement(e3).sendKeys("test@gmail.com");
			
			//contains function in xpath
			
			//tagname[contains(@attribute,'value')]
			
			//input[contains(@data-test-id,'email-input') ]
			//input[contains(@class,'login-email') ]
			//input[contains(@data-test-id,'email-input') ]
			//input[contains(@type,'email') ]
			
			//when we have dynamic attribute
		//	<input id='test_123'>
		//	<input id='test_124'>
		//	<input id='test_144'>
			//input[contains(@id,'test_')]
			
			//contains with attribute1 with value and attribute 2 with no value
			
			//tagname[contains(@attribute1,'valkue') and @attributue2='value']
			
			//input[contains(@class,'login-email') and @id='username' ]
			
			//Sequence does not matter:
			//input[ @id='username'  and contains(@class,'login-email')]
			
			//text() in Xpath:used when text /paragraph 
			//used when xpath has the text,it does not take any parameter
			
			//tagname[text()='value']

			//h1[text()='Register Account']
			
			
			//contains with text()
			//tagname[contains(text(),'value']
			
			//span[contains(text(),'busineess of all sizes')]
			
			//text() with @attribute
			//tagname[text()='value' and @attribute='value']
			
			//a[text()='Login' and @class='list-group-item']
			
			//text() with contains and attribute with contains and attribute without contains
			
			//a[contains(text(),'Login' ) and contains( @href, 'account') and @class='list-group-item' ]
			
			//capture group:when we get multiple elements matching same xpath 
			//then ise capture with indexing
			//     (//input[@class='form-control'])[1]
			By.xpath("(//input[@class='form-control'])[1]");
			
			
			//Use last() function to get the last element when we have multiple matching element
			
			//   (//input[@class='form-control'])[last()]
			
			//to get last but 1
			//   (//input[@class='form-control'])[last()-1]
			
			//to get the first element matching using the last()
			
		//	(//input[@class='form-control'])[last()-(last()-1)]
			
			//Amazon help will be the last element
			//  ((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]   - Amazon Help
			//  ((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()-1]  -Amazon assistance
			
			//parent to child
			//parent/child:direct child
			//parent//child:direct+indirect child
			
			//select[@id='Form_getForm_Country']//option
		// 	(//div[@class='footer-main'])//a
			
			//  //form//input[@id='username']
			
			//child to parent
			
			//backward traversing in xpath: //input[@id='username']/../../..
			//  //input[@id='username']/parent::div
			//to go to grand parent:
			//input[@id='username']/ancestor::form
			
			//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
			
			//following -sibling::tag
			
			//a[text()='Joe.Root']/parent::td/following-sibling::td
			
			
			
	}

}
