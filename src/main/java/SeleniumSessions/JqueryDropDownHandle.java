package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {
	static WebDriver driver;
	static final String SELECT_ALL_OPTIONS = "all";

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(2000);

		driver.findElement(By.id("justAnInputBox")).click();

		Thread.sleep(2000);

		By choices_span = By.xpath("//span[@class='comboTreeItemTitle']");

		// multi selection:
		// selectChoiceFromDropDown(choices_span, "choice 3", "choice 2", "choice 6 2 2", "choice 7");

		// single selection:
		// selectChoiceFromDropDown(choices_span, "choice 7");

		// select all:
		selectChoiceFromDropDown(choices_span, JqueryDropDownHandle.SELECT_ALL_OPTIONS);

	}

	/**
	 * This method is used to select Single, Multiple and all Choices from the drop down. 
	 * Please pass the unique values.
	 * @param locator
	 * @param value... 
	 */
	public static void selectChoiceFromDropDown(By locator, String... value) {
		List<WebElement> choiceList = driver.findElements(locator);

		if (!value[0].equalsIgnoreCase("all")) {

			for (int i = 0; i < choiceList.size(); i++) {
				String text = choiceList.get(i).getText();
				System.out.println(text);

				for (int j = 0; j < value.length; j++) {
					if (text.equals(value[j])) {
						choiceList.get(i).click();
						break;
					}
				}

			}
		}
		
		//select all values:
		
		else{
			try{
				for(int a=0; a<choiceList.size(); a++){
					choiceList.get(a).click();
				}
			}		
		catch(Exception e){
			
		}
		
		
	}

}
}

