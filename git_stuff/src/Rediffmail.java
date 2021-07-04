import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Rediffmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shaik Shameer\\AppData\\Local\\Programs\\Python\\Python37\\Scripts\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
// Locators using Regular expression of css and xpath
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click(); // css Regular expression
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("shaik@gmail.com");
		driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("123456");
		
		driver.findElement(By.cssSelector("input[value*='Sign in']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='div_login_error']")).getText());
		
		
		driver.close();
		
		
		
	}
	
}