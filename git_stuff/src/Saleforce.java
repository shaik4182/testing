import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Saleforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shaik Shameer\\AppData\\Local\\Programs\\Python\\Python37\\Scripts\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
// validating login details
		
	
//		driver.get("https://app.astropay.com/login");
//		driver.findElement(By.xpath("//input[contains(@id,'phone')]")).sendKeys("9985957077");
		
		driver.get("https://test.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("shaik");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("Login")).click();
	System.out.println(driver.findElement(By.id("error")).getText());
	
	
	driver.close();
				
		
		
		
		

	}

}
