package rokomari.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class Website_TC_002 {
	public static WebDriver TC_2_1_signin_facebook(){
	
		WebDriver driver = Website_TC_001.Homepage();
		
		// Remove Pop-up message 
        driver.findElement(By.xpath("//*[@id='js--entry-popup']/div[1]/button")).click();
        //Click Sign-in button 
        driver.findElement(By.linkText("Sign in")).click();
        Timesleep.Waiting(3000);
        // Click Facebook button 
        driver.findElement(By.xpath("//*[@id='js--login-form']/div[1]/div/button[1]")).click();
        Timesleep.Waiting(3000);
        //Fill-up Email box 
        driver.findElement(By.id("email")).sendKeys("jonyakash45@gmail.com");
        Timesleep.Waiting(3000);
        //Fill-up Password box 
        driver.findElement(By.id("pass")).sendKeys("11111111");
        Timesleep.Waiting(3000);
        // Click Loginbutton 
        driver.findElement(By.id("loginbutton")).click();
        Timesleep.Waiting(3000);
        driver.navigate().to("https://www.rokomari.com/book");
        Timesleep.Waiting(8000);
        return driver;
		
	}
	public static WebDriver TC_2_2_signin_google() {
		WebDriver driver = TC_2_1_signin_facebook();
		driver.findElement(By.linkText("Sign in")).click();
		Timesleep.Waiting(4000);
        driver.findElement(By.xpath("//*[@id='js--login-form']/div[1]/div/button[2]")).click();
        Timesleep.Waiting(4000);
        driver.findElement(By.name("identifier")).sendKeys("obujbalok467@gmail.com");
        driver.findElement(By.className("VfPpkd-vQzf8d")).click();
        Timesleep.Waiting(3000);
        driver.navigate().to("https://www.rokomari.com/book");
        Timesleep.Waiting(8000);
        return driver;
		
	}
	public static WebDriver TC_2_3_signin_mail() {
		WebDriver driver = TC_2_2_signin_google();
		driver.findElement(By.linkText("Sign in")).click();
		Timesleep.Waiting(4000);
		// Fillup email box 
        driver.findElement(By.id("j_username")).sendKeys("obujbalok467@gmail.com");
        Timesleep.Waiting(4000);
        // Fillup Password box
        driver.findElement(By.name("j_password")).sendKeys("18378442Jony");
        Timesleep.Waiting(4000);
        driver.findElement(By.xpath("/html/body/div[3]/div/section/div[2]/div[2]/form/button")).click();
        Timesleep.Waiting(10000);
        
        return driver;
	}

}
