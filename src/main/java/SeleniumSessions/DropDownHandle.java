package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.smartprix.com/");

		// WebElement industry =
		// driver.findElement(By.id("Form_submitForm_Industry"));
		// WebElement country =
		// driver.findElement(By.id("Form_submitForm_Country"));
		//
		// //drop down with Select html tag-- have to use Select class in
		// Selenium
		//
		// Select select_ind = new Select(industry);
		//
		// select_ind.selectByIndex(5);
		// select_ind.selectByVisibleText("Electronics");
		// select_ind.selectByValue("media");
		//
		// Select select_country = new Select(country);
		// select_country.selectByVisibleText("Belgium");

		By industry = By.id("cat-select");
		By country = By.id("Form_submitForm_Country");

		doDropDownSelectByVisibleText(industry, "Tablets");
		//doDropDownSelectByVisibleText(country, "India");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doDropDownSelectByVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);

	}

	public static void doDropDownSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public static void doDropDownSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);

	}

}
