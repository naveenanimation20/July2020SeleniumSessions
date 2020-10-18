package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickAndSendKeys {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		By username = By.id("username");
		By pwd = By.id("password");
		By loginButton = By.id("loginBtn");
		
		doActionsSendKeys(username, "admin@gmail.com");
		doActionsSendKeys(pwd, "admin@123");
		doActionsClick(loginButton);

		
//		WebElement emailid = driver.findElement(By.id("username"));
//		WebElement pwd = driver.findElement(By.id("password"));
//		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		
//		Actions action = new Actions(driver);
//		
//		action.sendKeys(emailid, "naveen@gmail.com").perform();
//		action.sendKeys(pwd, "naveen@123").perform();
//		action.click(loginButton).perform();

		
	}
	
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	
	public static void doActionsSendKeys(By locator, String value){
		WebElement element = getElement(locator);
		Actions action = new Actions(driver);
		action.sendKeys(element, value).perform();
	}
	
	public static void doActionsClick(By locator){
		WebElement element = getElement(locator);
		Actions action = new Actions(driver);
		action.click(element).perform();
	}

}
