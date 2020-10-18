package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		// Explicit wait:
		// 1. WebDriverWait
		// 2. FluentWait
		// a. TimeOut b. pollingPeriod c. ignoringException

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/index.html");

		By username = By.name("username");
		By password = By.name("password");
		By login = By.xpath("//input[@value='Login']");
		waitForElementWithFluentWait(username, 15, 2).sendKeys("batchautomation");
		driver.findElement(password).sendKeys("Test@12345");
		driver.findElement(login).click();

		// WebDriverWait wait1 = new WebDriverWait(driver, 10);

		// Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		// .withTimeout(Duration.ofSeconds(15))
		// .pollingEvery(Duration.ofSeconds(3))
		// .ignoring(NoSuchElementException.class);
		//
		//
		// WebElement username_ele =
		// wait.until(ExpectedConditions.presenceOfElementLocated(username));
		//
		// username_ele.sendKeys("batchautomation");
		

	}

	public static WebElement waitForElementWithFluentWait(By locator, int timeOut, int pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(timeOut))
					.pollingEvery(Duration.ofSeconds(pollingTime))
					.ignoring(NoSuchElementException.class);

		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
