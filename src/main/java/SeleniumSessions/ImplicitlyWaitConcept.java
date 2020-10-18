package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//imp wait - is a dynamic wait
		//its only applicable for webelements on the page
		//findElement and findElements -- whenever you are creating webelement
		//global wait -- its applicable for all webelements throughout the driver session
		//it wont work with non webelements -- title, url
		
		driver.get("https://app.hubspot.com/login");
		System.out.println(driver.getTitle());
		
		//Thread.sleep(10000);//static wait
		
		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);//nullify imp wait
		
		driver.findElement(By.id("password")).sendKeys("test@123");//e2
		driver.findElement(By.id("loginBtn")).click();//e3
		
		//e4
		//e5
		//e6 -- clicking on it--a new page is coming
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//new imp wait
		//e7 -- need some wait..element is coming after 5 seconds
		
		
	}

}
