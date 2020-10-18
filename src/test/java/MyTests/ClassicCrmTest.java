package MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassicCrmTest extends BaseTest {

	@Test(priority = 1)
	public void googleTitleTest() {
		driver.get("https://classic.crmpro.com/");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}

	@Test(priority = 2)
	public void googleUrlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("crmpro"));
	}

}
