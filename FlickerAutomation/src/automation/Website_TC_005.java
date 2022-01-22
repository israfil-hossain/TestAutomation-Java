package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Website_TC_005 {

	public static void SearchTest() {
		WebDriver driver = Website_TC_001.Homepage();
		WebElement FindSearchbox = driver.findElement(By.id("search-field"));
		FindSearchbox.click();
		WebElement Fillbox = driver.findElement(By.id("search-field"));
		Fillbox.sendKeys("Book");
		//click search button 
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/ul[2]/li[1]/div/form/label/input")).click();
        Timesleep.Waiting(10000);
        System.out.print("Search Test Complete");
     
	}
}
