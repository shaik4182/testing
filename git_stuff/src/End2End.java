import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End2End {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shaik Shameer\\AppData\\Local\\Programs\\Python\\Python37\\Scripts\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(1000);

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
			}
		}

		// check box
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		// driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).clear();
		Thread.sleep(1000);

		// xpath is like parent child combination
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']"))
				.click();

		// selecting current date
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		// verifying return date is disable or not
		if (driver.findElement(By.id("Div1")).getAttribute("Style").contains("0.5")) {
			System.out.println("It is Disabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		// selecting how many members		
		driver.findElement(By.id("divpaxinfo")).click(); // opening dropdown
		Thread.sleep(1000);

		// here i want to click four times
		int i = 1;
		while (i < 5) // clicking 4 times on Adult(+)
		{
			driver.findElement(By.id("hrefIncAdt")).click(); // clicking 4 times here increasing
			i++;
		}

		// here i want to decrease 2 times

		Thread.sleep(1000);
		int de = 1;
		while (de < 3) // clicking 2 times on Adult(-)
		{
			driver.findElement(By.id("hrefDecAdt")).click(); // clicking 2 times but it is decresing
			de++;
		}

		// selecting child
		Thread.sleep(1000);
		for (int chi = 0; chi < 4; chi++) // clicking 5 times on child(+)
		{
			driver.findElement(By.id("hrefIncChd")).click();
		}
		Thread.sleep(1000);

		driver.findElement(By.id("hrefIncInf")).click();

		driver.findElement(By.id("btnclosepaxoption")).click(); // click on Done button

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		// selecting currency
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select dropdown = new Select(staticDropdown);
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		// clicking on search button
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

		driver.close();

	}
}
