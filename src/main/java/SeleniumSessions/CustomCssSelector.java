package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelector {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		//custom css:
		//id --> #id or htmltag#id
		//class --> .classname or htmltag.classname
		
		// #username
		// input#username
		// .login-email
		// input.login-email
		
		//input.login-email#username
		//input#username.login-email
		// #username.login-email
		
		// form-control private-form__control login-email
		// htmltag.c1.c2.c3....cn
		// input.form-control.private-form__control.login-email
		// .c1.c2.c3....cn
		// .form-control.private-form__control.login-email
		// input.form-control.private-form__control.login-email#username
		
		
		driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email"));
		driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']"));
		driver.findElement(By.className("login-email"));
		
		// htmltag[attr = 'value']
		// input[id='username'] --css
		//input[@id='username'] --xpath
		
		// htmltag[attr1 = 'value'][attr2 = 'value']
		// input[id='username'][type='email']
		// [id='username'][type='email']
		// [id='username'][type]
		// input[id][type]
		
		//parent to child:
		// div.private-form__input-wrapper input#username
		// div.private-form__input-wrapper > input#username
		// ul.footer-nav > li > a
		// ul.footer-nav li a
		
		// input[id*='user'] -- contains
		// input[id^='user'] -- starts-with
		// input[id$='name'] -- ends-with
		
		//comma  in CSS:
		
		int loginFormCount = driver.findElements(By.cssSelector("input#username, input#password, button#loginBtn")).size();
		if(loginFormCount == 3){
			System.out.println("my login form is displayed with all the elements...");
		}
		
		//following-sibling in css:
		// div.private-form__input-wrapper + div
		
		//nth-of-type:
		// ul.nav.navbar-nav.navbar-right li:nth-of-type(1) -- 1st  element
		// ul.nav.navbar-nav.navbar-right li:nth-of-type(n) -- all  elements
		
		//not operator in CSS:
		// form-control private-form__control login-email
		// form-control private-form__control login-password m-bottom-3

		// input.form-control.private-form__control:not(.login-password)
		// input.form-control.private-form__control:not(#username)
		
	}

}
