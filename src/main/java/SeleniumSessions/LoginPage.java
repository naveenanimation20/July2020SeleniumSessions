package SeleniumSessions;

public class LoginPage {

	public static void main(String[] args) {

		
		BrowserUtil br = new BrowserUtil();
		
		br.init_driver("chrome");
		br.launchUrl("http://www.google.com");
		String title = br.getPageTitle();
		System.out.println(title);
		
		System.out.println(br.getCurrentPageUrl());
		
		br.quitBrowser();
		
		
		
	}

}
