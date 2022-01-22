package automation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Website_TC_002{

	@SuppressWarnings("deprecation")
	public static WebDriver Signin(){
	
		WebDriver driver = Website_TC_001.Homepage();
		
        // Click Login Button 
		WebElement Login = driver.findElement(By.linkText("Log In"));
		Login.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        // Fillup Email TextBox 
        WebElement Txtbox = driver.findElement(By.id("login-email"));
        Txtbox.sendKeys("israfilhossain166091@gmail.com");
        
        //Click Next Button
        WebElement Nxt = driver.findElement(By.xpath("//*[@id='login-form']/button/span"));
        Nxt.click() ;
        
        //Fillup password TextBox 
        WebElement Psd = driver.findElement(By.id("login-password"));
        Psd.sendKeys("123456789abc");
        
        // Click Login Button 
        WebElement Btn = driver.findElement(By.xpath("//*[@id='login-form']/button"));
        Btn.click();
        
        Timesleep.Waiting(5000);
        
        return driver;
		
	}
	public static WebDriver logout() {
		WebDriver driver = Website_TC_002.Signin();
		// Click Profile button
        WebElement profile = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/ul[2]/li[4]/div/div/div/a/div"));
        profile.click();
        //Click Logout Button
        WebElement logout = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div/section[3]/ul/li[4]/a"));
        logout.click();
        
        driver.navigate().to("https://www.flickr.com/");
        
        return driver;
	}
}
