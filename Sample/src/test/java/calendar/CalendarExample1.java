package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample1 {

	static WebDriver driver;

	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
	}
	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[contains(@name,'ctl00_mainContent_ddl_originStation1_CTXT')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[contains(text(),'Goa')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[contains(text(),'Kochi')]")).click();
		if(driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).isEnabled())
			driver.findElement(By.xpath("//a[contains(@class,'state-highlight ui-state-active')]")).click();
		if(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Calendar disabled");
		}
		Thread.sleep(4000);
		driver.close();

	}

}
