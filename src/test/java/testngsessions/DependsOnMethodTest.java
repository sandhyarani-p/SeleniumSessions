package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodTest {

	@Test
	public static void loginTest() {
		System.out.println("login to app");
	}
	
	
	@Test(dependsOnMethods ="loginTest",priority =1 )
	public static void appSearchTest() {
		System.out.println("login to app");
	}
	
	@Test(dependsOnMethods = "appSearchTest")
	public static void selectProductTest() {
		System.out.println("login to app");
	}
}
