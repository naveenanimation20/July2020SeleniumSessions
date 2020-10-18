package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOptions {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");

//		List<String> industry_list = getAllDropDownOptionsList(industry);
//		System.out.println(industry_list.size());
//		System.out.println(industry_list);
//
//		List<String> country_list = getAllDropDownOptionsList(country);
//		System.out.println(country_list.size());
//		System.out.println(country_list);
		
		
		selectValueFromDropDown(country, "India");
		selectValueFromDropDown(industry, "Electronics");
		
		
		//rough work:

		// WebElement industry =
		// driver.findElement(By.id("Form_submitForm_Industry"));
		// WebElement country =
		// driver.findElement(By.id("Form_submitForm_Country"));
		//
		// Select industry_select = new Select(industry);
		//
		// List<WebElement> industry_options_list =
		// industry_select.getOptions();
		// System.out.println(industry_options_list.size());

		// for(WebElement ele : industry_options_list){
		// String text = ele.getText();
		// System.out.println(text);
		// }

		//
		// for (int i = 0; i < industry_options_list.size(); i++) {
		// String text = industry_options_list.get(i).getText();
		// System.out.println(text);
		//
		// if (text.equals("Automotive")) {
		// industry_options_list.get(i).click();
		// break;
		// }
		//
		// }

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<String> getAllDropDownOptionsList(By locator) {

		WebElement element = getElement(locator);
		List<String> optionsValueList = new ArrayList<String>();

		Select select = new Select(element);
		List<WebElement> optionsList = select.getOptions();

		for (int i = 0; i < optionsList.size(); i++) {
			String text = optionsList.get(i).getText();
			optionsValueList.add(text);
		}

		return optionsValueList;

	}

	public static void selectValueFromDropDown(By locator, String value) {

		WebElement element = getElement(locator);

		Select select = new Select(element);
		List<WebElement> optionsList = select.getOptions();

		for (int i = 0; i < optionsList.size(); i++) {
			String text = optionsList.get(i).getText();
			if (text.equals(value)) {
				optionsList.get(i).click();
				break;
			}
		}

	}

}
