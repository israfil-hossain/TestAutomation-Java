package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Website_TC_006 {

	public static void Notification() {
		WebDriver driver=Website_TC_002.Signin();
		WebElement Nclick = driver.findElement(By.id("yui_3_16_0_1_1641413312341_606"));
		Nclick.click();
		
	}
}
