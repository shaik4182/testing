import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
// import org.testng.Assert;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shaik Shameer\\AppData\\Local\\Programs\\Python\\Python37\\Scripts\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		
// dropdown with select tag, Means Static dropdowns
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(staticDropdown);
		
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		   
		
// Update  dropdowns:
		
		driver.findElement(By.id("divpaxinfo")).click(); // opening dropdown
		Thread.sleep(1000);
	
	/* for clicking four times here written 4 times if i want click 20 times then how 
		so that below i written while loop 
		now here comment all code that i written 4 times ok */
		
//		driver.findElement(By.id("hrefIncAdt")).click();
//		driver.findElement(By.id("hrefIncAdt")).click();
//		driver.findElement(By.id("hrefIncAdt")).click();
//		driver.findElement(By.id("hrefIncAdt")).click();
		
		
		  // here i want to click five times
		 int i = 1;
		 while (i<5)  //  clicking 4 times on Adult(+)
		 {
			 driver.findElement(By.id("hrefIncAdt")).click(); // clicking 4 times here increasing
			 i++;
		 }
			driver.findElement(By.id("btnclosepaxoption")).click(); // click on Done button
		
		// here i want to decrease 2 times
			
		driver.findElement(By.id("divpaxinfo")).click(); // opening dropdown
		
		Thread.sleep(1000);
		int de =1;
		while(de<3) //  clicking 2 times on Adult(-)
		{
			driver.findElement(By.id("hrefDecAdt")).click(); // clicking 2 times but it is decresing
			de++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click(); // click on Done button
		
		
		driver.findElement(By.id("divpaxinfo")).click(); // opening dropdown
		Thread.sleep(1000);
		for(int chi=0;chi<4;chi++) // clicking 5 times on child(+)
		{
			driver.findElement(By.id("hrefIncChd")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click(); // click on Done button
		
		
		driver.findElement(By.id("divpaxinfo")).click(); // opening dropdown
		Thread.sleep(1000);
		for(int chd=0;chd<2;chd++) // clicking 2 times on child(-)
		{
			
			driver.findElement(By.id("hrefDecChd")).click();
		}
		
		
		driver.findElement(By.id("hrefIncInf")).click();
		
		driver.findElement(By.id("btnclosepaxoption")).click(); // click on Done button
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
// Dynamic dropdown 
		
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
	
		
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).clear();
		Thread.sleep(1000);
		
		// xpath is like parent child combination
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();
		
	     //  "(//a[@value='DEL'])[2]"  this index xpath for above code DELHI
		
// calendar selecting current date every time
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		Thread.sleep(1000);
		
// selecting round trip after that we checking whether dates table is enabled or disable
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
	/* actually above statement have to false but it is giving True, 
		   because when click on above line it is enabling so that it showing True. To handle this we using
		    check point */
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		// checking enable or disable
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());

		if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("1"))
		{
			System.out.println("It is Enabled");
				Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		Thread.sleep(2000);
		driver.close();

	}

}
