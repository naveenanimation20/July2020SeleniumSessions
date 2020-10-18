package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		//xpath: is a locator not an attribute in HTML DOM.
		//xpath : 1. absolute Xapth 2. Relative Xapth
		
		//abs xpath: //html/body/div[2]/div/div[3]/div[4]/div/input
		//relative xpath: custom xpath using xpath functions and axes
		
		//input[@id='username']
		
		//htmaltag[@attr1 = 'value']
		//input[@id='username']
		//input[@type='email']
		
		//htmaltag[@attr1 = 'value' and @attr2='value']
		//input[@id='username' and @type='email']
		//input[@id='username' and @type]
		//input[@id and @type]
		
		//text()
		//htmltag[text()='value']
		//h2[text()='Refreshing business software that your teams will love']
		//a[text()='Platform']
		
		//htmltag[@id='value' and text()='value']
		//a[@href='/platform/' and text()='Platform']
		//a[text()='Platform' and @href='/platform/']
		
		//contains(): is used to for dynamic attributes or dynamic text:
		//htmltag[contains(@id, 'value')]
		//input[contains(@id, 'username')]
		//input[contains(@id, 'user')]
		//input[contains(@id, 'name')]
		
		//input[contains(@id, 'user_')]
//		<id = 'user_123'>
//		<id = 'user_12343'>
//		<id = 'user_123323'>
		
		//contains() with text():
		//a[contains(text(), 'Platform')]
		//a[contains(text(), 'Plat')]
		//a[contains(text(), 'Plat') and @href='/platform/']
		//a[contains(text(), 'Plat') and contains(@href,'/platform/')]
		//input[contains(@value,'Login') and contains(@type,'submit')]
		
		//class attribute in xpath:
		//input[@class='form-control private-form__control login-email']
		driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']"));
		driver.findElement(By.className("form-control private-form__control login-email"));
		
		////input[contains(@class,'form-control')] --2
		// (//input[contains(@class,'form-control')])[1]
		// (//input[contains(@class,'form-control')])[position()=1]
		// (//input[@type='text'])[position()=6]
		// (//input[@type='text'])[last()]
		
		//input[starts-with(@name,'First')]
		////input[ends-with(@name,'Name')]
		
		//parent to child:
		//single slash / - means direct child
		//ul[@class='footer-nav']/li/a
		
		//double slash --> direct + indirect child 
		
		//div[contains(@class,'copyrights-nav')]/a --> 8
		//div[contains(@class,'copyrights-nav')]//a -->8
		
		//form[@id='hs-login']/div --> 8
		//form[@id='hs-login']//div --> 20
		
		//backward traversing: child to parent
		//input[@id='username']/../../../../../../..
		
		//child to parent: parent tag
		//input[@id='username']//parent::div
		//input[@id='username']//ancestor::form
		//input[@id='username']//ancestor::div
		
		//div[@class='private-form__input-wrapper']//child::input -- 2
		//div[@class='private-form__input-wrapper']//child::input[@id='username'] --1
		
		//parent to child:
		//form[@id='hs-login']/div --> 8
		//form[@id='hs-login']//div --> 20g
		
		//form[@id='hs-login']//child::div -- 20
		//form[@id='hs-login']/child::div -- 8
		
		//form[@id='Form_submitForm']//following::input[@type='text']
		//input[@id='Form_submitForm_FirstName']//preceding::div --> 60
		
		//Xpath Axes:
		//a[text()='Aanuj D']//parent::td//preceding-sibling::td/input[@type='checkbox']
		//a[text()='Aashish P']//parent::td//preceding-sibling::td/input[@type='checkbox']
		
		
	}

}
