package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		// Xpath- Address of the element
		//Aboslute Xpath- from parent node to require node traversing.
		//Custom/Relative xpath- using attribute/using xpath function
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login/beta");

		
		//xpath: address of the element in HTM DOM
		//1. absolute xpath: /html/body/div/div/div[2]/ul/li[4]/a
		//2. relative xpath/custom xpath: using attributes, using xpath functions
		
		//htmltag[@attr='value']
		//input[@name='username']
		//button[@type='submit']
		
		//input - 14
				//input[@id] -- 6
				//input[@id='input-firstname'] --1
				//input-firstname -- id -- recommended
		//htmltag[@attr1='value' and @attr2='value']
		////input[@placeholder='Username' and @name='username']
		//input[@name='username' and @placeholder='Username' and @class='oxd-input oxd-input--active']
		//htmltag[@arrt1and @attr2 and @attr3]
		
		
		//input[@class='form-control private-form__control login-email']-valid(multiple classname with xpath)
		//By e2=By.ClassName("login-email");//single class name is valid
		//By e3 = By.className("form-control private-form__control login-email");//not valid
				//InvalidSelectorException: Compound class names not permitted

		By e4 = By.xpath("//input[contains(@class,'login-email')]");//valid
		
		By e5 = By.xpath("//input[@class='login-email']");//not valid

		
		//contains() in xpath
		//htmltag[contains(@attribute,'value')]
		//input[contains(@data-test-id,'email-input')]
		By tg= By.tagName("h1");
		
		//long value: 
				//dynamic attributes/ids:
//				<input id = "test_123">
//				<input id = "test_456">
//				<input id = "test_900">
		
		//input[contain(@id='test_')]
		//input[contains(@attri1,'value) and @attr2='value]
		//input[@attr1='value' and contains(@attr2,'value') and @attr3='value']
		//input[contains(@data-test-id,'email-input') and @type='email' and @class='form-control private-form__control login-email']
		

			//text() in xpath :
		//htmltag[text()='value']
		//h1[text()='Register Account']
		
		//contains with text()
		//html[contains(text(),'value')]
		//span[contains(text(),'Trusted by 60,000+ ')]
		
		//text() with Attribute
		//htmltag[text()='value' and @attri='value']
		
		//text() with contains and attr1 with contains() and attr2 without contains:
				//htmltag[contains(text(),'value') and contains(@attr1,'value') and @attr2='value']
				//a[contains(text(),'Address') and contains(@href,'account/address') and @class='list-group-item']
		
		
		//index/position in xpath:
	//  	(//input[@class='form-control'])[1]
		//if many values are matching then put that inside capture group and then add indexing
		//but if position change this will also change
		
		
		//if indexing is not required then use position() function
		//    (//input[@class='form-control'])[position()=1]
		
		//last()-- to click on last element
	//	(//input[@class='form-control'])[last()]
		
		//to go to last but 1
		//   (//input[@class='form-control'])[last()-1]
		
		
	// (//input[@class='form-control'])[last()]
		
		// (//input[@class='form-control'])[last()-(last()-1)] - 1st element
		// (//input[@class='form-control'])[1]		 -- 1st element
		
	//	((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]    -amazon help
	//	((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()-1]  -amazon assistance
		// ((//div[@class='navFooterLinkCol navAccessibility'])[last()-(last()-1)]//a)[position()=1]   -career
		//  ((//div[@class='navFooterLinkCol navAccessibility'])[last()-(last()-1)]//a)[position()=6]  -amazon science
	//	((//div[@class='navFooterLinkCol navAccessibility'])[last()-(last()-1)]//a)[last()]  -amazon science
		
		
		//Parent to child:
		//Parent/child:direct child
		//parent//child:direct+indirect child
		
		//select[@id='Form_getForm_Country']/option
		
		//to collect all the footer elements(parent +indirect child)
	
		//div[@class='footer-main']//a
		
		//form//input[@id='username']
		
		//child to parent--imp for interview
		//back word traversing in xpath:
		//   child/..
		//input[@id='username']/../../../../../
		//above is not readable so we go for below approach
		//input[@id='username']/parent::div/parent::div/parent::div/parent::form
		
		//input[@id='username']/ancestor::form-->this gives grand  parent
		
		
		//input[@id='username']//parent::div
		
		//for grandparent
		////input[@id='username']//ancestor::div
		
		//use text() whenever no space in the text
		
		//option[contains(text(),'Country')]/ancestor::div//parent::form
		
		//a[text()='Amazon Science']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div
		
	}

}
