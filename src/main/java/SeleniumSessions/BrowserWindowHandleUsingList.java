package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleUsingList {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		List<String> handlesList = new ArrayList<String>(handles);
		
//		for(String s : handlesList){
//			System.out.println(s);
//		}
		
		String parentWidnowID = handlesList.get(0);
		String childWidnowID = handlesList.get(1);
		
		driver.switchTo().window(childWidnowID);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWidnowID);
		System.out.println(driver.getTitle());
		
		driver.quit();

		
	}

}
