package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirefoxLaunch {
	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "opera";
		//WebDriver driver = null;
		
		//cross browser testing:
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
			 driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "/Users/NaveenKhunteta/Downloads/geckodriver");
			driver = new FirefoxDriver();
		}
		
		else if(browser.equals("safari")){
			driver = new SafariDriver();
		}
		
		else{
			System.out.println("plz pass the correct browser name : " + browser);
		}
		
		// geckodriver.exe -- Mozilla
		

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
