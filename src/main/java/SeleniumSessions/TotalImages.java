package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//get total number of images:
		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		
		System.out.println("total images :" + imagesList.size());
		
		for(int i=0; i<imagesList.size(); i++){
			String  source = imagesList.get(i).getAttribute("src");
			String altText = imagesList.get(i).getAttribute("alt");
			
			System.out.println(source);
			System.out.println(altText);

		}
		
		
	}

}
