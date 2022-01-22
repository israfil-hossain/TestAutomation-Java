package rokomari.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Website_TC_003 {
	//*[@id="login_link"]/a[2]
	public static WebDriver TC_3_1_signup_facebook() {
		WebDriver driver = Website_TC_001.Homepage();
		// Remove Pop-up message 
        driver.findElement(By.xpath("//*[@id='js--entry-popup']/div[1]/button")).click();
        //Click Sign-in button 
        driver.findElement(By.linkText("Sign in")).click();
        Timesleep.Waiting(3000);
        // Click Facebook button 
        driver.findElement(By.xpath("//*[@id='js--login-form']/div[1]/div/button[1]")).click();
        Timesleep.Waiting(3000);
        // click Signup for Facebook 
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div[1]/form/div/div[4]/a[2]")).click();
        // click First name firstname
        driver.findElement(By.name("firstname")).sendKeys("Israfil");
        // click Surname
        driver.findElement(By.name("lastname")).sendKeys("Hossain");
        // click Mobile number 
        driver.findElement(By.name("reg_email__")).sendKeys("01843566251");
        // click password
        driver.findElement(By.name("reg_passwd__")).sendKeys("Israfil12345678");
       
        // click Dathof birth Day 
        driver.findElement(By.name("birthday_day")).sendKeys("13");
        // click Dathof birth month
        driver.findElement(By.name("birthday_month")).sendKeys("Aug");
        // click Dathof birth Day 
        driver.findElement(By.name("birthday_year")).sendKeys("1997");
        // click Gender 
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]")).click();
        // click Signup  
        driver.findElement(By.name("websubmit")).click();
        Timesleep.Waiting(3000);
        driver.navigate().to("https://www.rokomari.com/book");
        Timesleep.Waiting(8000);
        return driver;
	}

	public static void TC_3_3_signup_info() {
		WebDriver driver = TC_3_1_signup_facebook();
		
		driver.findElement(By.linkText("Sign in")).click();
        Timesleep.Waiting(2000);
        //click Signup button 
        driver.findElement(By.xpath("/html/body/div[3]/div/section/div[2]/div[1]/p[2]")).click();
        Timesleep.Waiting(3000);
        driver.findElement(By.id("nm")).sendKeys("Israfil");
        driver.findElement(By.id("js-email")).sendKeys("obujbalok467@gmail.com");
        driver.findElement(By.id("js-phone")).sendKeys("01723560254");
        driver.findElement(By.id("pwd")).sendKeys("18378442Jony");
        Timesleep.Waiting(15000);
        driver.findElement(By.xpath("//*[@id='accountForm']/button")).click();
        Timesleep.Waiting(10000);

	}
}
