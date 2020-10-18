package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitSessionsId {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome
		//ChromeDriver: chrome on MAC (48d10fca803e378e2c844f82b04e0660)

		driver.get("http://www.google.com");//enter url
		//ChromeDriver: chrome on MAC (48d10fca803e378e2c844f82b04e0660)

		String title = driver.getTitle();//get the title of the page
		//ChromeDriver: chrome on MAC (48d10fca803e378e2c844f82b04e0660)

		System.out.println("page title is: " + title);
		
		driver.quit();
		//ChromeDriver: chrome on MAC (48d10fca803e378e2c844f82b04e0660)
		
		System.out.println(driver.getTitle());
		//ChromeDriver: chrome on MAC (null)
		//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	
		
		
		
	}

}
