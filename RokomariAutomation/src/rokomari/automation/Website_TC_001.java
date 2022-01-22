package rokomari.automation;

import org.openqa.selenium.WebDriver;

public class Website_TC_001 {
	
	public static WebDriver Homepage() {
		String baseurl = "https://www.rokomari.com/book";	
		WebDriver driver = Base.getDriver();

		//navigate website 
		driver.get(baseurl);
		return driver;
	}
}