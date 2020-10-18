package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {

		
		String browser = "firefox";
		
		if(browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else if(browser.equals("safari")){
			driver = new SafariDriver();
		}
		
		else{
			System.out.println("plz pass the correct browser name : " + browser);
		}
		
		
		driver.get("http://www.google.com");// enter url

		String title = driver.getTitle();// get the title of the page
		System.out.println("page title is: " + title);

		// verification point/checkpoint: actual vs expected
		if (title.equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("in correct title");
		}

		System.out.println(driver.getCurrentUrl());

		// System.out.println(driver.getPageSource());

		driver.quit();
		
		
		
		
	}

}
