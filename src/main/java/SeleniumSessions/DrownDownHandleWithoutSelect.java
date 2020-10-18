package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrownDownHandleWithoutSelect {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		By industry_options = By.xpath("//select[@id='Form_submitForm_Industry']/option");

		selectDropDownValueWithoutSelectClass(industry_options, "Electronics");

		// List<WebElement> industry_options_list = driver
		// .findElements(By.xpath("//select[@id='Form_submitForm_Industry']/option"));
		//
		// System.out.println(industry_options_list.size());
		//
		// for (WebElement ele : industry_options_list) {
		// System.out.println(ele.getText());
		// }

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void selectDropDownValueWithoutSelectClass(By locator, String value) {

		List<WebElement> industry_options_list = driver.findElements(locator);
		for (WebElement ele : industry_options_list) {
			String text = ele.getText();
			if (text.equals(value)) {
				ele.click();
				break;
			}

		}

	}

}
