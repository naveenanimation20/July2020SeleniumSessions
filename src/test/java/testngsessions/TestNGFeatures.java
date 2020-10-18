package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFeatures {
	
	//global pre conditons
	//pre conditions
	//Test Steps
	//actual vs expected
	//pass/fail
	
//	before suite
//	before test
//	before class
	
//		before method
//			home page test
//		after method
	
//		before method
//			login test
//		after method
	
//	after class
//	after test
//	after suite

	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("before suite--- Create User");
		
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("before test  -- add user data");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("before class --- DB connection");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("before method --- login to app");
	}
	
	
	@Test
	public void userDataTest(){
		System.out.println("user data test");
	}
	
	@Test
	public void userProfileTest(){
		System.out.println("user profile test");
	}
	
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("after method --- logout");
	}
	
	
	@AfterClass
	public void afterClass(){
		System.out.println("after class -- disconnect with DB");
	}
	
	
	@AfterTest
	public void afterTest(){
		System.out.println("after test  --- delete user data");
	}
	
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("after suite --- delete the user");
	}

}
