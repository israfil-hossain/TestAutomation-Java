package rokomari.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Website_TC_008 {

	public static WebDriver TC_8_1_book() {
		WebDriver driver = Website_TC_001.Homepage();
		// remove pop-up message 
		driver.findElement(By.xpath("//*[@id=\"js--entry-popup\"]/div[1]/button")).click();
		Timesleep.Waiting(3000);
		
		return driver;
	       
	}
	public static WebDriver TC_8_2_electronics() {
		WebDriver driver = TC_8_1_book();
		driver.findElement(By.xpath("/html/body/header/div/nav/div/div[1]/ul/li[2]/a")).click();
		Timesleep.Waiting(4000);
		
		return driver;
	       
	}
	public static WebDriver TC_8_3_stationary() {
		WebDriver driver = TC_8_2_electronics();
		driver.findElement(By.xpath("/html/body/header/div/nav/div/div[1]/ul/li[3]/a")).click();
		Timesleep.Waiting(4000);
		
		return driver;
	       
	}
	public static WebDriver TC_8_4_giftfinder() {
		WebDriver driver = TC_8_3_stationary();
		driver.findElement(By.xpath("/html/body/header/div/nav/div/div[1]/ul/li[4]/a")).click();
		Timesleep.Waiting(4000);
		
		return driver;
	       
	}
	public static WebDriver TC_8_5_organization_order() {
		WebDriver driver = TC_8_4_giftfinder();
		driver.findElement(By.xpath("/html/body/header/div[6]/div/div/div/ul/li[5]/a")).click();
		Timesleep.Waiting(4000);
		
		return driver;
	       
	}
	public static WebDriver TC_8_6_offer() {
		WebDriver driver = TC_8_5_organization_order();
		driver.findElement(By.xpath("/html/body/header/div[6]/div/div/div/ul/li[6]/a")).click();
		Timesleep.Waiting(4000);
		
		return driver;
	       
	}
	public static WebDriver TC_8_7_blog() {
		WebDriver driver = TC_8_6_offer();
		driver.findElement(By.linkText("ব্লগ")).click();
		Timesleep.Waiting(8000);
		
		driver.close();
		driver.quit();
		return driver;
	       
	}
	
}
