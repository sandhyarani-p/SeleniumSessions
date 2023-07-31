package seleniumPractice;

public class AmazonTest1 {

	public static void main(String[] args) {
		
		BrowserUtil1 butil = new BrowserUtil1();
		
		String browserName="chrome";
		String URL = "https://Amazon.com";
		butil.launchBrowser(browserName);
		butil.enterUrl(URL);
		String actTitle=butil.getTitle();
		
		if(actTitle.equals("Amazon.com. Spend less. Smile more.")) {
			
			System.out.println("correct title");
		}
		else {
			System.out.println("In correct titel");
		}
		
		//butil.closeBrowser();
		

	}

}
