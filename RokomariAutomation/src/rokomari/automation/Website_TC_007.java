package rokomari.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Website_TC_007 {

	public static WebDriver cart() {
		WebDriver driver = Website_TC_006.Notification();
		driver.findElement(By.xpath("//*[@id=\'js-cart-menu\']")).click();
		Timesleep.Waiting(4000);
		
		return driver;
	       
	}
}
