package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	public static void main(String[] args) {

		// find out total number of links on the page
		// print the text of each link
		// and ignore the blank text links

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		List<WebElement> linksList = driver.findElements(By.tagName("a"));

		System.out.println("total links: " + linksList.size());

		//for loop:
		// for(int i=0; i<linksList.size(); i++){
		// String text = linksList.get(i).getText();
		// if(!text.isEmpty()){
		// System.out.println(i+"--->"+text);
		// System.out.println(linksList.get(i).getAttribute("href"));
		// }
		// }

		// for each:
//		for (WebElement e : linksList) {
//			String text = e.getText();
//			if (!text.isEmpty()) {
//				System.out.println(text);
//				System.out.println(e.getAttribute("href"));
//			}
//		}
		
		//streams:
		linksList.stream().forEach(ele -> System.out.println(ele.getText()));
		
		
	}

}
