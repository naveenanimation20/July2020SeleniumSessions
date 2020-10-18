package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	WebDriver driver;

	/**
	 * This method is used to launch browser
	 * 
	 * @param browser
	 * @return this returns driver
	 */
	public WebDriver init_driver(String browser) {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (browser.equals("safari")) {
			driver = new SafariDriver();
		}

		else {
			System.out.println("please pass the correct browser: " + browser);
		}

		return driver;

	}

	/**
	 * this is used to launch the url
	 * 
	 * @param url
	 */
	public void launchUrl(String url) {
		driver.get(url);
	}

	/**
	 * this is used to get the title of the page
	 * 
	 * @return
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getCurrentPageUrl() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}

}
