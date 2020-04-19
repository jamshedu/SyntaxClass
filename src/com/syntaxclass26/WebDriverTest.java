package com.syntaxclass26;

public class WebDriverTest {
	
	
public static void main(String[] args) {
		
		RemoteWebDriver[] browserArray={new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
		
		for(RemoteWebDriver browser: browserArray) {
			browser.open();
			browser.close();
			browser.getScreenShot();
			System.out.println(browser.getTitle());
			browser.navigate();
			System.out.println(" -----------------   ");
		}
	}

}
