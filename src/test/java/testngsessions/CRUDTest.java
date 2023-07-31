package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CRUDTest {

	
	//CRUD - ADD/GET/Update/Delete

public int addUser() {
	System.out.println("adding user");
	int userId=123;
	return userId;
}
	
	@Test(priority =1)
	public void addUserTest() {
		int userId=addUser();
		System.out.println("adding a user");
		Assert.assertEquals(userId, 123);
//		int i=9/0;
//		userId=123;//default 0
		
	}
	
	@Test(priority =2)
	public void getUserTest() {
		int userId=addUser();
		System.out.println("get user id :"+userId);
		
	}
	
	@Test(priority =3)
	public void updateUserTest() {
		int userId=addUser();
		System.out.println("update the user for user id :"+userId);
		
	}
	@Test(priority =4)
	public void deleteUserTest() {
		int userId=addUser();
		System.out.println("delete the user for  user id :"+userId);
		
	}
}
