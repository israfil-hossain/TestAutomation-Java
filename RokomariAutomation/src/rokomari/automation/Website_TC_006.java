package rokomari.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Website_TC_006 {

	public static WebDriver Notification() {
		WebDriver driver = Website_TC_004.signin();
		driver.findElement(By.id("unread-notification")).click();
		Timesleep.Waiting(3000);
		driver.navigate().to("https://www.rokomari.com/book");
		Timesleep.Waiting(2000);
		return driver;
	       
	}
}
