package testngsessions;

import org.testng.annotations.Test;

public class DependsOneMethod {
	
	
	@Test(priority=1)
	public void login(){
		System.out.println("do login test");
		int i = 9/3;
	}
	
	
	@Test(priority=2, dependsOnMethods="login")
	public void homeTest(){
		System.out.println("home test");
	}
	
	
	@Test(priority=3, dependsOnMethods="login")
	public void searchTest(){
		System.out.println("do serach test");
	}
	
	
	

}
