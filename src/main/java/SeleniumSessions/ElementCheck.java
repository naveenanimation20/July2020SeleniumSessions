package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementCheck {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		By username = By.id("username1");
		By pwd = By.id("password");
		By loginButton = By.id("loginBtn");
		
		System.out.println(checkWebElementPresent(username));
		System.out.println(checkWebElementPresent(pwd));
		System.out.println(checkWebElementPresent(loginButton));
		
//		List<WebElement> loginButtonList = driver.findElements(By.id("loginBtn"));
//		
//		System.out.println(loginButtonList.size());
//		
//		if(loginButtonList.size()>0){
//			System.out.println("element is present on the page");
//		}
//		else{
//			System.out.println("element is not present on the page");
//		}
		
	}
	
	
	
	public static boolean checkWebElementPresent(By locator){
		int elementCount = driver.findElements(locator).size();
		System.out.println("total elements count: " + elementCount + " for " + locator);
		
		if(elementCount>0){
			return true;
		}else{
			return false;
		}
	}
	

}
