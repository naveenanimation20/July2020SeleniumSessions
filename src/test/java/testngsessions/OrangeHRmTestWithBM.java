package testngsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRmTestWithBM {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	}

	@Test(priority=1)
	public void orangeHRMLogoTest() {
		Assert.assertTrue(driver.findElement(By.className("nav-logo")).isDisplayed());
	}

	@Test(priority=3)
	public void featureLinkTest() {
		Assert.assertTrue(driver.findElement(By.linkText("Features")).isDisplayed());
	}

	@Test(priority=2)
	public void freeTrialButtonTest() {
		String text = driver.findElement(By.xpath("//a[@href='/orangehrm-30-day-trial/']")).getText();
		System.out.println("free trial button text is : " + text);
		Assert.assertEquals(text, "FREE 30 DAY TRIAL");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}



