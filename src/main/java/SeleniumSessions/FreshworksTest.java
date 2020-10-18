package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FreshworksTest {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		
		WebDriver driver = br.init_driver("firefox");
		br.launchUrl("https://www.freshworks.com/");
		String title = br.getPageTitle();
		System.out.println(title);
		
		By header_h1 = By.tagName("h1");
		By platform_link = By.linkText("Platform");
		By getStarted_button = By.xpath("/html/body/section[1]/div/div/div[1]/div/div");
		By header_h2 = By.tagName("h2");
		By contactUs_link = By.linkText("Contact us");
		
		ElementUtil ele = new ElementUtil(driver);
		String headerText = ele.doGetText(header_h1);
		System.out.println(headerText);
		
		System.out.println(ele.doGetText(platform_link));
		System.out.println(ele.doGetText(getStarted_button));
		System.out.println(ele.doGetText(header_h2));
		ele.doClick(contactUs_link);

		System.out.println(br.getPageTitle());
		
		br.quitBrowser();
		
		
		
	}

}
