package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuit {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome
		//ChromeDriver: chrome on MAC (b4d8c81bedaf9adf19db48d9d0655faa)

		driver.get("http://www.google.com");//enter url
		//ChromeDriver: chrome on MAC (b4d8c81bedaf9adf19db48d9d0655faa)

		String title = driver.getTitle();//get the title of the page
		//ChromeDriver: chrome on MAC (b4d8c81bedaf9adf19db48d9d0655faa)

		System.out.println("page title is: " + title);
		
		driver.close();
		//ChromeDriver: chrome on MAC (b4d8c81bedaf9adf19db48d9d0655faa)
		//browser is closed -- session id is still there but its invalid.
		
		driver = new ChromeDriver();
		System.out.println(driver.getTitle());
		//ChromeDriver: chrome on MAC (78d3f0344bef6c602ea88f255cee70b6)
		
		//case 1 : close:
		//ChromeDriver: chrome on MAC (b4d8c81bedaf9adf19db48d9d0655faa)
		
		
		
		
		
	}

}
