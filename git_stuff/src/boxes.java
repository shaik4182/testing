
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.Keys;


public class boxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shaik Shameer\\AppData\\Local\\Programs\\Python\\Python37\\Scripts\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/"); // open browser
		driver.manage().window().maximize();




		
	// Checkboxes 1.Check the box 2.verifying whether check or uncheck
			
			System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected()); /*
			checking it is checked or not, if not it show false           */
		    driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		    System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());/*
			checking it is checked or not, if not it show True          */
		    
	// here i am counting how many checkboxes are there
		    System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		    
		    Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(),6);
		   
		    
// Assertion
		    // below fail because above already in check but below i written 44th False so it fails test
	       Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		    driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		    Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		    
		    
	    
	}

}