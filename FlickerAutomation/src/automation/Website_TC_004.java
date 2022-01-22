package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Website_TC_004 {

	public static WebDriver TC_4_1_Upload_Photo() {
		WebDriver driver = Website_TC_002.Signin();
		//Click Profile button
        WebElement profile = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/ul[2]/li[4]/div/div/div/a/div"));
        profile.click();
        // Click Upload Photos
        driver.findElement(By.linkText("Upload your photos")).click();
        Timesleep.Waiting(3000);
        // Click Choose Photos Button 
        // get file path
        String file_path = "C:\\Users\\israf\\OneDrive\\Pictures\\Flutter\\headphone.jpg"; 

        driver.findElement(By.id("choose-photos-and-videos")).sendKeys(file_path);
        Timesleep.Waiting(5000);
        
        // Update Button 
        driver.findElement(By.id("action-publish")).click();
        //Confirm Publish 
        driver.findElement(By.id("confirm-publish")).click();
        Timesleep.Waiting(10000);
		return driver;
	}
	public static WebDriver TC_4_2_MailClassTest() {
		WebDriver driver = TC_4_1_Upload_Photo();
		// Click Profile button
		WebElement profile = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/ul[2]/li[4]/div/div/div/a/div"));
        profile.click();
        // Click Mail Button
        WebElement mail = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div/section[3]/ul/li[1]/a"));
        mail.click();
        
        Timesleep.Waiting(5000);
        driver.navigate().to("https://www.flickr.com/");
        
        return driver;
        
	}
	
	public static WebDriver TC_4_3_SettingClassTest() {
		WebDriver driver = TC_4_2_MailClassTest();
		// Click Profile button
		WebElement profile = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/ul[2]/li[4]/div/div/div/a/div"));
        profile.click();
        // Click Setting Button
        WebElement setting = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div/section[3]/ul/li[2]/a"));
        setting.click();
        
        Timesleep.Waiting(5000);
        driver.navigate().to("https://www.flickr.com/");
        
        return driver;
        
	}
	
	public static WebDriver TC_4_4_HelpClassTest() {
		WebDriver driver = TC_4_3_SettingClassTest();
		// Click Profile button
		WebElement profile = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/ul[2]/li[4]/div/div/div/a/div"));
        profile.click();
        // Click Help Button
        WebElement help = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div/section[3]/ul/li[3]/a"));
        help.click();
        
        Timesleep.Waiting(5000);
        driver.navigate().to("https://www.flickr.com/");
        
        return driver;
        
	}
	
	public static WebDriver TC_4_6_SignoutClassTest() {
		WebDriver driver = TC_4_4_HelpClassTest();
		// Click Profile button
		WebElement profile = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/ul[2]/li[4]/div/div/div/a/div"));
        profile.click();
        // Click logout Button
        WebElement logout = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div/section[3]/ul/li[4]/a"));
        logout.click();
        
        Timesleep.Waiting(5000);
        driver.navigate().to("https://www.flickr.com/");
        
        return driver;
        
	}
	
	
}
