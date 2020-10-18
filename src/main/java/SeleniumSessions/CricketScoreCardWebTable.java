package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreCardWebTable {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get(
				"https://www.espncricinfo.com/series/8048/scorecard/1216496/rajasthan-royals-vs-chennai-super-kings-4th-match-indian-premier-league-2020-21");

		// String wicketTaker = driver.findElement(
		// By.xpath("//a[contains(text(),'SPD
		// Smith')]//parent::td//following-sibling::td//span//span"))
		// .getText();

		// a[contains(text(),'TK
		// Curran')]//parent::td//following-sibling::td/span

		// String wicketTaker = getWicketTaker("SPD Smith");
		// System.out.println(wicketTaker);
		//
		// wicketTaker = getWicketTaker("DA Miller");
		// System.out.println(wicketTaker);

		List<String> smith_list = getPlayerScoreCard("RV Uthappa");
		for (String s : smith_list) {
			System.out.println(s);
		}
	}

	public static String getWicketTaker(String playerName) {
		String wicketTaker = driver
				.findElement(By.xpath(
						"//a[contains(text(),'" + playerName + "')]//parent::td//following-sibling::td//span//span"))
				.getText();
		return wicketTaker;
	}

	public static List<String> getPlayerScoreCard(String playerName) {
		List<String> playerScoreList = new ArrayList<String>();

		List<WebElement> scoreList = driver.findElements(
				By.xpath("//a[contains(text(),'" + playerName + "')]//parent::td//following-sibling::td"));

		for (int i = 1; i < scoreList.size(); i++) {
			String text = scoreList.get(i).getText();
			//System.out.println(text);

			if (!text.equals("-")) {
				playerScoreList.add(text);
			}
		}

		return playerScoreList;
	}

}
