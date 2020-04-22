package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown2 {

	static WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
	}
	public static void main(String[] args) throws Exception {
		driver.findElement(By.xpath("//input[contains(@name,'ctl00_mainContent_ddl_originStation1_CTXT')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[contains(text(),'Goa')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[contains(text(),'Kochi')]")).click();
		driver.close();
	}

}
