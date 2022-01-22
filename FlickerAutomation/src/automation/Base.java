package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	@SuppressWarnings("deprecation")
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		
		WebDriver wdriver = new ChromeDriver();
		wdriver.manage().window().maximize();
		wdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return wdriver;
	}
}
