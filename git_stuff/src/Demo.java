import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// selenium code
		// Create driver object for Chrome Browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shaik Shameer\\AppData\\Local\\Programs\\Python\\Python37\\Scripts\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle()); // validating title of the page
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl()); // validating url
		// System.out.println(driver.getPageSource());
		
		driver.get("https://yahoo.com");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		// driver.navigate().forward();
		
		driver.close(); // It closes current browser
	//	driver.quit(); // It closes all browser opened by selenium
	}

}
