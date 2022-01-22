package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Website_TC_008 {

	public static WebDriver TC_8_1_PhotoSearch() {
		WebDriver driver=Website_TC_002.Signin();

        //Click Search Button 
        driver.findElement(By.id("search-field")).click();
        driver.findElement(By.id("search-field")).sendKeys("Planet Stories Vol. 1, No. 9 ");
        Timesleep.Waiting(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/ul[2]/li[1]/div/form/label/input")).click();
        Timesleep.Waiting(4000);
        driver.get("https://www.flickr.com/photos/57440551@N03/15847648542/in/photolist-q9pkMG-VGEoLc-2msiX4D-5YK2Je-2j1SNKo-2i8QH9J-2kLxr5q-2kLBT2g-7yQQHp-2kLBvgm-2kLBvf4-2kmYzth-2kmxXzs-2hBpzUY-2dgYuDq-2kLwVmN-2b95Cx9-2kLBKZa-2kLB6jy-2kLxjwf-2kLxf8f-2kLB9HH-2kLB9Hh-2kLBjc3-2kLBvh3-2kLxJqs-2kLBNNB-2kLB91B-2kLxbmT-2kLBd6p-2kLB93v-2kLwVgs-2kLBurB-2kLAQ7E-2kLB8ZE-2i8TeY8-2kLBt4F-2kLBmG2-2kLx6gc-2kLxf6G-2kLBDL3-2kLB3pv-2kLButW-2kLAQ8X-2kLB1TV-2kLBja9-2kLxJt8-2kLBvgB-2kLxJsr-2dgKFdC");
        return driver;
	}
			
	public static WebDriver TC_8_2_PhotoLike() {
		//remove popup msg 
		WebDriver driver = TC_8_1_PhotoSearch();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div/div/div/div/div[2]/a")).click();
        Timesleep.Waiting(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[5]/div[1]/div")).click();
        Timesleep.Waiting(3000);
        return driver;
	}
	public static WebDriver TC_8_3_PhotoaddtoGalary(){
		WebDriver driver = TC_8_2_PhotoLike();
		// click galaries 
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[5]/span")).click();
		Timesleep.Waiting(3000);
		// create new galaries 
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div[3]/button")).click();
        Timesleep.Waiting(3000);
        // galary name
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/div[1]/input")).sendKeys("My Book");
        Timesleep.Waiting(3000);
        //galary description 
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/textarea")).sendKeys("This is my book galary ");
        Timesleep.Waiting(3000);
        // create 
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/div[2]/div[2]/button[2]")).click();
        Timesleep.Waiting(3000);
        
        return driver;
	}
	public static WebDriver TC_8_4_PhotoShare() {
		WebDriver driver = TC_8_3_PhotoaddtoGalary();
		// click photo share
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[5]/div[2]/div/span")).click();
        Timesleep.Waiting(3000);
        // click cancel button 
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]")).click();
        Timesleep.Waiting(3000);
        return driver;
	}
	public static WebDriver TC_8_5_PhotoDownload() {
		WebDriver driver = TC_8_4_PhotoShare();
		//click Download button 
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[5]/div[3]")).click();
        Timesleep.Waiting(3000);
        // click 
        driver.findElement(By.xpath("/html/body/div[2]/div[1]")).click();
        Timesleep.Waiting(3000);
        
        return driver;
	}
	public static WebDriver TC_8_6_PhotoComment() {
		WebDriver driver = TC_8_5_PhotoDownload();
		// Fillup comment box 
        driver.findElement(By.name("comment")).sendKeys("This is amazing Book") ;
        Timesleep.Waiting(3000);
        //click comment 
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/div[1]/div[4]/div/button")).click();
        Timesleep.Waiting(3000);
        
        return driver;
	}
	public static WebDriver TC_8_9_Follow() {
		WebDriver driver = TC_8_6_PhotoComment();
        //click follow
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/div[1]/div[1]/div/div/span/button/span")).click();
        Timesleep.Waiting(10000);
        driver.close();
        driver.quit();
        System.out.println("Flicker.com Automation Test Complete ");
        return driver;
	}
	        
}
