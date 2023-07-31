package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTest {

	
	
		@Test(priority = -1)
		public void searchTest() {
			System.out.println("searchTest");
			Assert.assertEquals("Google", "Google");
		}
		
		
		@Test(priority = 2)
		public void cartTest() {
			System.out.println("cartTest");
			Assert.assertEquals("macBook", "macBook");
		}
		
		@Test(priority = 3)
		public void orderTest() {
			System.out.println("orderTest");
			Assert.assertEquals("1000", "1000");
		}
		
		@Test(priority = 0)
		public void payMentTest() {
			System.out.println("payMentTest");
			Assert.assertEquals("macBook", "macBook");
		}
		
		@Test(priority = 4)
		public void emailTest() {
			System.out.println("emailTest");
			Assert.assertEquals("email is sent", "email is sent");
		}
		
}
