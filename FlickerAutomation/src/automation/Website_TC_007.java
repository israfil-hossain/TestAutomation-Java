package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Website_TC_007 {
	public static void UploaderTest() {
		WebDriver driver=Website_TC_002.Signin();
        //Click Uploader Button 
        WebElement Ubutton = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/ul[2]/li[2]/a/i"));
        Ubutton.click() ;
        Timesleep.Waiting(3000);
        
        //Click Choose Photos Button 
        // get file path
        String file_path = "C:\\Users\\israf\\OneDrive\\Pictures\\Flutter\\headphone.jpg"; 
        WebElement fillup = driver.findElement(By.id("choose-photos-and-videos"));
        fillup.sendKeys(file_path);
        Timesleep.Waiting(4000); 
        // Click Update Button 
        WebElement publish = driver.findElement(By.id("action-publish"));
        publish.click();
        // Confirm Publish 
        WebElement clickpublish = driver.findElement(By.id("confirm-publish"));
        clickpublish.click();
        Timesleep.Waiting(10000); 
	}
}
