package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		System.out.println(jsUtil.getTitleByJS());
		
		//jsUtil.refreshBrowserByJS();
		
		//jsUtil.generateAlert("This is my google page....");
//		String innerText = jsUtil.getPageInnerText();
//		System.out.println(innerText);
//		
//		if(innerText.contains("Privacy")){
//			System.out.println("Privacy is present on the page");
//		}
		
		//jsUtil.clickElementByJS(driver.findElement(By.linkText("Platform")));
		//jsUtil.sendKeysUsingWithId("username", "naveen@gmail.com");
		
		//jsUtil.scrollPageDown();
		
		//WebElement element = driver.findElement(By.xpath("//h2[text()='Chocolates, sweets & more']"));
		//jsUtil.scrollIntoView(element);
		//WebElement formElement = driver.findElement(By.id("hs-login"));
		//jsUtil.drawOrder(formElement);
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));

		jsUtil.flash(username);
		username.sendKeys("naveen@gmail.com");
		jsUtil.flash(password);
		password.sendKeys("naveen@123");
		jsUtil.flash(loginButton);
		loginButton.click();

		
	}

}
