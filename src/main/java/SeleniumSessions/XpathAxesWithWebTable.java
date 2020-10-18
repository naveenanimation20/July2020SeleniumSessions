package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxesWithWebTable {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://app.hubspot.com/login");
		driver.findElement(By.id("username")).sendKeys("naveenanimation30@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123456");
		driver.findElement(By.id("loginBtn")).click();
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://app.hubspot.com/contacts/6329229/contacts/list/view/all/");
		
//		driver.findElement(By.xpath("//span[text()='Sagar LN']"
//				+ "//ancestor::td//preceding-sibling::td//input[@type='checkbox']/..")).click();
		selectContact("Sagar LN");
		selectContact("Sheena Shoby");
		
		System.out.println(getContactEmailId("Sagar LN"));
		System.out.println(getContactEmailId("Sheena Shoby"));

	}
	
	public static void selectContact(String name){
		driver.findElement(By.xpath("//span[text()='"+name+"']"
				+ "//ancestor::td//preceding-sibling::td//input[@type='checkbox']/..")).click();
	}
	
	public static String getContactEmailId(String name){
		return driver.findElement(By.xpath("//span[text()='"+name+"']//ancestor::td//following-sibling::td/a")).getText();
	}
	

}
