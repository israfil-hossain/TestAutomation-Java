package rokomari.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Website_TC_005 {

public static WebDriver Search() {
		
		WebDriver driver = Website_TC_001.Homepage();
		// remove pop-up msg 
		driver.findElement(By.xpath("//*[@id=\"js--entry-popup\"]/div[1]/button")).click();
		Timesleep.Waiting(3000);
		//Click Search section
        driver.findElement(By.id("js--search")).click();
        driver.findElement(By.id("js--search")).clear();
        driver.findElement(By.id("js--search")).sendKeys("Cyber security");
        Timesleep.Waiting(2000);
        driver.findElement(By.xpath("//*[@id=\"js--main-header\"]/div/div/div[2]/div/form/div/div/button")).click();
		
		return driver;
	}
}
