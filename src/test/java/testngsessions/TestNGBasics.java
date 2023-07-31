package testngsessions;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	// global condition
	// pre condition
	// test steps+ exp vs actual -->assertion -->Pass/fail
	//post Steps

	
//	BS -- connect withDB
//	BT--createUser
//	BC -- launchBrowser
	
//	BM-- logonToAPp
//	cartTest
//	AM-- logout
	
//	BM-- logonToAPp
//	orderTest
//	AM-- logout
	
//	BM-- logonToAPp
//	searchTest
//	AM-- logout
	
//	AC-- logout
//	AT-- deleteUser
//AS	
//	PASSED: cartTest
//	PASSED: orderTest
//	PASSED: searchTest
	
	//1 first run
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS -- connect withDB");
	}
	//2
	@BeforeTest
	public void createUser() {
		System.out.println("BT--createUser");
	}
	//3
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launchBrowser");
	}
	//4 7 10-- this is running every before each and every test method
	@BeforeMethod
	public void longOntoApp() {
		System.out.println("BM-- logonToAPp");
	}
	//11
	@Test
	public void searchTest() {
		System.out.println("searchTest");
		Assert.assertEquals("Google", "Google");
	}
	
	//5
	@Test
	public void cartTest() {
		System.out.println("cartTest");
		Assert.assertEquals("macBook", "macBook");
	}
	//8
	@Test
	public void orderTest() {
		System.out.println("orderTest");
		Assert.assertEquals("1001", "1000");
	}
	
	//6 9 12
	@AfterMethod
	public void logout() {
		System.out.println("AM-- logout");
	}
	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC-- logout");
	}

	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("AT-- deleteUser");
	}
	//15
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS-- disconnectWithDB");
	}
}
