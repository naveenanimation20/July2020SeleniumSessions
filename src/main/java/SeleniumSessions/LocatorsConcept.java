package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
		Thread.sleep(5000);
		
		//create webelement + actions (click, sendkeys, get text)
		
		//1. id:  -- I
//		driver.findElement(By.id("username")).sendKeys("naveenanimation30@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Selenium@123456");
//		driver.findElement(By.id("loginBtn")).click();
		
		
		//2. name: -- II (if its unique)
		//driver.findElement(By.name("username")).sendKeys("test@gmail.com");
		
		//3. className: is not a unique attribute -- III (if its unique)
		// form-control private-form__control login-email
		// form-control private-form__control login-password m-bottom-3
		//driver.findElement(By.className("login-email")).sendKeys("admin@gmail.com");
		//driver.findElement(By.className("login-password")).sendKeys("admin");
		//driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("admin@gmail.com");
		
		//4. xpath: -- its an address of the element in HTML DOM, but its not an attribute
//		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("admin@gmail.com");
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//*[@id='loginBtn']")).click();
		
		//5. css selector: --  not an attribute
//		driver.findElement(By.cssSelector("#username")).sendKeys("admin@gmail.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("admin");
//		driver.findElement(By.cssSelector("#loginBtn")).click();
		
		//6. link Text: only for links
		//Sign up
		//Sign in
		//driver.findElement(By.linkText("Sign up")).click();
		
		//7. partial link text:
		//driver.findElement(By.partialLinkText("Sign")).click();
		//long link text
		// create account on amazon India for shopping
		// create account on amazon UK for shopping
		//driver.findElement(By.partialLinkText("create account on amazon")).click();
		//driver.findElement(By.partialLinkText("amazon India")).click();

		//8. tag name: html tag
		String header = driver.findElement(By.tagName("h1")).getText();
		System.out.println(header);		
		
		
//		WebElement emailid = driver.findElement(By.id("username"));
//		WebElement pwd = driver.findElement(By.id("password"));
//		WebElement loginButton = driver.findElement(By.id("loginBtn"));
//		
//		emailid.sendKeys("test@gmail.com");
//		pwd.sendKeys("test@123");
//		loginButton.click();
		
		//By locators: POM
//		By username = By.id("username");
//		By pwd = By.id("password");
//		By loginButton = By.id("loginBtn");
//		
//		WebElement emailid = driver.findElement(username);
//		WebElement password = driver.findElement(pwd);
//		WebElement login_button = driver.findElement(loginButton);
//
//		emailid.sendKeys("admin@gmail.com");
//		password.sendKeys("admin@123");
//		login_button.click();
		
		
//		getElement(username).sendKeys("admin@gmail.com");
//		getElement(pwd).sendKeys("admin123");
//		getElement(loginButton).click();
		
//		doSendKeys(username, "admin@gmail.com");
//		doSendKeys(pwd, "admin123");
//		doClick(loginButton);
		
	}
	
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value){
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator){
		getElement(locator).click();
	}
	

}
