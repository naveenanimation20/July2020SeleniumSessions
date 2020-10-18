package testngsessions;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountConcept {
	
	
	@BeforeMethod
	public void setup(){
		System.out.println("setup method");
	}
	
	@Test(invocationCount=10)
	public void createUser(){
		System.out.println("create user");
	}
	

}
