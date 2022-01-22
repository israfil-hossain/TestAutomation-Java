package rokomari.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class Website_TC_004 {
	public static WebDriver signin() {
		WebDriver driver = Website_TC_001.Homepage();
		// remove pop-up msg 
		driver.findElement(By.xpath("//*[@id=\"js--entry-popup\"]/div[1]/button")).click();
		driver.findElement(By.linkText("Sign in")).click();
		Timesleep.Waiting(4000);
		// Fillup email box 
        driver.findElement(By.id("j_username")).sendKeys("obujbalok467@gmail.com");
        Timesleep.Waiting(4000);
        // Fillup Password box
        driver.findElement(By.name("j_password")).sendKeys("18378442Jony");
        Timesleep.Waiting(4000);
        driver.findElement(By.xpath("/html/body/div[3]/div/section/div[2]/div[2]/form/button")).click();
        Timesleep.Waiting(4000);
        
        return driver;
		
	}

	public static WebDriver TC_4_1_My_account() {
		WebDriver driver = signin();
		//Click profile button 
        driver.findElement(By.xpath("/html/body/header/div/div/div/div/div[3]/div/div[3]/a")).click();
        Timesleep.Waiting(2000);
        // click My account 
        driver.findElement(By.xpath("/html/body/header/div/div/div/div/div[3]/div/div[3]/div/a[1]")).click();
        Timesleep.Waiting(2000);
        // click change information 
        driver.findElement(By.id("js--edit-personal")).click();
        Timesleep.Waiting(2000); 
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("Israfil");
        Timesleep.Waiting(2000); 
        driver.findElement(By.name("dob")).sendKeys("08/13/1997");
        Timesleep.Waiting(2000);
        driver.findElement(By.xpath("//*[@id='my-account']/div/div/div[2]/main/section/form[1]/div[3]/div[2]")).click();
        Timesleep.Waiting(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/main/section/form[1]/input")).click();
        Timesleep.Waiting(2000);
        driver.findElement(By.id("js--edit-mobile")).click();
        driver.findElement(By.name("phone")).sendKeys("01723560254");
        driver.findElement(By.xpath("//*[@id='phoneNumber']")).click();
        Timesleep.Waiting(5000);
        driver.findElement(By.id("js--change-email")).click();
        driver.findElement(By.name("email")).sendKeys("obujbalok467@gmail.com");
        driver.findElement(By.xpath("//*[@id='emailAddress']")).click();
        Timesleep.Waiting(5000);
        driver.findElement(By.id("js--edit-image")).click();
        // get file path
        String file_path = "C:\\Users\\israf\\OneDrive\\Pictures\\Flutter\\headphone.jpg";
        driver.findElement(By.xpath("//*[@id='photo']")).sendKeys(file_path);
        Timesleep.Waiting(3000);
        driver.findElement(By.xpath("//*[@id='imageInfo']")).click();
        Timesleep.Waiting(5000); 
        
        return driver;
	}
	public static WebDriver TC_4_2_My_Orders() {
		WebDriver driver = TC_4_1_My_account();
		//Click profile button 
		driver.findElement(By.xpath("/html/body/header/div/div/div/div/div[3]/div/div[3]/a")).click();
		Timesleep.Waiting(3000);
        // click my orders 
        driver.findElement(By.xpath("/html/body/header/div/div/div/div/div[3]/div/div[3]/div/a[2]")).click();
        Timesleep.Waiting(5000);
        
        return driver ;
	}
	public static WebDriver TC_4_3_My_List() {
		WebDriver driver = TC_4_2_My_Orders();
		//Click profile button 
		driver.findElement(By.xpath("/html/body/header/div/div/div/div/div[3]/div/div[3]/a")).click();
		Timesleep.Waiting(3000);
        // click my list
		driver.findElement(By.xpath("/html/body/header/div/div/div/div/div[3]/div/div[3]/div/a[3]")).click();
		Timesleep.Waiting(3000);
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/main/section/div[1]/a/button")).click();
		Timesleep.Waiting(3000);
		
		driver.findElement(By.name("nm")).sendKeys("Booklist") ;
		Timesleep.Waiting(3000);
		driver.findElement(By.name("dtl")).sendKeys("This is My BookList for Python and Programming");
		Timesleep.Waiting(3000);
        
        driver.findElement(By.xpath("//*[@id='products']")).sendKeys("Python");
        // For manual select products 
        Timesleep.Waiting(8000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/main/section/div[2]/form/div[6]/input[2]")).click(); 
        Timesleep.Waiting(10000);
        
        return driver;

	}
	public static WebDriver TC_4_4_My_Wishlist() {
		
		WebDriver driver = TC_4_3_My_List();
		//Click profile button 
		driver.findElement(By.xpath("/html/body/header/div/div/div/div/div[3]/div/div[3]/a")).click();
		Timesleep.Waiting(3000);
        // click Wishlist
        driver.findElement(By.xpath("/html/body/header/div/div/div/div/div[3]/div/div[3]/div/a[4]")).click();
        Timesleep.Waiting(5000);
		
		return driver;
	}
	public static WebDriver TC_4_5_My_rating() {
		
		WebDriver driver = TC_4_4_My_Wishlist();
		//Click profile button 
		driver.findElement(By.xpath("/html/body/header/div/div/div/div/div[3]/div/div[3]/a")).click();
		Timesleep.Waiting(3000);
        // click rating 
        driver.findElement(By.xpath("/html/body/header/div/div/div/div/div[3]/div/div[3]/div/a[5]")).click();
        Timesleep.Waiting(5000);
		
		return driver;
	}
	public static WebDriver TC_4_6_My_points() {
		
		WebDriver driver = TC_4_5_My_rating();
		//Click profile button 
		driver.findElement(By.xpath("/html/body/header/div/div/div/div/div[3]/div/div[3]/a")).click();
		Timesleep.Waiting(3000);
        // click points
        driver.findElement(By.xpath("/html/body/header/div/div/div/div/div[3]/div/div[3]/div/a[6]")).click();
        Timesleep.Waiting(5000);
		
		return driver;
	}
	public static WebDriver TC_4_7_signout() {
		
		WebDriver driver = TC_4_6_My_points();
		//Click profile button 
		driver.findElement(By.xpath("/html/body/header/div/div/div/div/div[3]/div/div[3]/a")).click();
		Timesleep.Waiting(3000);
        // click signouts
        driver.findElement(By.xpath("/html/body/header/div/div/div/div/div[3]/div/div[3]/div/a[7]")).click();
        Timesleep.Waiting(5000);
        driver.navigate().to("https://www.rokomari.com/book");
		
		return driver;
	}
		
	
}
