package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Website_TC_003 {

	public static void Signup() {
		WebDriver driver = Website_TC_002.logout();
		//driver.get("https://www.flickr.com/");
		
		//Click SIgnup button 
        WebElement Csignup = driver.findElement(By.linkText("Sign Up"));
        Csignup.click();
        
        // Fillup TextBox for Signup 
        WebElement fname = driver.findElement(By.id("sign-up-first-name"));
        WebElement lname = driver.findElement(By.id("sign-up-last-name"));
        WebElement age = driver.findElement(By.id("sign-up-age"));
        WebElement email = driver.findElement(By.id("sign-up-email"));
        WebElement psd = driver.findElement(By.id("sign-up-password"));
      
        fname.sendKeys("Israfil");
        lname.sendKeys("Hossain");
        age.sendKeys("24");
        email.sendKeys("obujbalok467@gmail.com");
        psd.sendKeys("123456789abc");
        
        // Waiting for recaptcha 10 seconds 
        Timesleep.Waiting(20000);

        // Click SIgnup button 
        driver.findElement(By.xpath("//*[@id=\"sign-up-form\"]/button")).click();
        
        Timesleep.Waiting(10000);
        System.out.print("Signup Test complete");
        
        return;
        
	}
}
